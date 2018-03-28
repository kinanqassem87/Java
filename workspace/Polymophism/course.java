
public class course {
private String name;

 course(String n){
	this.name =n;
}
public String getname(){
	return name;
	
}
	
/**
	 * @param args
	 */
	public static void main(String[] args) {
		course c1=new course("Java");
		teacher t1=new teacher("kinan",98);
		System.out.println(c1.getname()+"\n") ;
		t1.print() ;
		
		// TODO Auto-generated method stub

	}

}
