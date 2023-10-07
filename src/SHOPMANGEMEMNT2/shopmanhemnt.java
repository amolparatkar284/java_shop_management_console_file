package SHOPMANGEMEMNT2;

import java.io.IOException;
import java.util.Scanner;

import productmangement2.productmangement;
import usermangemnt2.usermanagemnt;



public class shopmanhemnt
{
public static void main(String[]args) throws IOException
{
	Scanner sc=new Scanner(System.in);

	boolean canIKeepRunningTheProgram=true;
	{
		System.out.println("***Welcome to SHOPMANAGEMENT***");
		System.out.println("\n");
		System.out.println("Enter Emplyoeename");
		String Emplyoeename=sc.nextLine();
		
		System.out.println("Enter Password");
		String password=sc.nextLine();
		
		if (!usermanagemnt.validateUserobjectAndPassword(Emplyoeename, password))
		{
			System.out.println("!!!LOGIN FAIL.. Please try again");
			return;
		}
		while (canIKeepRunningTheProgram==true)
		{
			
			System.out.println("***Welcome to SHOPMANAGEMENT***");
			System.out.println("\n");
			System.out.println("what would you like to do?");


		System.out.println("1.usermanagement ");
		System.out.println("2. productmanagement ");
		
		System.out.println("5. Quit");
		int optionSelectedByUser = sc.nextInt();
		if (optionSelectedByUser==1){
			usermanagemnt.usermaagemnt();
		}
		else if (optionSelectedByUser==2) {
			productmangement.Productmanagement();
		}
		else if (optionSelectedByUser==5) {
			break;
		}
		
		}
}
}
}