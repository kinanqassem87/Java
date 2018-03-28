public class Inheritance1 {
 public static void main(String[] args) { 
  MyBase b = new MyBase(2);
  b.show();
  MyDerived d = new MyDerived(3, 4);
  d.show(); }
}