package com.evaluation.problem1;

//import java.util.Objects;

public class Book implements Comparable<Book> {

	private int bookId ;
	private String bookName ;
	private String author ;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	
	public Book() {
	}
	@Override
	public int hashCode() {
		return bookId ;
	}
	public boolean equals(Book obj) {
		if(bookId == obj.bookId) {
			return  true  ;
		}
		else
			return false ;
		}
	@Override
	public int compareTo(Book o) {
		if(bookId == o.bookId) {
			return 0 ;
		}
		else if(bookId > o.bookId) {
			return 1 ;
		}
		else if(bookId<o.bookId) {
			return -1 ;
		}
		else
		return 0;
	}
	
}
