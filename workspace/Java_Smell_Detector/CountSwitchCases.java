//package SwitchCaseBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SwitchCase;
public class CountSwitchCases extends ASTVisitor {
private int switchCases = 0;
public int getLoopCount() {
return switchCases;
}
public boolean visit(SwitchCase node) {
switchCases++;
return true;
}
}
