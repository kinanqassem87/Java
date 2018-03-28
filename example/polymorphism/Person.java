class Person {
	protected String lastname;
	protected String firstname;
	protected int age;

	Person ()
		{
			lastname="";
			firstname= "";
			age=0;
}
	Person (String Last, String First, int Age)
	{
		lastname= Last;
		firstname= First;
		age=Age;
}
	public String getName() {return firstname + " " + lastname; }
	public int getAge() { return age; }
}

