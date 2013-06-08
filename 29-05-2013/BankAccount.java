import java.util.*;

class Bank
{
	int accno,balamt;
	String custname="";

	void getCustDetails()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name :");
		custname = sc.nextLine();

		System.out.println("Enter Account Number :");
		accno = sc.nextInt();

		System.out.println("Enter Balance :");
		balamt = sc.nextInt();


	}

	void displayDetails()
	{
		System.out.println("\nCustomer Details\n");

		System.out.println("Account Number\t:"+accno);
		System.out.println("Customer Name\t:"+custname);
		System.out.println("Account Balance\t:"+balamt);

	}

	void checkAmount()
	{
		if(balamt>20000)
			System.out.println("YOUR ACCOUNT BALANCE EXCEEDS '20000'");
	}

}

class BankAccount{
	public static void main(String[] args) {
		Bank bk = new Bank();
		bk.getCustDetails();
		bk.displayDetails();
		bk.checkAmount();
	}
}