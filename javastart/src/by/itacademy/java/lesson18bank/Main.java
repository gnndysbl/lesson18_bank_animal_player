package by.itacademy.java.lesson18bank;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account sa1 = new SavingsAccount(121548712, 1256, "rub", 5.6); 

		System.out.println(sa1);
		sa1.deposit(20);
		System.out.println(sa1);
		sa1.withdraw(40);
		System.out.println(sa1);
		System.out.println(sa1.getBalance());
		
		
		CurrentAccount ca1 = new CurrentAccount(121548713, 1256, "rub", 500); 

		System.out.println(ca1);
		ca1.deposit(20);
		System.out.println(ca1);
		ca1.withdraw(40);
		System.out.println(ca1);
		ca1.withdraw(1400);
		System.out.println(ca1);
		ca1.withdraw(14);
		System.out.println(ca1);
		ca1.withdraw(321);
		System.out.println(ca1);
		ca1.withdraw(1);
		System.out.println(ca1);
//		ca1.withdraw(1);
//		System.out.println(ca1);
//		ca1.withdraw(450);
//		System.out.println(ca1);





	}

}
