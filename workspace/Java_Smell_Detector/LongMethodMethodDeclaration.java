//package LongMethodBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
public class LongMethodMethodDeclaration extends ASTVisitor {
private int numberOfStatements;
private String smell;
public String getSmell() {
return smell;
}
public boolean visit(MethodDeclaration node) {
String[] methodBody = null;
LongMethodBlock visitor = new LongMethodBlock();
node.accept(visitor);
numberOfStatements = visitor.getNumberOfStatements();
methodBody = node.toString().split("\n");
numberOfStatements = methodBody.length - 2;
if (numberOfStatements > 15) {
smell = "Method Name: " + node.getName().toString()
+ " Number of Lines: " +
numberOfStatements;
}
return true;
}
}
