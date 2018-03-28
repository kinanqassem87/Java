//package Refactor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class RefactorCode {
public void callExtractMethod() {
try {
Robot robot = new Robot();
robot.delay(300);
robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_SHIFT);
robot.keyPress(KeyEvent.VK_M);
robot.keyRelease(KeyEvent.VK_ALT);
robot.keyRelease(KeyEvent.VK_SHIFT);
robot.keyRelease(KeyEvent.VK_M);
} catch (AWTException e) {
e.printStackTrace();
}
}
public void callMoveMethod() {
try {
Robot robot = new Robot();
robot.delay(300);
robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_SHIFT);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_ALT);
robot.keyRelease(KeyEvent.VK_SHIFT);
robot.keyRelease(KeyEvent.VK_V);
} catch (AWTException e) {
e.printStackTrace();
}
}
public void swapScreen() {
Robot robot;
try {
robot = new Robot();
robot.delay(300);
robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_TAB);
robot.delay(2000);
robot.keyRelease(KeyEvent.VK_ALT);
robot.keyRelease(KeyEvent.VK_TAB);
} catch (AWTException e) {
e.printStackTrace();
}
}
}
