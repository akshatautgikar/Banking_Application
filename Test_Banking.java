/*  Java Banking Application Created by Ms. Akshata Utgikar
 * on 23-08-2024 13.30 
 */

class Account{
	String name;
	long contact;
	String PAN;
	long aadhar;
	
	Account(String name,long contact, String PAN, long aadhar){
		System.out.println("The information of new account is: " + name + "  " + contact + "  " + PAN + "  " + aadhar);
	}
	
}


public class Test_Banking {
	public static void main(String[] args) {
	Account a1 = new Account("Akshata Utgikar", 7822055030l, "AACPU5899D", 301587558960l);

	}

}
