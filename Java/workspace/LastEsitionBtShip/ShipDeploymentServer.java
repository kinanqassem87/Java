import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class ShipDeploymentServer extends UnicastRemoteObject implements Play, MouseMotionListener, KeyListener{
	
	private JFrame frame;
	private JPanel jContentPane = null;
	private JRadioButton rdAc = null;
	private JRadioButton rdBs = null;
	private JRadioButton rdFr = null;
	private JRadioButton rdSm = null;
	private JRadioButton rdMs = null;
	private JButton btnStart = null;
	private JButton btnClear = null;
	private ButtonGroup bgroup = new ButtonGroup();
	private GameLable[][] myGameGrid = new GameLable[11][11];
	private GameLable[][] otherGameGrid = new GameLable[11][11];
	private String selectedShip = null;
	private Ship ship = new Ship(); 
	private boolean toSelectDirection = false;
	private boolean toConfirm = false;
	private boolean connected = false;
	Play other;
	int turn = 1;
	
	MyGridListener myListener = new MyGridListener();
	OtherGridListener otherListener = new OtherGridListener();
	private JLabel lblPeiceEnd = null;
	
	
	private void initMyGrid() {
		
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				myGameGrid[i][j] = new GameLable();
				myGameGrid[i][j].setXPos(i);
				myGameGrid[i][j].setYPos(j);
				myGameGrid[i][j].setMine(true);
				myGameGrid[i][j].setBounds(new Rectangle(16+42*(i-1), 42+42*(j-1), 42, 42));
				myGameGrid[i][j].addMouseListener(myListener);
				myGameGrid[i][j].addMouseMotionListener(ShipDeploymentServer.this);
				myGameGrid[i][j].addKeyListener(ShipDeploymentServer.this);
				myGameGrid[i][j].reDraw();
				frame.getContentPane().add(myGameGrid[i][j]);
			}
		}
	}
	private void initOtherGrid() {
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				otherGameGrid[i][j] = new GameLable();
				otherGameGrid[i][j].setXPos(i);
				otherGameGrid[i][j].setYPos(j);
				otherGameGrid[i][j].setBounds(new Rectangle(650+42*(i-1), 42+42*(j-1), 42, 42));
				otherGameGrid[i][j].addMouseListener(otherListener);
				otherGameGrid[i][j].reDraw();
				frame.getContentPane().add(otherGameGrid[i][j]);
			}
		}
		frame.repaint();
	}

	/**
	 * This method initializes rdAc	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdAc() {
		if (rdAc == null) {
			rdAc = new JRadioButton();
			rdAc.setBounds(new java.awt.Rectangle(8,16,105,17));
			rdAc.setText("AC_5P");
			rdAc.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(rdAc.isSelected()){
						selectedShip = Ship.TYPE_AIRCRATTCARRIER;
					}
						
				}
			});
			bgroup.add(rdAc);
		}
		return rdAc;
	}

	/**
	 * This method initializes rdBs	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdBs() {
		if (rdBs == null) {
			rdBs = new JRadioButton();
			rdBs.setBounds(new java.awt.Rectangle(112,16,89,17));
			rdBs.setText("BS_4P");
			rdBs.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(rdBs.isSelected())
						selectedShip = Ship.TYPE_BATTLESHIP;
				}
			});
			bgroup.add(rdBs);
		}
		return rdBs;
	}

	/**
	 * This method initializes rdFr	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdFr() {
		if (rdFr == null) {
			rdFr = new JRadioButton();
			rdFr.setBounds(new java.awt.Rectangle(208,16,73,17));
			rdFr.setText("FR_3P");
			rdFr.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(rdFr.isSelected())
						selectedShip = Ship.TYPE_FRIGATE;
				}
			});
			bgroup.add(rdFr);
		}
		return rdFr;
	}

	/**
	 * This method initializes rdSm	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdSm() {
		if (rdSm == null) {
			rdSm = new JRadioButton();
			rdSm.setBounds(new java.awt.Rectangle(288,16,89,17));
			rdSm.setText("SM_3P");
			rdSm.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(rdSm.isSelected())
						selectedShip = Ship.TYPE_SUBMARINE;
				}
			});
			bgroup.add(rdSm);
		}
		return rdSm;
	}

	/**
	 * This method initializes rdMs	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdMs() {
		if (rdMs == null) {
			rdMs = new JRadioButton();
			rdMs.setBounds(new java.awt.Rectangle(384,16,105,17));
			rdMs.setText("MS_2P");
			rdMs.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(rdMs.isSelected())
						selectedShip = Ship.TYPE_MINESWEEPER;
				}
			});
			bgroup.add(rdMs);
		}
		return rdMs;
	}

	/**
	 * This method initializes btnStart	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnStart() {
		if (btnStart == null) {
			btnStart = new JButton();
			btnStart.setBounds(new java.awt.Rectangle(496,208,73,25));
			btnStart.setEnabled(false);
			btnStart.setText("Start");
			btnStart.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					btnClear.setEnabled(false);
					initOtherGrid();
					try {
						
						if(System.getSecurityManager() == null)
							System.setSecurityManager(new RMISecurityManager());
						Naming.rebind("//192.168.0.2/server", ShipDeploymentServer.this);
						
						//Naming.rebind("server", ShipDeploymentServer.this);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Server is ready");
					final Timer timer = new Timer();
					timer.scheduleAtFixedRate(new TimerTask(){

						
						public void run(){
							if(other==null){
								try{
									other = (Play) Naming.lookup("//192.168.0.1/client");									
									//other = (Play) Naming.lookup("client");
									JOptionPane.showMessageDialog(null, "Connection ok...");
									connected = true;
									timer.cancel();
								}catch(Exception ex){
									
								}
								
							}
							
						}
						
					}, 20000, 20000);
					
				}
			});
			
		}
		return btnStart;
	}

	/**
	 * This method initializes btnClear	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton();
			btnClear.setBounds(new java.awt.Rectangle(496,256,73,25));
			btnClear.setText("Clear");
			btnClear.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					btnStart.setEnabled(true);
					initMyGrid();
					
				}
			});
		}
		return btnClear;
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		new ShipDeploymentServer();
	}

	/**
	 * This is the default constructor
	 * @throws IOException 
	 */
	public ShipDeploymentServer() throws IOException {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		
		frame = new JFrame("Player 1");
		frame.setSize(1150, 541);
		frame.setContentPane(getJContentPane());
		initMyGrid();
		frame.setTitle("Ship Deployment");
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.requestFocus();
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblPeiceEnd = new JLabel();
			lblPeiceEnd.setBounds(new java.awt.Rectangle(733,13,265,25));
			lblPeiceEnd.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getRdAc(), null);
			jContentPane.add(getRdBs(), null);
			jContentPane.add(getRdFr(), null);
			jContentPane.add(getRdSm(), null);
			jContentPane.add(getRdMs(), null);
			jContentPane.add(getBtnStart(), null);
			jContentPane.add(getBtnClear(), null);
			jContentPane.add(lblPeiceEnd, null);
			jContentPane.addKeyListener(ShipDeploymentServer.this);
		}
		return jContentPane;
	}
	
	class MyGridListener  implements MouseListener {

		public void mouseClicked(MouseEvent arg0) {
			if(ship.getType() != null) {
				toSelectDirection = true;
				GameLable label = (GameLable) arg0.getSource();
				ship.setXStart(label.getXPos());
				ship.setYStart(label.getYPos());
				frame.requestFocus();
			} else {
				JOptionPane.showMessageDialog(frame, "Select a Ship First");
				frame.requestFocus();
			}
			
		}

		public void mousePressed(MouseEvent arg0) {
			
		}

		public void mouseReleased(MouseEvent arg0) {
			
		}

		public void mouseEntered(MouseEvent arg0) {
			
		}

		public void mouseExited(MouseEvent arg0) {
			
		}
		
	}
	
	class OtherGridListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			GameLable selected;
			selected = (GameLable)e.getComponent();
			if (connected && turn == 1 && selected.getCurrState() == null) {
				try {
					Result result = other.play(selected.getXPos(), selected.getYPos());
					if(result.getType() != null) {
						selected.setCurrState(GameLable.HITT);
						playSound("hit.wav");
					} else {
						selected.setCurrState(GameLable.MISSED);
						playSound("missed.wav");
						turn = 2;
					}
					if(result.isPieceEnd()) {
						lblPeiceEnd.setText(result.getType() + " sinked");
						playSound("sink.wav");
					} else {
						lblPeiceEnd.setText("");
					}
					selected.reDraw();
					frame.repaint();
					isFinish();
				} catch (RemoteException e1) {
					JOptionPane.showMessageDialog(frame, "Connection Failed");
					System.exit(0);
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(frame, "Harwdware Failed");
					System.exit(0);
				}
			}
		}

		public void mousePressed(MouseEvent arg0) {
			
		}

		public void mouseReleased(MouseEvent arg0) {
			
		}

		public void mouseEntered(MouseEvent arg0) {
			
		}

		public void mouseExited(MouseEvent arg0) {
			
		}
		
	}
	public void mouseMoved(MouseEvent arg0) {
		if((!toSelectDirection || !toConfirm) && (selectedShip != null)){
			GameLable label = (GameLable) arg0.getSource();
			if(Ship.TYPE_AIRCRATTCARRIER.equals(selectedShip)){
				ship.setType(Ship.TYPE_AIRCRATTCARRIER);
				ship.setLength(Ship.LENGTH_AIRCRATTCARRIER);	
			
			} else if(Ship.TYPE_BATTLESHIP.equals(selectedShip)){
				ship.setType(Ship.TYPE_BATTLESHIP);
				ship.setLength(Ship.LENGTH_BATTLESHIP);
			
			} else if(Ship.TYPE_FRIGATE.equals(selectedShip)){
				ship.setType(Ship.TYPE_FRIGATE);
				ship.setLength(Ship.LENGTH_FRIGATE);
			
			} else if(Ship.TYPE_SUBMARINE.equals(selectedShip)){
				ship.setType(Ship.TYPE_SUBMARINE);
				ship.setLength(Ship.LENGTH_SUBMARINE);
			
			} else if(Ship.TYPE_MINESWEEPER.equals(selectedShip)){
				ship.setType(Ship.TYPE_MINESWEEPER);
				ship.setLength(Ship.LENGTH_MINESWEEPER);
			}
			ship.setXStart(label.getXPos());
			ship.setYStart(label.getYPos());
			
			
		}
		
	}
	
	public void mouseDragged(MouseEvent arg0) {
		
	}
	
	public void keyTyped(KeyEvent arg0) {
		
		
	}

	public void keyPressed(KeyEvent arg0) {
		if(toSelectDirection){
			if(arg0.getKeyCode() == KeyEvent.VK_UP){
				if(ship.canTurnUp()){
					JOptionPane.showMessageDialog(null, "up");
					ship.setDirection(Ship.DIRECTION_UP);
					toConfirm = true;
				}
				
			} else if(arg0.getKeyCode() == KeyEvent.VK_DOWN){
				if(ship.canTurnDown()){
					JOptionPane.showMessageDialog(null, "down");
					ship.setDirection(Ship.DIRECTION_DOWN);
					toConfirm = true;
				}
			} else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
				if(ship.canTurnRight()){
					JOptionPane.showMessageDialog(null, "right");
					ship.setDirection(Ship.DIRECTION_RIGHT);
					toConfirm = true;
				}

			} else if(arg0.getKeyCode() == KeyEvent.VK_LEFT){
				if(ship.canTurnLeft()){
					JOptionPane.showMessageDialog(null, "left");
					ship.setDirection(Ship.DIRECTION_LEFT);
					toConfirm = true;
				}
			}
			
			
		}
		
		if(toConfirm){
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				if (canDrawShip(ship)) {
					if (Ship.TYPE_AIRCRATTCARRIER.equals(ship.getType())) {
						bgroup.remove(rdAc);
						rdAc.setSelected(false);
						rdAc.setEnabled(false);

					} else if (Ship.TYPE_BATTLESHIP.equals(ship.getType())) {
						bgroup.remove(rdBs);
						rdBs.setSelected(false);
						rdBs.setEnabled(false);

					} else if (Ship.TYPE_FRIGATE.equals(ship.getType())) {
						bgroup.remove(rdFr);
						rdFr.setSelected(false);
						rdFr.setEnabled(false);

					} else if (Ship.TYPE_SUBMARINE.equals(ship.getType())) {
						bgroup.remove(rdSm);
						rdSm.setSelected(false);
						rdSm.setEnabled(false);

					} else if (Ship.TYPE_MINESWEEPER.equals(ship.getType())) {
						bgroup.remove(rdMs);
						rdMs.setSelected(false);
						rdMs.setEnabled(false);
					}
					drawShip(ship);
					ship = new Ship();
					selectedShip = null;
					toConfirm = false;
					if(!rdAc.isEnabled() && !rdBs.isEnabled() && !rdFr.isEnabled() && !rdSm.isEnabled() && !rdMs.isEnabled()){
						btnStart.setEnabled(true);
					}
				} else {
					JOptionPane.showMessageDialog(frame,"There is Another Ship On Place");
				}
				
				
			}
		}
			
		
	}

	public void keyReleased(KeyEvent arg0) {
		
	}
	
	public void drawShip(Ship sh) {
		int k = 1;
		switch(sh.getDirection()){
			case Ship.DIRECTION_RIGHT:
				for(int i=sh.getXStart(); i<sh.getXStart()+sh.getLength(); i++){
					myGameGrid[i][sh.getYStart()].setPosOnShip(k);
					myGameGrid[i][sh.getYStart()].setType(sh.getType());
					myGameGrid[i][sh.getYStart()].setDirection(GameLable.HOR);
					myGameGrid[i][sh.getYStart()].reDraw();
					k++;
				}
				break;
			case Ship.DIRECTION_LEFT:
				for(int i=sh.getXStart() - sh.getLength() + 1; i<=sh.getXStart(); i++){
					myGameGrid[i][sh.getYStart()].setPosOnShip(k);
					myGameGrid[i][sh.getYStart()].setType(sh.getType());
					myGameGrid[i][sh.getYStart()].setDirection(GameLable.HOR);
					myGameGrid[i][sh.getYStart()].reDraw();
					k++;
				}
				break;
			case Ship.DIRECTION_DOWN:
				for(int i=sh.getYStart(); i<sh.getYStart()+sh.getLength(); i++){
					myGameGrid[sh.getXStart()][i].setPosOnShip(k);
					myGameGrid[sh.getXStart()][i].setType(sh.getType());
					myGameGrid[sh.getXStart()][i].setDirection(GameLable.VIR);
					myGameGrid[sh.getXStart()][i].reDraw();
					k++;
				}
				break;
			case Ship.DIRECTION_UP:
				for(int i=sh.getYStart() - sh.getLength() + 1; i<=sh.getYStart(); i++){
					myGameGrid[sh.getXStart()][i].setPosOnShip(k);
					myGameGrid[sh.getXStart()][i].setType(sh.getType());
					myGameGrid[sh.getXStart()][i].setDirection(GameLable.VIR);
					myGameGrid[sh.getXStart()][i].reDraw();
					k++;
				}
				break;
		}
		frame.repaint();
	}
	public boolean canDrawShip(Ship sh){
		switch(sh.getDirection()){
			case Ship.DIRECTION_RIGHT:
				for(int i=sh.getXStart(); i<sh.getXStart()+sh.getLength(); i++){
					if(myGameGrid[i][sh.getYStart()].getPosOnShip() != 0)
						return false;
				}
				break;
			case Ship.DIRECTION_LEFT:
				for(int i=sh.getXStart() - sh.getLength() + 1; i<=sh.getXStart(); i++){
					if(myGameGrid[i][sh.getYStart()].getPosOnShip() != 0)
						return false;
				}
				break;
			case Ship.DIRECTION_DOWN:
				for(int i=sh.getYStart(); i<sh.getYStart()+sh.getLength(); i++){
					if(myGameGrid[sh.getXStart()][i].getPosOnShip() != 0)
						return false;
				}
				break;
			case Ship.DIRECTION_UP:
				for(int i=sh.getYStart() - sh.getLength() + 1; i<=sh.getYStart(); i++){
					if(myGameGrid[sh.getXStart()][i].getPosOnShip() != 0)
						return false;
				}
				break;
		}
		return true;
	}
	public Result play(int x, int y) throws RemoteException, IOException {
		Result result = new Result();
		GameLable selected = myGameGrid[x][y];
		result.setType(selected.getType());
		result.setPosOnShip(selected.getPosOnShip());
		String message = "";
		if(selected.getType() != null){
			selected.setCurrState(GameLable.HITT);
			message += "A";
		} else {
			selected.setCurrState(GameLable.MISSED);
			message += "B";
			this.turn = 1;
		}
		if(selected.getType() != null)
			result.setPieceEnd(isPeiceEnd(selected.getType()));
		
		message += (x -1);
		message += (y-1);
		HwUtil.writeToFile(message);
		HwUtil.runExe();
		
		selected.reDraw();
		frame.repaint();
		isFinish();
		return result;
		
	}
	
	private boolean isPeiceEnd(String type) {
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				if(myGameGrid[i][j].getType() != null && myGameGrid[i][j].getType().equals(type) && myGameGrid[i][j].getCurrState()==null) {
					return false;
				}
			}
		}
		return true;
	}
	private void isFinish() {
		int sum1 = 0, sum2 = 0;
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				if(GameLable.HITT.equals(myGameGrid[i][j].getCurrState())){
					sum1++;
				}
				if(GameLable.HITT.equals(otherGameGrid[i][j].getCurrState())){
					sum2++;
				}
			}
		}
		if(sum1 == 17){
			JOptionPane.showMessageDialog(frame, "You Lose..");
			frame.dispose();
		}
		if(sum2 == 17){
			JOptionPane.showMessageDialog(frame, "You Win..");
			frame.dispose();
		}
	}
	
	public void playSound(String file) {
		try{
			AudioPlayer p = AudioPlayer.player;
			p.stop();
			AudioStream as = new AudioStream(new FileInputStream(file));
			p.start(as);
		}
		catch(IOException ex){
			ex.printStackTrace();
		} 
	}

}
