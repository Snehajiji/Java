package sampleprgrms;

import java.util.Scanner;

interface Bank
{
	public void accountdetails();
	public void balance();
	public void deposit();
	public void withdrawl();
}
class Sbi implements Bank
{
	static String bankname="SBI";
	int accountno;
	int balance=10000;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails() 
	{
		System.out.println("Enter your account no : ");
		int accountno= sc.nextInt();
		System.out.println("Enter your name ");
		String name=sc.nextLine();
		System.out.println("Bank name = "+bankname);
		System.out.println("Account no = "+accountno);
		System.out.println("Your name is "+name);
		System.out.println("Your balance = "+balance);
	}

	@Override
	public void balance() 
	{
	
		System.out.println(balance);
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Enter your deposit amount : ");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("Balance = "+balance);
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("Enter the withdrawl amount : ");
		int amount=sc.nextInt();
		balance=balance-amount;
		System.out.println("Balance = "+balance);
		
	}
}

public class BankInterface {

	public static void main(String[] args) 
	{
		Sbi ob=new Sbi();
		ob.accountdetails();
		ob.balance();
		ob.deposit();
		ob.withdrawl();

	}

}
