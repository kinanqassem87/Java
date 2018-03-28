class MyDerived extends MyBase {
 private int y;
 public MyDerived(int x) {
  super(x);
 } 
 public MyDerived(int x, int y) {
  super(x);
  this.y = y;
 }
 public int getY() {
  return y;
 } 
 public void show() {
  System.out.println("x = " + getX());
  System.out.println("y = " + y);
 }
}

