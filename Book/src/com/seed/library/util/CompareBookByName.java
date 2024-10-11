package com.seed.library.util;

import java.util.Comparator; 
import com.seed.library.Book;

public class CompareBookByName implements Comparator <Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		String s1 = b1.getBname();
		String s2 = b2.getBname();
		return s1.compareTo(s2);
	}
	
	
}
