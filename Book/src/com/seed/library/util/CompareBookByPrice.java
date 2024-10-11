package com.seed.library.util;

import java.util.Comparator;

import com.seed.library.Book;

public class CompareBookByPrice implements Comparator <Book>{

	@Override
	public int compare(Book b1, Book b2) {
		int a1 = b1.getBid();
		int a2 = b2.getBid();
		
		if(a1>a2)
			return 1;
		if(a1<a2)
			return -1;
		return 0;
	}
}
