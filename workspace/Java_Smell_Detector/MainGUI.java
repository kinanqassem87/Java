//package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class MainGUI {
private JFrame frame;
private JCheckBox switchCase;
private JCheckBox dataClass;
private JCheckBox middleMan;
private JCheckBox longParaList;
private JCheckBox longMethod;
private String path;
private int counter = 0;
private ArrayList<String> files = new ArrayList<String>();
private CheckBoxListener myListener = null;
private JButton fileChooser = null;
private JButton refactorButton = null;
private boolean switchCaseFlag = false;
private boolean dataClassFlag = false;
private boolean longMethodFlag = false;
private boolean longParaListFlag = false;
private boolean middleManFlag = false;
public MainGUI() {
frame = new JFrame("Java Smell Detector");
configureFrame();
createTopPanel();
JPanel center = new JPanel();
center.setLayout(new FlowLayout(FlowLayout.LEFT));
createSmellCheckBoxPanel(center);
frame.add(center, BorderLayout.CENTER);
JPanel refactorPanel = new JPanel();
createRefactorPanel(refactorPanel);
frame.add(refactorPanel, BorderLayout.EAST);
frame.setVisible(true);
}
private void configureFrame() {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(430, 260);
frame.setResizable(false);
frame.setLocationRelativeTo(null);
frame.setLayout(new BorderLayout());
}
private void createRefactorPanel(JPanel refactorPanel) {
refactorButtonListener refactorListener = new
refactorButtonListener();
refactorPanel.setLayout(new BoxLayout(refactorPanel,
BoxLayout.X_AXIS));
refactorPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,
60));
refactorButton = new JButton("Refactor");
refactorButton.addActionListener(refactorListener);
refactorButton.setEnabled(false);
refactorPanel.add(refactorButton);
}
private void createSmellCheckBoxPanel(JPanel center) {
JPanel smellCheckBox = new JPanel();
createCheckBox();
smellCheckBox.setLayout(new GridLayout(0, 1));
addCheckBox(smellCheckBox);
myListener = new CheckBoxListener();
addCheckBoxListener();
center.add(smellCheckBox);
}
private void createCheckBox() {
switchCase = new JCheckBox("Switch Case Smell");
dataClass = new JCheckBox("Data Class Smell");
middleMan = new JCheckBox("Middle Man Smell");
longParaList = new JCheckBox("Long Parameter List Smell");
longMethod = new JCheckBox("Long Method Smell");
addToolTipToCheckBox();
}
private void addToolTipToCheckBox() {
switchCase
.setToolTipText("occurs when a user uses lot of switch statements. If any Switch Statement has more than 2 Switch Cases it isconsidered to be a Switch Statements Smell.");
dataClass
.setToolTipText("When a class contains only variables and their getter and setter methods is called a Data Class Smell.");
		middleMan
		.setToolTipText("Middle Man Smell occurs when a method (delegate method) which puts forward the request to the client from another method.");
		longParaList
		.setToolTipText("When the number of parameters passed to a method is more than what is actually required for the functionality of the method.");
		longMethod
		.setToolTipText("A method which contains large number of lines and performs more than one action is considered as Long Method Smell.");
		}
		private void addCheckBox(JPanel smellCheckBox) {
		smellCheckBox.add(switchCase);
		smellCheckBox.add(dataClass);
		smellCheckBox.add(middleMan);
		smellCheckBox.add(longParaList);
		smellCheckBox.add(longMethod);
		}
		private void addCheckBoxListener() {
		switchCase.addItemListener(myListener);
		dataClass.addItemListener(myListener);
		middleMan.addItemListener(myListener);
		longParaList.addItemListener(myListener);
		longMethod.addItemListener(myListener);
		}
		private void createTopPanel() {
		JPanel top = new JPanel();
		fileChooser = new JButton("Select Project");
		top.setBorder(BorderFactory.createTitledBorder("Input"));
		top.setLayout(new FlowLayout(FlowLayout.LEFT));
		fileChooser.addActionListener((new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser(".");
		chooser.setDialogTitle("Select Project");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		if (chooser.showOpenDialog(fileChooser) ==
		JFileChooser.APPROVE_OPTION) {
		ifFileChooserSelectedOk(chooser);
		} else {
		JOptionPane.showMessageDialog(frame,
		"Haven't selected anything yet!!!",
		"Selected Project",
		JOptionPane.PLAIN_MESSAGE);
		}
		refactorButtonConditionCheck();
		}
		private void ifFileChooserSelectedOk(JFileChooser chooser)
		{
		path = chooser.getSelectedFile().toString();
		path = path.replace("\\", "/");
		File file = new File(path);
		fileFilter(file);
		if (files.size() != 0) {
		JOptionPane.showMessageDialog(frame,
		"The selected path is: " + path,
		"Selected Project",
		JOptionPane.PLAIN_MESSAGE);
		} else {
		JOptionPane.showMessageDialog(frame, "The selected path doesn't contain any Java Files", "Selected Project",JOptionPane.PLAIN_MESSAGE);
		path = null;
		}
		}
		}));
		top.add(new JLabel( "Select the Java Source Folder to detect smell: "));
		top.add(fileChooser);
		frame.add(top, BorderLayout.PAGE_START);
		}
		private void fileFilter(File dir) {
		File directory = dir;
		File[] filePath = directory.listFiles();
		for (File f : filePath) {
		if (f.isDirectory()) {
		fileFilter(f);
		} else if (f.toString().endsWith(".java")) {
		String temp = f.toString().replace("\\", "\\\\");
		files.add(temp);
		}
		}
		}
		private void refactorButtonConditionCheck() {
		if (counter > 0 & path != null) {
		refactorButton.setEnabled(true);
		} else {
		refactorButton.setEnabled(false);
		}
		}
		class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		itemSelected(e, source);
		itemDeselected(e, source);
		refactorButtonConditionCheck();
		}
		private void itemDeselected(ItemEvent e, Object source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (source == switchCase) {
			switchCaseFlag = false;
			} else if (source == dataClass) {
			dataClassFlag = false;
			} else if (source == middleMan) {
			middleManFlag = false;
			} else if (source == longParaList) {
			longParaListFlag = false;
			} else if (source == longMethod) {
			longMethodFlag = false;
			}
			counter--;
			}
			}
			private void itemSelected(ItemEvent e, Object source) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
			if (source == switchCase) {
			switchCaseFlag = true;
			} else if (source == dataClass) {
			dataClassFlag = true;
			} else if (source == middleMan) {
			middleManFlag = true;
			} else if (source == longParaList) {
			longParaListFlag = true;
			} else if (source == longMethod) {
			longMethodFlag = true;
			}
			counter++;
			}
			}
			}
			class refactorButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
			ArrayList<Boolean> flag = new ArrayList<Boolean>();
			flag.add(switchCaseFlag);
			flag.add(dataClassFlag);
			flag.add(middleManFlag);
			flag.add(longParaListFlag);
			flag.add(longMethodFlag);
			MainTabbedPane mtp = new MainTabbedPane(flag, files);
			frame.setVisible(false);
			}
			}
			public static void main(String[] args) {
			MainGUI main = new MainGUI();
			}
			}