public class Employee {
	String name;
	int salary;

	Employee(){
		name = "";
		salary= 0;
	}
	Employee(String nam,int sal){
		name = nam;
		salary= sal;
	}

	public String getDetails() {
		return "Name: " + name + "\n" + "Salary: " + salary;
	}
}
