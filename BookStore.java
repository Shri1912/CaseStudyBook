package com.book;
import java.util.*;

public class BookStore {
	List<Book>Blist = new ArrayList<Book>();
	public void addBook(Book b) {
		Blist.add(b);
	}
	
	
	public void display(List<Book> Blist) {
		System.out.println("Details of Book:");
		System.out.println("BookID\tTittle\tAuthor\tCategory\tPrice\t");
		for(Book b :Blist) {
			System.out.println(b.getBookID()+"    "+b.getTittle()+"    "+b.getAuthor()+"    "+b.getCategory()+"    "+b.getPrice());
		}
	}
	
	public void displybyid(String bookID) {
		System.out.println("BookID\tTittle\tAuthor\tCategory\tPrice\t");
		for(Book b:Blist) {
			if(b.getBookID().equals(bookID)) {
				System.out.println(b.getBookID()+"    "+b.getTittle()+"    "+b.getAuthor()+"    "+b.getCategory()+"    "+b.getPrice());	
			}
		}
	}
	
	public void displayAll() {
		System.out.println("Details of Book:");
		System.out.println("BookID\tTittle\tAuthor\tCategory\tPrice\t");
		for(Book b:Blist) {
			System.out.println(b.getBookID()+"    "+b.getTittle()+"    "+b.getAuthor()+"    "+b.getCategory()+"    "+b.getPrice());
		}
	}
	
	public List<Book> searchByTittle(String tittle) {
		List<Book> selectList = new ArrayList<Book>();
		for(Book b:Blist) {
			if(b.getTittle().equals(tittle)) {
				selectList.add(b);
			}
		}
		return selectList;
	}
	
	public List<Book> searchByAuthor(String author){
		List<Book> selectList = new ArrayList<Book>();
		for(Book b:Blist) {
			if(b.getAuthor().equals(author)) {
				selectList.add(b);
			}
		}
		return selectList;
	}
}
