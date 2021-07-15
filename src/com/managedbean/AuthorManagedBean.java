package com.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "authorkMB")
@ViewScoped
public class AuthorManagedBean {
	private Integer id;
	private String name;
	private Integer noOfPublications;
	
}
