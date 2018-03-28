class Manager extends Employee {
	String department;

	Manager(String nam,int sal,String dep){
		name = nam;
		salary= sal;
		department=dep;
	}

	public String getDetails() {
		return "Name: " + name + "\n" +"Manager of " + department;
	}
}
