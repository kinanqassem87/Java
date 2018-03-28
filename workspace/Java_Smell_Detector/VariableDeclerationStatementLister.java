//package DataClassBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
public class VariableDeclerationStatementLister extends ASTVisitor {
private int variableDeclarationStatementCounter = 0;
public int getVariableDeclarationStatementCounter() {
return variableDeclarationStatementCounter;
}
public boolean visit(VariableDeclarationStatement node) {
variableDeclarationStatementCounter++;
return true;
}
}
