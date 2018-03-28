class Employee extends Person
{
	protected String title;
	protected int salary;

	Employee (String Last, String First, int Age, String Title, int Salary)
		{
		lastname= Last;
		firstname= First;
		age=Age;
		title= Title;
		salary = Salary;
	}
	public String getName() {
		if (title. equals("Doctor"))
		return "Dr. " + firstname + " " + lastname;
		return firstname + " " + lastname;
	}
}
