import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ShipDeployment extends JFrame implements MouseMotionListener, KeyListener{

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
	
	int turn =1;
	
	MyGridListener myListener = new MyGridListener();
	OtherGridListener otherListener = new OtherGridListener();
	
	private void initMyGrid() {
		
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				myGameGrid[i][j] = new GameLable();
				myGameGrid[i][j].setXPos(i);
				myGameGrid[i][j].setYPos(j);
				myGameGrid[i][j].setBounds(new Rectangle(16+42*(i-1), 42+42*(j-1), 42, 42));
				myGameGrid[i][j].setText(i+","+j);
				myGameGrid[i][j].addMouseListener(myListener);
				myGameGrid[i][j].addMouseMotionListener(ShipDeployment.this);
				myGameGrid[i][j].addKeyListener(ShipDeployment.this);
				this.getContentPane().add(myGameGrid[i][j]);
			}
		}
	}
	private void initOtherGrid() {
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				otherGameGrid[i][j] = new GameLable();
				otherGameGrid[i][j].setXPos(i);
				otherGameGrid[i][j].setYPos(j);
				otherGameGrid[i][j].setBounds(new Rectangle(600+42*(i-1), 42+42*(j-1), 42, 42));
				otherGameGrid[i][j].setText(i+","+j);
				otherGameGrid[i][j].addMouseListener(otherListener);
				//myGameGrid[i][j].addMouseMotionListener(ShipDeployment.this);
				//myGameGrid[i][j].addKeyListener(ShipDeployment.this);
				this.getContentPane().add(otherGameGrid[i][j]);
			}
		}
	}
	private void putMyGrid() {
		for(int j=1; j<=10; j++){
			for(int i=1; i<=10; i++){
				this.getContentPane().add(myGameGrid[i][j]);
			}
		}
	}
	private void fillMyGrid() {
		initMyGrid();
		putMyGrid();
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
			rdAc.setText("Aircrattarier");
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
			rdBs.setText("BattleShip");
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
			rdFr.setText("Frigate");
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
			rdSm.setText("Submarine");
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
			rdMs.setText("Minesweeper");
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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This is the default constructor
	 */
	public ShipDeployment() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(1072, 541);
		this.setContentPane(getJContentPane());
		fillMyGrid();
		this.setTitle("Ship Deployment");
		this.setVisible(true);
		this.addKeyListener(this);
		this.requestFocus();
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getRdAc(), null);
			jContentPane.add(getRdBs(), null);
			jContentPane.add(getRdFr(), null);
			jContentPane.add(getRdSm(), null);
			jContentPane.add(getRdMs(), null);
			jContentPane.add(getBtnStart(), null);
			jContentPane.add(getBtnClear(), null);
			jContentPane.addKeyListener(ShipDeployment.this);
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
				requestFocus();
			} else {
				JOptionPane.showMessageDialog(ShipDeployment.this, "Select a Ship First");
				requestFocus();
			}
			
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class OtherGridListener implements MouseListener {

		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public void mouseMoved(MouseEvent arg0) {
		if((!toSelectDirection || !toConfirm) && (selectedShip != null)){
			System.out.println(ship.getType());
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
		// TODO Auto-generated method stub
		
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
					JOptionPane.showMessageDialog(ShipDeployment.this,"There is Another Ship On Place");
				}
				
				
			}
		}
			
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void drawShip(Ship sh) {
		int k = 1;
		switch(sh.getDirection()){
			case Ship.DIRECTION_RIGHT:
				for(int i=sh.getXStart(); i<sh.getXStart()+sh.getLength(); i++){
					myGameGrid[i][sh.getYStart()].setText(""+k);
					myGameGrid[i][sh.getYStart()].setPosOnShip(k);
					k++;
				}
				break;
			case Ship.DIRECTION_LEFT:
				for(int i=sh.getXStart() - sh.getLength() + 1; i<=sh.getXStart(); i++){
					myGameGrid[i][sh.getYStart()].setText(""+k);
					myGameGrid[i][sh.getYStart()].setPosOnShip(k);
					k++;
				}
				break;
			case Ship.DIRECTION_DOWN:
				for(int i=sh.getYStart(); i<sh.getYStart()+sh.getLength(); i++){
					myGameGrid[sh.getXStart()][i].setText(""+k);
					myGameGrid[sh.getXStart()][i].setPosOnShip(k);
					k++;
				}
				break;
			case Ship.DIRECTION_UP:
				for(int i=sh.getYStart() - sh.getLength() + 1; i<=sh.getYStart(); i++){
					myGameGrid[sh.getXStart()][i].setText(""+k);
					myGameGrid[sh.getXStart()][i].setPosOnShip(k);
					k++;
				}
				break;
		}
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

}  //  @jve:decl-index=0:visual-constraint="215,14"
