//package Main;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import CodeAnalyzer.CodeAnalyzerMethodDeclarationLister;
import CodeAnalyzer.FieldDeclarationLister;
import DataClassBadSmell.MethodDeclarationBlock;
import DataClassBadSmell.TypeDeclarationStatementTest;
import LongMethodBadSmell.LongMethodMethodDeclaration;
import LongParameterListBadSmell.LongParameterListMethodDeclaration;
import MiddleManBadSmell.MiddleManMethodDeclaration;
import SwitchCaseBadSmell.CountIfStatement;
import SwitchCaseBadSmell.CountSwitchStatement;
public class DesignAnalyzer {
private ArrayList<String> globalVariableList = new ArrayList<String>();
private ArrayList<String> globalMethodNameList = new
ArrayList<String>();
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
private String smell;
public ArrayList<String> getMiddleManSmell() {
return middleManSmell;
}
public ArrayList<String> getLongMethodSmell() {
return longMethodSmell;
}
public ArrayList<String> getSwitchCaseSmell() {
return switchCaseSmell;
}
public ArrayList<String> getDataClassSmell() {
	return dataClassSmell;
	}
	public ArrayList<String> getLongParaListSmell() {
	return longParaListSmell;
	}
	private char[] getChars(String fileName) {
	char[] result = null;
	try {
	File file = new File(fileName);
	Scanner scanner = new Scanner(file);
	String contents = "";
	while (scanner.hasNext()) {
	String nextLine = scanner.nextLine();
	if (nextLine.contains("//")) {
	int beginIndex = nextLine.indexOf("//", 0);
	String comment =
	nextLine.substring(beginIndex);
	nextLine = nextLine.replaceAll(comment, "");
	if (comment != null)
	contents += nextLine;
	} else {
	contents += nextLine;
	}
	}
	result = contents.toCharArray();
	} catch (Exception e) {
	System.out.println(e);
	}
	return result;
	}
	private CompilationUnit parse(String fileName) {
	ASTParser parser = ASTParser.newParser(AST.JLS3);
	parser.setSource(getChars(fileName));
	CompilationUnit cu = (CompilationUnit) parser.createAST(null);
	return cu;
	}
	private void countSwitchCase(CompilationUnit cu, String fileName) {
	CountSwitchStatement visitor = new CountSwitchStatement();
	cu.accept(visitor);
	smell = visitor.getMessage();
	fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
	System.out.println("Test: " + fileName);
	if (smell != null) {
	switchCaseSmell.add("Class Name: " + fileName + "
	"
	+ smell);
	}
	CountIfStatement visitor1 = new CountIfStatement();
	cu.accept(visitor1);
	ArrayList<Integer> ifCounter = visitor1.getCounter();
	if (ifCounter != null) {
		int i = 0;
		while (i < ifCounter.size()) {
		int temp = ifCounter.get(i);
		if (ifCounter.get(i) > 2) {
		switchCaseSmell
		.add("Class Name: "
		+ fileName
		+ " contains
		if else block of more than 3 cases.");
		}
		if (temp == 1) {
		i = i + 1;
		} else {
		i = i + temp;
		}
		}
		}
		}
		private void longParameterList(String fileName, CompilationUnit cu) {
		ArrayList<String> smell = new ArrayList<String>();
		fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
		LongParameterListMethodDeclaration visitor = new
		LongParameterListMethodDeclaration();
		cu.accept(visitor);
		smell.addAll(visitor.getExpression());
		if (smell.size() != 0) {
		for (String temp : smell) {
		longParaListSmell.add("Class Name: " + fileName + "
		"
		+ temp);
		}
		}
		}
		@SuppressWarnings("unchecked")
		private void dataClassBadSmell(String fileName, CompilationUnit cu) {
		fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
		HashMap<String, Integer> methodNameLength = new HashMap<String,
		Integer>();
		MethodDeclarationBlock visitor = new MethodDeclarationBlock();
		cu.accept(visitor);
		methodNameLength = visitor.getMethodNameLength();
		Set set = methodNameLength.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
		Map.Entry me = (Map.Entry) i.next();
		if (Integer.parseInt(me.getValue().toString()) > 0) {
		dataClassSmell.remove(fileName);
		}
		}
		TypeDeclarationStatementTest visitor1 = new
		TypeDeclarationStatementTest();
		cu.accept(visitor1);
		if (visitor1.getInterfaceFlag())
			dataClassSmell.remove(fileName);
			if (visitor1.getAbstractFlag())
			dataClassSmell.remove(fileName);
			}
			private void longMethodBadSmell(String fileName, CompilationUnit cu) {
			LongMethodMethodDeclaration visitor = new
			LongMethodMethodDeclaration();
			cu.accept(visitor);
			smell = visitor.getSmell();
			fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
			if (smell != null) {
			longMethodSmell.add("Class Name: " + fileName + "
			"
			+ smell);
			}
			}
			private void middleMan(String fileName, CompilationUnit cu) {
			MiddleManMethodDeclaration visitor = new
			MiddleManMethodDeclaration(
			globalMethodNameList);
			cu.accept(visitor);
			smell = visitor.getSmell();
			fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
			if (smell != null) {
			middleManSmell
			.add("Class Name: " + fileName + " " +
			smell);
			}
			}
			private void parseCode(CompilationUnit cu) {
			FieldDeclarationLister visitor = new FieldDeclarationLister();
			cu.accept(visitor);
			globalVariableList.addAll(visitor.getGlobalVariableList());
			CodeAnalyzerMethodDeclarationLister visitor1 = new
			CodeAnalyzerMethodDeclarationLister();
			cu.accept(visitor1);
			globalMethodNameList.addAll(visitor1.getGlobalMethodNameList());
			}
			public void main(ArrayList<String> files) {
			DesignAnalyzer da = new DesignAnalyzer();
			CompilationUnit cu;
			for (String fileName : files) {
			cu = da.parse(fileName);
			da.parseCode(cu);
			fileName = fileName.substring(fileName.lastIndexOf("\\") +
			1);
			dataClassSmell.add(fileName);
			}
			for (String fileName : files) {
				cu = da.parse(fileName);
				da.countSwitchCase(cu, fileName);
				da.dataClassBadSmell(fileName, cu);
				da.longParameterList(fileName, cu);
				da.longMethodBadSmell(fileName, cu);
				da.middleMan(fileName, cu);
				}
				}
				}

			}
	}