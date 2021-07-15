package com.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "bookMB")
@ViewScoped
public class BookManagedBean {
	private Integer id;
	private String bookCode;
	private String title;
	private AuthorManagedBean author;
	private Integer noOfCopies;
	private CategoryManagedBean category;
}
