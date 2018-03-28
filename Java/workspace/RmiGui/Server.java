import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends UnicastRemoteObject implements NetGame,MouseListener{
	private JFrame frame;
	private JPanel jContentPane = null;
	private JLabel lb1 = null;
	private JLabel lb2 = null;
	private JLabel lb3 = null;
	private NetGame client;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server s = new Server();
		s.initialize();
	}

	/**
	 * This is the default constructor
	 * @throws RemoteException 
	 */
	public Server() throws RemoteException {
		super();
		try {
			Naming.rebind("//127.0.0.1/server", this);
			System.out.println("server is ready now");

		} catch (Exception e) {
			System.out.println("error");
		}
		
		
		//initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(300, 200);
		frame.setContentPane(getJContentPane());
		frame.setTitle("JFrame");
		frame.setVisible(true);
		initC();
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lb3 = new JLabel();
			lb3.setBounds(new java.awt.Rectangle(170,20,51,21));
			lb3.setName("lb3");
			lb3.setText("old");
			lb2 = new JLabel();
			lb2.setBounds(new java.awt.Rectangle(100,20,41,21));
			lb2.setName("lb2");
			lb2.setText("old");
			lb1 = new JLabel();
			lb1.setBounds(new java.awt.Rectangle(30,20,41,21));
			lb1.setName("lb1");
			lb1.setText("old");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lb1, null);
			jContentPane.add(lb2, null);
			jContentPane.add(lb3, null);
			
			lb1.addMouseListener(this);
			lb2.addMouseListener(this);
			lb3.addMouseListener(this);
		}
		return jContentPane;
	}

	
	public void initC(){
		try {
			
			client = (NetGame) Naming.lookup("//127.0.0.1/client");
			
		} catch (Exception e) {
			initC();
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		JLabel selected;
		
		
		selected = (JLabel)arg0.getComponent();
		
		selected.setIcon(new ImageIcon("green.jpg"));
		
		try {
			
			
			client.play(selected.getName());
			
		} catch (RemoteException e) {
			System.out.println("errrorrrrr");
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

	public void play(String seelected) throws RemoteException {
		System.out.println(""+seelected);
		
	}

}  //  @jve:decl-index=0:visual-constraint="57,11"
