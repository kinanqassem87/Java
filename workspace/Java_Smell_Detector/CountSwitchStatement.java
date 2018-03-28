//package SwitchCaseBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SwitchStatement;
public class CountSwitchStatement extends ASTVisitor {
private String message = null;
public boolean visit(SwitchStatement node) {
SimpleNameLister visitor1 = new SimpleNameLister();
node.accept(visitor1);
CountSwitchCases visitor = new CountSwitchCases();
node.accept(visitor);
System.out.println("Test: " + visitor.getLoopCount());
if (visitor.getLoopCount() > 3) {
message = "Swicth Case Name: " + visitor1.getSimpleName()
+ " " + "# of switch cases: "
+ visitor.getLoopCount();
}
return true;
}
public String getMessage() {
return message;
}
}
