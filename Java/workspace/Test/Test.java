import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame implements MouseListener{

	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel11 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JLabel jLabel20 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel22 = null;
	private JLabel jLabel23 = null;
	private JLabel jLabel24 = null;
	int turn = 1;
	private JLabel lblTurn = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This is the default constructor
	 */
	public Test() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(299, 269);
		this.setContentPane(getJContentPane());
		this.setTitle("Game");
		this.setVisible(true);
		jLabel15.addMouseListener(this);
		jLabel16.addMouseListener(this);
		jLabel17.addMouseListener(this);
		jLabel18.addMouseListener(this);
		jLabel19.addMouseListener(this);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblTurn = new JLabel();
			lblTurn.setBounds(new java.awt.Rectangle(90,63,82,19));
			lblTurn.setText("");
			jLabel24 = new JLabel();
			jLabel24.setBounds(new java.awt.Rectangle(45,171,19,28));
			jLabel24.setText("-");
			jLabel23 = new JLabel();
			jLabel23.setBounds(new java.awt.Rectangle(117,171,19,28));
			jLabel23.setText("-");
			jLabel22 = new JLabel();
			jLabel22.setBounds(new java.awt.Rectangle(189,171,19,28));
			jLabel22.setText("-");
			jLabel21 = new JLabel();
			jLabel21.setBounds(new java.awt.Rectangle(45,117,19,28));
			jLabel21.setText("-");
			jLabel20 = new JLabel();
			jLabel20.setBounds(new java.awt.Rectangle(117,117,19,28));
			jLabel20.setText("-");
			jLabel19 = new JLabel();
			jLabel19.setBounds(new java.awt.Rectangle(189,117,19,28));
			jLabel19.setText("-");
			jLabel18 = new JLabel();
			jLabel18.setBounds(new java.awt.Rectangle(72,207,37,10));
			jLabel18.setText("---------");
			jLabel17 = new JLabel();
			jLabel17.setBounds(new java.awt.Rectangle(144,207,37,10));
			jLabel17.setText("---------");
			jLabel16 = new JLabel();
			jLabel16.setBounds(new java.awt.Rectangle(72,153,37,10));
			jLabel16.setText("---------");
			jLabel15 = new JLabel();
			jLabel15.setBounds(new java.awt.Rectangle(144,153,37,10));
			jLabel15.setText("---------");
			jLabel14 = new JLabel();
			jLabel14.setBounds(new java.awt.Rectangle(63,99,46,10));
			jLabel14.setText("---------");
			jLabel13 = new JLabel();
			jLabel13.setBounds(new java.awt.Rectangle(144,99,46,10));
			jLabel13.setText("---------");
			jLabel12 = new JLabel();
			jLabel12.setBounds(new java.awt.Rectangle(45,198,19,28));
			jLabel12.setText("0");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new java.awt.Rectangle(117,198,19,28));
			jLabel11.setText("0");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new java.awt.Rectangle(189,198,19,28));
			jLabel10.setText("0");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new java.awt.Rectangle(45,144,19,28));
			jLabel9.setText("0");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new java.awt.Rectangle(117,144,19,28));
			jLabel8.setText("0");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new java.awt.Rectangle(189,144,19,28));
			jLabel7.setText("0");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new java.awt.Rectangle(45,90,19,28));
			jLabel6.setText("0");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new java.awt.Rectangle(117,90,19,28));
			jLabel5.setText("0");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new java.awt.Rectangle(189,90,19,28));
			jLabel4.setText("0");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new java.awt.Rectangle(36,36,28,19));
			jLabel3.setText("0");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new java.awt.Rectangle(207,36,19,19));
			jLabel2.setText("0");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new java.awt.Rectangle(189,9,55,19));
			jLabel1.setText("Player2");
			jLabel = new JLabel();
			jLabel.setBounds(new java.awt.Rectangle(18,9,55,19));
			jLabel.setText("Player1");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(jLabel10, null);
			jContentPane.add(jLabel11, null);
			jContentPane.add(jLabel12, null);
			jContentPane.add(jLabel13, null);
			jContentPane.add(jLabel14, null);
			jContentPane.add(jLabel15, null);
			jContentPane.add(jLabel16, null);
			jContentPane.add(jLabel17, null);
			jContentPane.add(jLabel18, null);
			jContentPane.add(jLabel19, null);
			jContentPane.add(jLabel20, null);
			jContentPane.add(jLabel21, null);
			jContentPane.add(jLabel22, null);
			jContentPane.add(jLabel23, null);
			jContentPane.add(jLabel24, null);
			jContentPane.add(lblTurn, null);
		}
		return jContentPane;
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JLabel selected;
		selected = ((JLabel)arg0.getComponent());
		if(selected.getText().equals("1")||selected.getText().equals("2"))
			System.out.println("nooo");
		else{
			if(turn == 1){
				selected.setText("1");
				turn = 2;
				selected.setEnabled(false);
			}else{
				selected.setText("2");
				turn = 1;
				selected.setEnabled(false);
			}
			lblTurn.setText("player" + turn);
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

}  //  @jve:decl-index=0:visual-constraint="166,11"
