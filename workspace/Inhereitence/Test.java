
public class Test {

	public static void main(String[] args) {
		Master card1 = new Master("Eihab","eih","mas12001234","lattakia");
		card1.deposit(1800);
		card1.withDraw(200);
		System.out.println(card1.getFullName()+" has "+card1.getBalance());
		Visa card2 = new Visa("Ali","aaa","aa56ttt");
		card2.deposit(200);
		System.out.println(card2.getFullName()+" has "+card2.getBalance());

	}

}
