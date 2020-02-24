package com.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.bean.BookInfo;

@Service
public class BookServiceImpl implements BookService{

	private List<BookInfo> bookList = new ArrayList<>();
	

	@Override
	public List<BookInfo> bookInfo() {
		bookList.add(new BookInfo(101, "Head First Java", 500.00));
		bookList.add(new BookInfo(102, "Java: A Beginner's Guide", 300.00));
		bookList.add(new BookInfo(103, "Learn Java in One Day and Learn It Well", 280.00));
		bookList.add(new BookInfo(104, "Effective Java", 700.00));
		return bookList;
	}

	
	

}
