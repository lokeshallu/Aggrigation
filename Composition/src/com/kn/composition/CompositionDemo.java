package com.kn.composition;

public class CompositionDemo {

	public static void main(String[] args) {
   Book book = new Book("head first java");
   
   book.readBook();
   book = null;
   System.out.println(".....book got stollen");
 
   
	}

}
