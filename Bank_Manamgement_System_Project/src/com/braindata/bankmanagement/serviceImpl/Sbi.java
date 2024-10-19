

package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.Account;
import java.util.Scanner;
public class Sbi implements Rbi {
	
	
	Account ac=new Account();
	Scanner sc=new Scanner(System.in);
	public void createAccount() throws InvalidAccountNoException ,InvalidMobNoException,InvalidAdharNoException,InvalidBalanceException,InvalidAgeException, InvalidGenderException
	{
	    while(true)
	    {
		   System.out.println("Enter Account number:");
		   long accno=sc.nextLong();
		   int count=0;
		   long acc=accno;
		   for(long i=acc;i>0;i=i/10)
		     {
			   
		    	 count++; 
		     }
		     if(count==12)
		     {
		    	 ac.setAccno(acc);
		    	 break;
		     }
		     else
		     {
		    	 throw new InvalidAccountNoException("Enter 12 digit account number");
		    	 //System.out.println("enter valid Account no");
		    	
		     }
	      
	       }
	    
		 //------------------------------------------------------ 
		     System.out.println("Enter Account name:");
	         ac.setName(sc.next());
	   
		   //----------------------------
		   while(true)
		   {
		     System.out.println("Enter Mobile number");
		     String mobno=sc.next();
		     long mob=Long.parseLong(mobno);
		     int count=0;
		     long no=mob;
		     for(long i=no;i>0;i=i/10)
		     {
		    	 count++; 
		     }
		     if(count==10)
		     {
		    	 ac.setMobno(mobno);
		    	 break;
		     }
		     else
		     {
		    	 throw new InvalidMobNoException("Invalid mobile number..no must 10 digit ");
		    	// System.out.println("enter valid mob no");
		     }
		    }
		     
		     
		   
	//--------------------------------------------------
		   while(true)
		   {
		System.out.println("Enter adharno");
		   String adharno=sc.next();
		   long adhaar=Long.parseLong(adharno);
		   int count=0;
		   long no=adhaar;
		   for(long i=no;i>0;i=i/10)
		   {
			count++;   
		   }
		   if(count==12)
		   {   
			  ac.setAdharno(adharno);
			  break;
			   
		   }
		   else {
			   throw new InvalidAdharNoException("Enter valid adhar number must be 12 digit");
			   
		 	   //System.out.println("Enter valid Aadhar number");
		        }
		   
		   }
		   
		 //------------------------------------------  
	        while(true)
	        {
		   System.out.println("Enter gender");
		   String gender=sc.next();
		   if(gender.equals("male") || gender.equals("female")|| gender.equals("m") ||gender.equals("f") ||gender.equals("M")|| gender.equals("F")|| gender.equals("MALE")||gender.equals("FEMALE")||gender.equals("Female")||gender.equals("Male"))
		   {
			   ac.setGender(gender);
			   break;
		   }
		   else
		      {
			   throw new InvalidGenderException("Enter valid Gender");
			   //System.out.println("Enter valid gender");
			   
		      }
	        }
		 //--------------------------------------
            while(true)
            {
		      System.out.println("Enter age");
		      int age=sc.nextInt();
		      if(age>18)
			   {
		          ac.setAge(age);
		          System.out.println("continue");
		          break;
		   } 
		   else {
			   throw new InvalidAgeException("Enter above 18 Age ");
			   //System.out.println("Enter age 18 or greater");
		   }
            } 
		  //--------------------------------------------  
		while(true)
		{
		System.out.println("Enter balance");
		   double balance=sc.nextDouble();
		   if(balance>=500)
		   {
		   ac.setBalance(balance);
		   System.out.println("continue");
		   break;
		   
		   }
		   else
		   {
			   throw new InvalidBalanceException("Enter above 500 balance");
			   //System.out.println("Enter above 500/ balance");
			  
		   }
		}
       
	}
	
  public void displayAllDetails()
	{   
		System.out.println("Account number is:"+ ac.getAccno());
		System.out.println("Account name is:"+ ac.getName());
		System.out.println("Account mobile no is:"+ ac.getMobno());
		System.out.println("Account adharno is:"+ ac.getAdharno());
		System.out.println("Account gender is:"+ ac.getGender());
		System.out.println("Account age is:"+ ac.getAge());
		System.out.println("Account balance is:"+ ac.getBalance());
	}
	
  
  
  
  
  
  
  
   public void depositeMoney()
	{   
	   
		System.out.println("Enter deposite amount");
		 // double balance=sc.nextDouble();
		  
		  double totalbalance=ac.getBalance()+sc.nextDouble();
		  ac.setBalance(totalbalance);
		  System.out.println("Current Total balance is:"+totalbalance);	
	}
   public void withdrawal()
    {
	   System.out.println("Enter withdrawal amount:");
	       //double balance=sc.nextDouble();
	       
	   double remainingbalance= ac.getBalance()-sc.nextDouble();
	   ac.setBalance(remainingbalance);
		   System.out.println("Remaining Balance is:"+remainingbalance);
	       
    }
   public void balanceCheck()
    {
	       System.out.println("Check balance:"+ ac.getBalance()); 
    }
   
   
   
   
		

}
