package com.managedbean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "userMB")
@ViewScoped
public class IssueManagedBean {
	private Integer id;
	private BookManagedBean book;
	private StudentManagedBean student;
	private UserManagedBean issuedBy;
	private Date issuedDate;
}
