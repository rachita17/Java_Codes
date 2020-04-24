package project3;
import java.util.Scanner;
class MyBank{
	int acno,balance;
	String cname,actype;
	Scanner s1=new Scanner(System.in);
	public void openAccount() {
		System.out.println("enter account number");
		acno=s1.nextInt();
		System.out.println("enter customer name");
		cname=s1.next();
		System.out.println("enter account type");
		actype=s1.nextInt();
		balance=5000;
	}
	public void depositMoney() {
		System.out.println("enter amount to be deposited");
	    int amt=s1.nextInt();
	    balance=balance+amt;
	    System.out.println("balance is:"+balance);
	    
	}
	public void withdrawMoney() {
		System.out.println("enter amount to be withdrawn:");
		int amt=s1.nextInt();
		if(balance>amt) {
			balance=balance-amt;
			System.out.println("now balance is:"+balance);
			
		}
		else
			System.out.println("transaction cant be done");
	}
	
	public void display() {
		System.out.println("account number is"+acno);
		System.out.println("account holder name is"+cname);
		System.out.println("account type is"+actype);
		System.out.println("account balance is"+balance);
	}
		
	
	}
public class Bank {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBank cust=new MyBank();
		Scanner s1=new Scanner(System.in);
		int k=0;
		do {
			System.out.println("============bank menu===========");
			System.out.println("1.open account");
			System.out.println("2.Deposit money");
			System.out.println("3.withdraw money");
			System.out.println("4.enquiry");
			System.out.println("exit");
			int ch=s1.nextInt();
			switch(ch)
			{
			case 1:
				cust.openAccount();
				break;
			case 2:
				cust.depositMoney();
				break;
				
			case 3:
				cust.withdrawMoney();
				break;
				
			case 4:
				cust.display();
				break;
			case 5:
				System.exit(0);
				break;
				default:
					System.out.println("\n invalid choice");
					
				
			}
			
			System.out.println("do you want more transaction(press1 for no:");
		    k=s1.nextInt();
		}while(k!=1);

	}

}
