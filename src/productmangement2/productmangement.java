package productmangement2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import productmangement2.productobject;


public class productmangement {
	private static final String Productname = null;
	static ArrayList<productobject> a2 = new ArrayList<>();
	public static void Productmanagement () throws IOException {
		Scanner sc=new Scanner(System.in);
		boolean canIKeepRunningTheProgram=true;
		while (canIKeepRunningTheProgram==true)
		{
			System.out.println("***Welcome to PRODUCT MANAGEMNT***");
			System.out.println("\n");
			System.out.println("what would you like to do?");
			System.out.println("1. Add productname");
			System.out.println("2. Edit product");
			System.out.println("3. delete product");
			System.out.println("4. search product");
			System.out.println("5. Quit");
			int optionSelectedByUser = sc.nextInt();
			if (optionSelectedByUser==Productoption.QUIT_PRODUCT){
				File file =new File ("C:\\Users\\amolp\\eclipse-workspace\\SHOPMANAGEMNT2\\src\\productmangement2\\amol2.vll");
				FileWriter fr = new FileWriter (file,true);
				BufferedWriter br = new BufferedWriter(fr);
				
				for(productobject user:a2)
				{
					System.out.println(user.productname+""+user.productid+""+user.productprice+""+user.confirmproductprice+"\n"); 
					br.write(user.productname+","+user.productid+","+user.productprice+","+user.confirmproductprice+"\n"); 
				}
			
				br.close(); 
				fr.close();
				file=null;
					
				System.out.println("Program closed");
				canIKeepRunningTheProgram=false;
			}	else if	(optionSelectedByUser==Productoption.ADD_PRODUCT) {				
			addProduct();
				System.out.println("\n");
				
				}
			 else if (optionSelectedByUser==Productoption.SEARCH_PRODUCT) {
				 System.out.println ("Enter your product to search");
				 sc.nextLine();
				 String searchproduct=sc.nextLine();
				 SearchProduct(searchproduct);
					System.out.println ("\n");

			 }
				else if(optionSelectedByUser==Productoption.DELETE_PRODUCT)
				{
					System.out.println ("Enter your product to delete");
					sc.nextLine();
					String deleteproduct=sc.nextLine();
					deleteproduct(deleteproduct);
					System.out.println ("\n");
					
				}
				else if(optionSelectedByUser==Productoption.EDIT_PRODUCT)
				{
					System.out.println ("Enter your product to edit");
					sc.nextLine();
					String editproduct=sc.nextLine();
					editproduct(editproduct);
					System.out.println ("\n");
				}
			
			
			
			
			for(int i=0;i<1;i++) {	
		for(int i1=0;i1<a2.size();i1++) {
			productobject u=a2.get(i1);
			System.out.println(u.productname);
			System.out.println(u.productid);
			System.out.println(u.productprice);
			System.out.println(u.confirmproductprice);
		}
		for (productobject u:a2)
		{
			System.out.println(u.productname);
			System.out.println(u.productid);
			System.out.println(u.productprice);
			System.out.println(u.confirmproductprice);	
		}
		
			}}
			}
public static void addProduct() {
Scanner sc=new Scanner(System.in);
productobject user2=new productobject();

System.out.println("Enter productname "); 
user2.productname =sc.nextLine();

System.out.println("Enter productid ");
user2.productid=sc.nextLine();

System.out.println("Enter productprice");
user2. productprice=sc.nextLine();

System.out.println("Enter confirmproductprice ");
user2. confirmproductprice=sc.nextLine();

System.out.println("Productname"+"\t"+user2.productname);
System.out.println("Productid"+"\t"+user2.productid);
System.out.println("Productprice"+"\t"+user2.productprice);
System.out.println("product.confirmproductprice"+"\t"+user2.confirmproductprice);
a2.add(user2);
}
public static void SearchProduct(String Emplyoeename) {
for (productobject user2 :a2) {
	if (user2.productname != null && user2.productname.equalsIgnoreCase(Productname)) {
	System.out.println("product Name"+user2.productname);
	System.out.println("productid"+user2.productid);
	System.out.println("password"+user2.productprice);
	System.out.println("conformpassword"+user2.confirmproductprice);
	return;
}
}
System.out.println("User Not Found");
}
public static void deleteproduct(String productname) {
Iterator<productobject>userIterator=a2.iterator();
while(userIterator.hasNext()) {
	productobject user2=userIterator.next();
	if(user2.productname.equalsIgnoreCase(productname)) {
	userIterator.remove();	
	System.out.println("product"+user2.productname+"has been deleted");
	break;
	}}
}
	public static void editproduct(String productname) 
	{
		{
		for (productobject user2 :a2) {
			if(user2.productname.equalsIgnoreCase(productname)) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Editing product"+ user2.productname);
				
				System.out.println("new productname "); 
				user2.productname =sc.nextLine();

				System.out.println("Enter new productid ");
				user2.productid=sc.nextLine();

				System.out.println("Enter new productprice");
				user2. productprice=sc.nextLine();

				System.out.println("Enter new confirmproductprice ");
				user2. confirmproductprice=sc.nextLine();
				
				System.out.println("Product INFORMATION IS UPDATE");
				
				return;	
			}
		}
		System.out.println("Product not found");
	}
}
}



	