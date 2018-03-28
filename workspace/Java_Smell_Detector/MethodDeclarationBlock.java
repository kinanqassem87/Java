//package DataClassBadSmell;
import java.util.HashMap;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
public class MethodDeclarationBlock extends ASTVisitor {
private HashMap<String, Integer> methodNameLength = new HashMap<String,
Integer>();
private int counter = 1;
public HashMap<String, Integer> getMethodNameLength() {
return methodNameLength;
}
public boolean visit(MethodDeclaration node) {
BlockLister visitor = new BlockLister();
node.accept(visitor);
methodNameLength.put(counter + ":" + node.getName().toString(),
visitor.getNumberOfStatements());
counter++;
return true;
}
}
