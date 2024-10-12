package com.seed.library;

import java.io.Serializable;  
import java.util.*;
//Book class 
public class Book implements Serializable, Comparable<Book>{
	
	int bid;
	String bname;
	Set<String> authors ;
	int price;
	
	public Book() {
		super();
	}

	public Book(int bid, String bname, Set<String> authors, int price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.authors = authors;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Set<String> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", authors=" + authors + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book b) {
		if(this.bid > b.bid)
			return 1;
		if(this.bid > b.bid)
			return -1;
		return 0;
	}
	
}
