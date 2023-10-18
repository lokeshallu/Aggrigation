package com.kn.composition;

public class Book {
	
   Pages pages;
   
   public Book(String content) {
	   this.pages = new Pages(content);
   }
   public void readBook() {
	   System.out.println("Book reading is in progress...");
	 pages.displayContent();
   }
	

}
