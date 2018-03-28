//package SwitchCaseBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IfStatement;
public class CountElseStatement extends ASTVisitor {
int counter;
public boolean visit(IfStatement node) {
counter++;
return true;
}
public int getCounter() {
return counter;
}
public void setCounter() {
	counter = 0;
	}
	}
