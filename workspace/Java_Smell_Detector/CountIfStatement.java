//package SwitchCaseBadSmell;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IfStatement;
public class CountIfStatement extends ASTVisitor {
private ArrayList<Integer> counterArray = new ArrayList<Integer>();
private int counter = 1;
public boolean visit(IfStatement node) {
if (node.getElseStatement() != null) {
CountElseStatement visitor = new CountElseStatement();
visitor.setCounter();
node.accept(visitor);
counter = visitor.getCounter();
}
counterArray.add(counter);
counter = 1;
return true;
}
public ArrayList<Integer> getCounter() {
return counterArray;
}
}
