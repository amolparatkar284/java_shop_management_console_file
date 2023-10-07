package usermangemnt2;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class usermanagemnt {
	static ArrayList<userobject> a2 = new ArrayList<>();
	static
	{
		try {
			loadDataFromFileToArrayList11();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	public static void usermaagemnt()  throws IOException {
		Scanner sc=new Scanner(System.in);
		boolean canIKeepRunningTheProgram=true;
		while (canIKeepRunningTheProgram==true)
		{
			System.out.println("**Welcome to user_management**");
			System.out.println("\n");
			System.out.println("what would you like to do?");
			System.out.println("1. Add emplyoee");
			System.out.println("2. Edit user");
			System.out.println("3. delete user");
			System.out.println("4. search user");
			System.out.println("5. Quit");
			int optionSelectedByUser = sc.nextInt();
			if (optionSelectedByUser==Useroption.QUIT_USER){
				File file =new File ("C:\\Users\\amolp\\eclipse-workspace\\SHOPMANAGEMNT2\\src\\usermangemnt2\\amol1.csv");
				FileWriter fr = new FileWriter (file,false);
				BufferedWriter br = new BufferedWriter(fr);
				
				for(userobject user:a2)
				{
					System.out.println(user.Emplyoeename+""+user.username+""+user.password+""+user.conformpassword+"\n"); 
					br.write(user.Emplyoeename+","+user.username+","+user.password+","+user.conformpassword+"\n"); 
				}
			
				br.close(); 
				fr.close();
				file=null;
				
				
				System.out.println("Program closed");
				canIKeepRunningTheProgram=false;
				System.out.println("after While loop");
			}	else if	(optionSelectedByUser==Useroption.ADD_USER) {				
			addUser();
				System.out.println("\n");
				
				}
			 else if (optionSelectedByUser==Useroption.SEARCH_USER) {
				 System.out.println ("Enter your name to search");
				 sc.nextLine();
				 String sn=sc.nextLine();
				 SearchUser(sn);
					System.out.println ("\n");

			 }
				else if(optionSelectedByUser==Useroption.DELETE_USER)
				{
					System.out.println ("Enter your Name to delete");
					sc.nextLine();
					String deleteUserName=sc.nextLine();
					deleteUserName(deleteUserName);
					System.out.println ("\n");
					
				}
				else if(optionSelectedByUser==Useroption.EDIT_USER)
				{
					System.out.println ("Enter your Name to edit");
					sc.nextLine();
					String editUserName=sc.nextLine();
					editUserName(editUserName);
					System.out.println ("\n");
				}
			
			
			
			System.out.println("After while loop??");
			for(userobject u:a2) {
			System.out.println(u.Emplyoeename);
			System.out.println(u.username);
			System.out.println(u.password);
			System.out.println(u.conformpassword);
		}
		for (userobject u:a2)
		{
			System.out.println(u.Emplyoeename);
			System.out.println(u.username);
			System.out.println(u.password);
			System.out.println(u.conformpassword);	
		}
		
			}}
			
private static void loadDataFromFileToArrayList111() {
		// TODO Auto-generated method stub
		
	}
public static void addUser() {
Scanner sc=new Scanner(System.in);
userobject user=new userobject();

System.out.println("Enter emplyoee name"); 
user.Emplyoeename =sc.nextLine();

System.out.println("Enter user name");
user.username=sc.nextLine();

System.out.println("Enter password");
user. password=sc.nextLine();

System.out.println("Enter conform password");
user. conformpassword=sc.nextLine();


System.out.println("Emplyoeename"+"\t"+user.Emplyoeename);
System.out.println("username"+"\t"+user.username);
System.out.println("password"+"\t"+user.password);
System.out.println("userobject.conformpassword"+"\t"+user.conformpassword);
a2.add(user);
}
public static void SearchUser(String Emplyoeename) {
for (userobject user :a2) {
	if (user.Emplyoeename != null && user.Emplyoeename.equalsIgnoreCase(Emplyoeename)) {
	System.out.println("Emplyoeename Name"+user.Emplyoeename);
	System.out.println("username"+user.username);
	System.out.println("password"+user.password);
	System.out.println("conformpassword"+user.conformpassword);
	return;
}
}
System.out.println("User Not Found");
}
public static void deleteUserName(String Emplyoeename) {
Iterator<userobject>userIterator=a2.iterator();
while(userIterator.hasNext()) {
	userobject user=userIterator.next();
	if(user.Emplyoeename.equalsIgnoreCase(Emplyoeename)) {
	userIterator.remove();	
	System.out.println("userobject"+user.Emplyoeename+"has been deleted");
	break;
	}}}
	public static void editUserName(String Emplyoeename) 
	{{
		for (userobject user :a2) {
			if(user.Emplyoeename.equalsIgnoreCase(Emplyoeename)) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Editing user"+ user.Emplyoeename);
				
				System.out.println("new Emplyoeename name"); 
				user.Emplyoeename =sc.nextLine();

				System.out.println("Enter new user name");
				user.username=sc.nextLine();

				System.out.println("Enter new password");
				user. password=sc.nextLine();

				System.out.println("Enter new conform password");
				user. conformpassword=sc.nextLine();
				
				System.out.println("USER INFORMATION IS UPDATE");
				
				return;


				

				
			}

			
		}
		System.out.println("user not found");}

	
	}
public static void loadDataFromFileToArrayList11() throws IOException
{
	File file =new File ("C:\\Users\\amolp\\eclipse-workspace\\SHOPMANAGEMNT2\\src\\usermangemnt2\\amol1.csv");
	FileReader fr = new FileReader (file);
	BufferedReader br = new BufferedReader(fr);
	String line="";
	while( (line=br.readLine())!=null)
	{
		userobject user= new userobject();
		String [] userDataArray=line.split(",");
		if(userDataArray.length>3)
		{
			user.Emplyoeename=userDataArray[0];
			user.username=userDataArray[1];
			user.password=userDataArray[2];
			user.conformpassword=userDataArray[3];
			a2.add(user);
		}
	}
	br.close();
	fr.close();
	file=null; 
}
	

public static boolean validateUserobjectAndPassword(String Emplyoeename, String Password)
{
	
	Iterator<userobject>userIterator=a2.iterator();
	while(userIterator.hasNext())
	{
		userobject user=userIterator.next();
		if(user.Emplyoeename.equalsIgnoreCase(Emplyoeename)&&user.password.equalsIgnoreCase(Password))
			return true;
	}

return false;

	}}
