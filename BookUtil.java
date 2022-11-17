package com.bookutil;

import java.util.Scanner;

import com.book.*;

import com.book.exception.InvalidBookException;

public class BookUtil {

	public Book getbkobj() throws InvalidBookException{
		Scanner sc = new Scanner(System.in);
		System.out.println("BookID:");
		String BookId = sc.nextLine();
		
		System.out.println("Tittle:");
		String Tittle = sc.nextLine();
		
		System.out.println("Author:");
		String Author = sc.nextLine();
		
		System.out.println("Category:");
		String Category = sc.nextLine();
		
		System.out.println("Price:");
		float Price = sc.nextFloat();
		
		Book b1 = new Book(BookId,Tittle,Author,Category,Price);
		return b1;
	}
	
	public String getString() {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		return val;
	}
	
	public static void main(String[] args) throws InvalidBookException{
		BookUtil butil = new BookUtil();
		BookStore bs = new BookStore();
		for(int i= 0;i<1;i++) {
			System.out.println("Enter Book Details:"+i);
			bs.addBook(butil.getbkobj());
		}
		
		Scanner s  = new Scanner(System.in);
		System.out.println("Search by Tittle Name:");
		bs.display(bs.searchByTittle(butil.getString()));
		System.out.println("Search by Author Name:");
		bs.display(bs.searchByAuthor(butil.getString()));
		
		bs.displayAll();
		
		int Id;
		do {
			System.out.println("\n1.Add\t2.Modify\t3.Delete\t4.DisplayAll\t5.DisplaySpecific\t6.SearchByTittle\t7.SearchByAuthor\t8.Exit\n");
			System.out.println("Enter appropriate value:");
			Id = s.nextInt();
			switch(Id){
			case 1: 
				bs.addBook(butil.getbkobj());
				break;
				
			case 4:
				bs.displayAll();
				break;
				
			default:
				System.out.println("Successfull Execution of Book!!!");
				break;
			}
		}while(Id<8);
	}
	

}
