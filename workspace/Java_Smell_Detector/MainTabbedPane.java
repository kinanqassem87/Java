//package GUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import Main.DesignAnalyzer;
import Refactor.RefactorCode;
public class MainTabbedPane extends JFrame {
private static JTabbedPane jtp;
private JPanel switchCase = new JPanel();
private JPanel dataClass = new JPanel();
private JPanel middleMan = new JPanel();
private JPanel longParameterList = new JPanel();
private JPanel longMethod = new JPanel();
private JPanel centerPanel;
private JPanel rightPanel;
private ImageIcon icon;
private JButton moveButton;
private JButton extractButton;
private JButton inlineButton;
private static ArrayList<String> switchCaseSmell = new
ArrayList<String>();
private static ArrayList<String> dataClassSmell = new
ArrayList<String>();
private static ArrayList<String> longParaListSmell = new
ArrayList<String>();
private static ArrayList<String> longMethodSmell = new
ArrayList<String>();
private static ArrayList<String> middleManSmell = new
ArrayList<String>();
private RefactorListner listner = new RefactorListner();
public MainTabbedPane(ArrayList<Boolean> flag, ArrayList<String> files)
{
DesignAnalyzer da = new DesignAnalyzer();
da.main(files);
getSmellArrayList(da);
MainTabbedPane tp = new MainTabbedPane();
enableDisableTabs(flag);
tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
tp.setVisible(true);
}
private void enableDisableTabs(ArrayList<Boolean> flag) {
for (int i = 4; i >= 0; i--) {
if (flag.get(i) == false) {
jtp.setEnabledAt(i, false);
} else {
jtp.setSelectedIndex(i);
}
}
}
private void getSmellArrayList(DesignAnalyzer da) {
switchCaseSmell.addAll(da.getSwitchCaseSmell());
dataClassSmell.addAll(da.getDataClassSmell());
longParaListSmell.addAll(da.getLongParaListSmell());
longMethodSmell.addAll(da.getLongMethodSmell());
middleManSmell.addAll(da.getMiddleManSmell());
}
public MainTabbedPane() {
setSize(850, 600);
setResizable(false);
setLocationRelativeTo(null);
setTitle("Java Smell Detector");
jtp = new JTabbedPane();
getContentPane().add(jtp);
createTabs(jtp);
}
private void createTabs(JTabbedPane jtp) {
addTabs(jtp);
createEachTab(switchCase, switchCaseSmell);
createEachTab(dataClass, dataClassSmell);
createEachTab(middleMan, middleManSmell);
createEachTab(longParameterList, longParaListSmell);
createEachTab(longMethod, longMethodSmell);
}
private void addTabs(JTabbedPane jtp) {
jtp.add("Switch Case Smell", switchCase);
jtp.add("Data Class Smell", dataClass);
jtp.add("Middle Man Smell", middleMan);
jtp.add("Long Parameter List Smell", longParameterList);
jtp.add("Long Method Smell", longMethod);
}
private void createEachTab(JPanel tab, ArrayList<String> smellList) {
JPanel result = resultPanel(tab);
JPanel refactorDesc = refactorDescPanel(tab);
refactorDesc.setMaximumSize(new Dimension(850, 300));
refactorDesc.setPreferredSize(new Dimension(850, 250));
icon = new ImageIcon("src/GUI/bullet_label.gif");
displayResult(smellList, result);
ArrayList<JLabel> list = new ArrayList<JLabel>();
if (tab == switchCase) {
list
.add(new JLabel(
"Extract each method to its
individual method and extract them to individual classes.",
icon, JLabel.LEFT));
list
.add(new JLabel(
"Change access modifier of each
method to \"public\" and rename them with same method name.",
icon, JLabel.LEFT));
list
.add(new JLabel(
"Extract interface from any one of
the class and create method as member of interface.",
icon, JLabel.LEFT));
list.add(new JLabel("Implement interface for rest of the
classes.",
icon, JLabel.LEFT));
list
.add(new JLabel(
"Declare generic Object of the
interface and it's implement it appropriately in each switch case",
icon, JLabel.LEFT));
list
.add(new JLabel(
"Have a generic return type outside
the switch statement and breakout from individual cases.",
icon, JLabel.LEFT));
list.add(new JLabel("Extract switch statement in a
method.", icon,
JLabel.LEFT));
list
.add(new JLabel(
"Create a HashMap consisting each
switch case as key and type of object as value.",
icon, JLabel.LEFT));
list
.add(new JLabel(
"Clean up the code by applying
Inline refactoring technique and removing unnecessary objects.",
icon, JLabel.LEFT));
for (JLabel label : list) {
refactorDesc.add(label);
}
} else if (tab == dataClass) {
refactorDesc.setLayout(new BorderLayout());
createPannelSetLayout();
createRefactorButtonAddListener();
rightPanel.add(moveButton);
rightPanel.add(new JLabel(" "));
rightPanel.add(extractButton);
centerPanel
.add(new JLabel(
"Move method from a class which
uses these getters and setters methods of the Data Class.",
icon, JLabel.LEFT));
centerPanel
.add(new JLabel(
" Make sure to check the
checkbox to keep the method delgate."));
centerPanel.add(new JLabel(" "));
centerPanel
.add(new JLabel(
"If method is a main method or
contains other behaviours Extract Method",
icon, JLabel.LEFT));
refactorDesc.add(centerPanel, BorderLayout.CENTER);
refactorDesc.add(rightPanel, BorderLayout.EAST);
} else if (tab == middleMan) {
list.add(new JLabel(
"Make delegating object a sub class of the
delegate.",
icon, JLabel.LEFT));
list.add(new JLabel("If method signature conflicts rename
them.",
icon, JLabel.LEFT));
list.add(new JLabel(
"Set delegate field refer to the object
itself.", icon,
JLabel.LEFT));
list.add(new JLabel("Remove the simple delegation method.",
icon,
JLabel.LEFT));
list.add(new JLabel(
"Replace all other delgation with calls to the
object.",
icon, JLabel.LEFT));
for (JLabel label : list) {
refactorDesc.add(label);
}
} else if (tab == longParameterList) {
list
.add(new JLabel(
"Create a new parameter for the
whole object from which the data comes.",
icon, JLabel.LEFT));
list.add(new JLabel("Compile and test.", icon,
JLabel.LEFT));
list
.add(new JLabel(
"Determine which parameters should
be obtained from the whole object.",
icon, JLabel.LEFT));
list
.add(new JLabel(
"Take one parameter and replace
references to it within the method body by invoking an appropriate method on
the whole object parameter.",
icon, JLabel.LEFT));
list.add(new JLabel("Delete the parameter.", icon,
JLabel.LEFT));
list.add(new JLabel("Compile and test.", icon,
		JLabel.LEFT));
		list
		.add(new JLabel(
		"Repeat for each parameter that can
		be got from the whole object.",
		icon, JLabel.LEFT));
		list
		.add(new JLabel(
		"Remove the code in the calling
		method that obtains the deleted parameters.",
		icon, JLabel.LEFT));
		for (JLabel label : list) {
		refactorDesc.add(label);
		}
		} else if (tab == longMethod) {
		refactorDesc.setLayout(new BorderLayout());
		createPannelSetLayout();
		createRefactorButtonAddListener();
		refactorDesc.add(centerPanel, BorderLayout.CENTER);
		refactorDesc.add(rightPanel, BorderLayout.EAST);
		centerPanel.add(new JLabel(
		"Divide the code depending upon the code
		dependency.",
		icon, JLabel.LEFT));
		centerPanel.add(new JLabel(" "));
		centerPanel
		.add(new JLabel(
		"Select each division and extract
		each division into individual methods by clicking on the Extract Method
		Button.",
		icon, JLabel.LEFT));
		rightPanel.add(new JLabel(" "));
		rightPanel.add(new JLabel(" "));
		rightPanel.add(extractButton);
		}
		}
		private void createPannelSetLayout() {
		centerPanel = new JPanel();
		rightPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel,
		BoxLayout.Y_AXIS));
		rightPanel.setLayout(new BoxLayout(rightPanel,
		BoxLayout.Y_AXIS));
		}
		private void createRefactorButtonAddListener() {
		moveButton = new JButton(" Move Method ");
		extractButton = new JButton("Extract Method");
		inlineButton = new JButton(" Inline Method ");
		moveButton.addActionListener(listner);
		extractButton.addActionListener(listner);
		inlineButton.addActionListener(listner);
		}
		private void displayResult(ArrayList<String> smellList, JPanel result)
		{
		if (smellList != null) {
		for (int i = 0; i < smellList.size(); i++) {
		JLabel label = new JLabel(smellList.get(i), icon,
		JLabel.LEFT);
		result.add(label);
		}
		} else {
		JLabel label = new JLabel(
		"No Bad Smell detected in any of the files.",
		icon,
		JLabel.LEFT);
		result.add(label);
		}
		}
		private JPanel refactorDescPanel(JPanel tab) {
		JPanel refactorDesc = new JPanel();
		tab.add(refactorDesc);
		refactorDesc.setBorder(BorderFactory.createTitledBorder("Refactoring"))
		;
		refactorDesc.setLayout(new GridLayout(0, 1));
		return refactorDesc;
		}
		private JPanel resultPanel(JPanel tab) {
		tab.setLayout(new BoxLayout(tab, BoxLayout.Y_AXIS));
		JPanel result = new JPanel();
		result.setLayout(new GridLayout(0, 1, 1, 5));
		JScrollPane resultScroller = new JScrollPane();
		resultScroller.setViewportView(result);
		tab.add(resultScroller);
		result.setBorder(BorderFactory.createTitledBorder("Results"));
		return result;
		}
		class RefactorListner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		RefactorCode refactor = new RefactorCode();
		if (e.getActionCommand() == " Move Method ") {
		refactor.swapScreen();
		refactor.callMoveMethod();
		} else if (e.getActionCommand() == "Extract Method") {
		refactor.swapScreen();
		refactor.callExtractMethod();
		}
		}
		}
		}
