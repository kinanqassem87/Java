
public class Test {
public static void main(String []args)
{
	Master m1=new Master("rami","mohammad","mas12390023",2000);
	Visa v1=new Visa("ali","ahmad","vis122002",200);
	m1.deposet(200);
	m1.withdraw(700);
	v1.deposet(800);
	v1.withdraw(500);
	System.out.print("\n"+m1.fullName+"\n"+m1.lastName+"\n New balance is : "+m1.balance+"\n*******\n");
	System.out.print("\n"+v1.fullName+"\n"+v1.lastName+"\n New balance is : "+v1.balance+"\n*******\n");
	}
}
