import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class NewGame extends JFrame {

	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JRadioButton rdSingle = null;
	private JRadioButton rdTwoPls = null;
	ButtonGroup rdGroup = new ButtonGroup();
	private JButton btnStart = null;
	private JButton btnIns = null;
	private JButton btnExit = null;
	/**
	 * This method initializes rdSingle	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdSingle() {
		if (rdSingle == null) {
			rdSingle = new JRadioButton();
			rdSingle.setBounds(new java.awt.Rectangle(18,72,109,19));
			rdSingle.setSelected(true);
			rdSingle.setText("Single Player");
		}
		return rdSingle;
	}

	/**
	 * This method initializes rdTwoPls	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getRdTwoPls() {
		if (rdTwoPls == null) {
			rdTwoPls = new JRadioButton();
			rdTwoPls.setBounds(new java.awt.Rectangle(153,72,100,19));
			rdTwoPls.setText("Two Players");
		}
		return rdTwoPls;
	}

	/**
	 * This method initializes btnStart	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnStart() {
		if (btnStart == null) {
			btnStart = new JButton();
			btnStart.setBounds(new java.awt.Rectangle(45,117,181,28));
			btnStart.setText("Start New Game");
			btnStart.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new Game();
					dispose();
				}
			});
		}
		return btnStart;
	}

	/**
	 * This method initializes btnIns	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnIns() {
		if (btnIns == null) {
			btnIns = new JButton();
			btnIns.setBounds(new java.awt.Rectangle(45,153,181,28));
			btnIns.setText("Instructions");
			btnIns.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JOptionPane.showMessageDialog(null, "is preparing");
				}
			});
		}
		return btnIns;
	}

	/**
	 * This method initializes btnExit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton();
			btnExit.setBounds(new java.awt.Rectangle(45,189,181,28));
			btnExit.setText("Exit");
			btnExit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return btnExit;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewGame();
	}

	/**
	 * This is the default constructor
	 */
	public NewGame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(306, 259);
		this.setContentPane(getJContentPane());
		this.setTitle("New Game");
		this.setVisible(true);
		rdGroup.add(rdSingle);
		rdGroup.add(rdTwoPls);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new java.awt.Rectangle(63,9,154,46));
			jLabel.setFont(new java.awt.Font("Engravers MT", java.awt.Font.BOLD, 14));
			jLabel.setForeground(new java.awt.Color(255,51,51));
			jLabel.setText("Doodle Dots");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getRdSingle(), null);
			jContentPane.add(getRdTwoPls(), null);
			jContentPane.add(getBtnStart(), null);
			jContentPane.add(getBtnIns(), null);
			jContentPane.add(getBtnExit(), null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="138,9"
