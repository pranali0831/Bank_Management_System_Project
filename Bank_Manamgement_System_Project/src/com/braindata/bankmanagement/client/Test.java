package com.braindata.bankmanagement.client;
import java.util.Scanner;
import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;
public class Test 
{
	public static void main(String args[])throws InvalidAccountNoException, InvalidMobNoException ,InvalidAdharNoException,InvalidBalanceException ,InvalidAgeException,InvalidGenderException	{
		
	  Scanner sc =new Scanner(System.in);
	  Rbi bank=new  Sbi();
	  
	  while(true)
	  {
		  System.out.println("--Enter choice--\n" +"1.createAccount \n" + "2.displayAllDetails \n" + "3.depositeMoney \n" 
	                         + "4.withdrawal \n" + "5.balanceCheck \n" +"6.Exit \n");
		  
		  System.out.println("Enter Choice:");
		  int ch=sc.nextInt();
		  try {
		  if(ch==1)
		  
			  bank.createAccount();
		  }
		  catch(InvalidAccountNoException e)
		  {
			  System.out.println(e);
		  }
		  catch(InvalidMobNoException e1)
		  {
			  System.out.println(e1);
		  }
		  catch(InvalidAdharNoException e2)
		  {
			  System.out.println(e2);
		  }
		  catch(InvalidAgeException e)
		  {
			  System.out.println(e);
		  }
		  catch(InvalidGenderException  e)
		  {
			  System.out.println(e);
		  }
		  catch(InvalidBalanceException e3)
		  {
			 System.out.println(e3); 
		  }
		   if(ch==2)
		  {
		      bank.displayAllDetails();
		  }
		  else if(ch==3)
		  {
		      bank.depositeMoney();
		  }
		  else if(ch==4)
		  {
			  bank.withdrawal();
		  }
		  else if(ch==5)
		  {
			  bank.balanceCheck();
		  }
		  else if(ch==6)
		  {
			  break;
		  }
		  else
		  {
			  System.out.println("Invalid choice");;
		  }
		  
		    
	  }	

	}
}