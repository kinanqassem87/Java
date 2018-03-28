public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The class method" + " in Cat.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method" + " in Cat.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        
      
       // Animal a1=new Animal();
      
        // myCat.testInstanceMethod();
        //a1.testInstanceMethod();
        //myCat.testClassMethod();
       // a1.testClassMethod();
    }
}
