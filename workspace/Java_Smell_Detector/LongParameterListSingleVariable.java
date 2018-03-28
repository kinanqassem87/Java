//package LongParameterListBadSmell;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
public class LongParameterListSingleVariable extends ASTVisitor{
private int counter = 0;
private ArrayList<String> parameters = new ArrayList<String>();
public boolean visit(SingleVariableDeclaration node) {
	parameters.add(node.getName().toString());
	counter++;
	return true;
	}
	public ArrayList<String> getParameters() {
	return parameters;
	}
	public int getcounter() {
	return counter;
	}
	}
