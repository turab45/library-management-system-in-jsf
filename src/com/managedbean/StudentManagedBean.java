package com.managedbean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "studentMB")
@ViewScoped
public class StudentManagedBean {
	private Integer id;
	private String rollNo;
	private String name;
	private Date dateOfBirth;
	private String contact;
	private String email;
	
}
