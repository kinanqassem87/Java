//package LongParameterListBadSmell;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
public class LongParameterListMethodDeclaration extends ASTVisitor {
private ArrayList<String> longParaList = new ArrayList<String>();
private int numberOfParameter = 0;
private String methodName = new String();
private String methodBody;
private String expression;
public ArrayList<String> getExpression() {
return longParaList;
}
public boolean visit(MethodDeclaration node) {
	
	LongParameterListSingleVariable visitor = new
	LongParameterListSingleVariable();
	node.accept(visitor);
	numberOfParameter = visitor.getcounter();
	methodName = node.getName().toString();
	longMethodParaCheck(node, visitor);
	return true;
	}
	private void longMethodParaCheck(MethodDeclaration node,
	LongParameterListSingleVariable visitor) {
	if (numberOfParameter > 3) {
	methodBody = node.toString();
	visitor.getParameters();
	String[] lines = methodBody.split("\n");
	for (String temp : lines) {
	if (temp.contains(methodName) &&
	!temp.startsWith("/")
	&& temp.contains("(") &&
	temp.contains(")")) {
	int startindex = temp.indexOf("(") + 1;
	int endindex = temp.indexOf(")", startindex);
	expression = temp.substring(startindex,
	endindex);
	String[] te = expression.split(" ");
	int a = te.length;
	a = a / 2;
	if (a > 2) {
	expression = "Method Name: " + methodName
	+ " Parameters: " +
	expression;
	longParaList.add(expression);
	}
	}
	}
	}
	}
	}
