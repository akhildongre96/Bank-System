package account;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		int adhaarNo,accountNo,balance,count=0;
		 String accountType,accountName;
		 Scanner sc = new Scanner(System.in);
		 Account[] ac = new Account[10];
		 while(true) {
		 System.out.println("Select\n1-Add New Account\n2-Update Account\n3-Delete Existing Account\n4-Searching perticular Account\n5-Show All Account");
		 
		int n=sc.nextInt();
		switch(n)
		{
		case-1:
			System.out.println("Adding new account");
			System.out.println("Account No.need to add");
			int no=sc.nextInt();
			for(int i=0;i<no;i++)
			{
				System.out.println("Assign Account Number");
				accountNo=sc.nextInt();
				
				System.out.println("Enter Adhaar Card Number");
				adhaarNo=sc.nextInt();
				
				System.out.println("Enter Deposite Amount");
				balance=sc.nextInt();
				System.out.println("Enter Account Type");
				accountType=sc.next();
				System.out.println("Account Holder Name");
				accountName=sc.next();
				ac[count]=new Account(accountNo,adhaarNo,balance,accountType,accountName);
				count++;
				break;
			}
		case 2:
			System.out.println("Update Book");
			System.out.println("Enter the Account Number You want to Update");
			accountNo=sc.nextInt();
			for(int i=0;i<count;i++)
			{
			if(accountNo==ac[i].getAccountNo())
			{
			System.out.print("Deposite Account BlanceAmount:");
			balance=sc.nextInt();
			ac[i].setBalance(balance);
			System.out.print("Provide ID prove(Aadhar Number):");
			adhaarNo=sc.nextInt();
			ac[i].setAdhaarNo(adhaarNo);
            System.out.print("Select Account Type:");
			accountType=sc.next();
			ac[i].setAccountTyape(accountType);
			System.out.print("Account Holder Name:");
			accountName=sc.next();
			ac[i].setAccountNmae(accountName);
			}
			}
			break;
		case 3:
			System.out.println("Deleting existing account");
			System.out.println("Enter Account to be Deleted:");
			accountNo=sc.nextInt();
			for(int i=0;i<count;i++)
			{
			if(accountNo==ac[i].getAccountNo())
			{
			ac[i]=null;
			}
			}
			break;
		case 4:
			System.out.println("Searching particular account");
			System.out.println("Enter Account you want to search:");
			accountNo=sc.nextInt();
			for(int i=0;i<count;i++)
			{
			if(accountNo==ac[i].getAccountNo())
			{
			System.out.println(ac[i]);//it will call the toString method 
			}
			}
			break;
		case 5:
			System.out.println("Displaying all accounts");
			for(int i=0;i<count;i++)
			{
			System.out.println(ac[i]);//it will call the toString method 
			}
			break;
		case 6:
			System.out.println("Withdrawing money from particular account:");
			System.out.println("Enter the Account Number");
			accountNo=sc.nextInt();
			for(int i=0;i<count;i++)
			{
			if(ac[i].getAccountNo()==accountNo)
			{
			System.out.println("Enter the Amount you want to Withdraw:");
			int withdrawamt=sc.nextInt();
			balance=ac[i].getBalance();
			if(balance>withdrawamt)
			{
			balance-=withdrawamt;
			ac[i].setBalance(balance);
			System.out.println("Updated Balance :"+ac[i].getBalance());
			}
			}
			}
			break;
			default:
			System.out.println("Invalid Selection");
			break;
			}
			}
			}
			}
			