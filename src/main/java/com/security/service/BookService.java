package com.security.service;

import java.util.List;

import com.security.bean.BookInfo;


public interface BookService {
	
	public List<BookInfo> bookInfo();
	
	default String info() {
		return "Welcome to LDAP Authentication Tutorial";
	}

}
