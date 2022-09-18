package com.bookmanagment1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Booklib {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("welcome to my book collection app");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("press 1 for add book ");
			System.out.println("press 2 for delete book ");
			System.out.println("press 3 for update book ");
			System.out.println("press 4 for display book ");
			System.out.println("press 5 for exit book ");
				
			int c=Integer.parseInt(br.readLine());
			if(c==1) {
				   		System.out.println("What is the Book id  ? ");
		                int idNumber = Integer.parseInt(br.readLine());
		                
		                System.out.println( "What is the Book cost ? ");
		                String bookcost = br.readLine();
		                
		                System.out.println( "What is the Book Name ? ");
		                String name = br.readLine();
		                
		                System.out.println( "What is the Book authorName ? ");
		                String authorname = br.readLine();
		                
		                Book b=new Book(idNumber,name,bookcost,authorname);
		               boolean result= bookdao.inserttodb(b);
		               if(result) {
		            	   System.out.println("successful added");
		               }
		               else {
		            	   System.out.println("error Not added in database");
		               }
		                System.out.println(b);
		                
				
			}
			else if(c==2) {
				System.out.println("Enter bookid for deleting");
				 int idNumber = Integer.parseInt(br.readLine());
				 boolean result= bookdao.deletetodb(idNumber);
			}
			else if(c==3) {
				System.out.println("Enter bookid for update the book");
				
				 int idNumber = Integer.parseInt(br.readLine());
				 
				 System.out.println( "Enter updated aBook Name ? ");
	                String name = br.readLine();
	                
				
				 boolean result= bookdao.updatetodb(idNumber,name);
				
			}
			else if(c==4) {
				System.out.println("details are ...");
				  bookdao.displaytodb();
			}
			else if(c==5) {
				
				break;
			}
			else {
			System.out.println("Thank you for visiting");
			}
		}
	}

}
