package com.bookmanagment1;

public class Book {
	 	
		private int idNumber;
	 	private String name;
	 	private String BookCost;
	    private String Authorname;
	    
	    
	    
	    
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Book(int idNumber, String name, String bookCost, String authorname) {
			super();
			this.idNumber = idNumber;
			this.name = name;
			this.BookCost = bookCost;
			this.Authorname = authorname;
		}

		

		public int getIdNumber() {
			return idNumber;
		}
		public void setIdNumber(int idNumber) {
			this.idNumber = idNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBookCost() {
			return BookCost;
		}
		public void setBookCost(String bookCost) {
			BookCost = bookCost;
		}
		public String getAuthorname() {
			return Authorname;
		}
		public void setAuthorname(String authorname) {
			Authorname = authorname;
		}
		@Override
		public String toString() {
			return "Book [idNumber=" + idNumber + ", name=" + name + ", BookCost=" + BookCost + ", Authorname="
					+ Authorname + "]";
		}
	    
	    
	    
}
