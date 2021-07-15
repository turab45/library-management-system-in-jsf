package com.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "userMB")
@ViewScoped
public class UserManagedBean {
	private Integer id;
	private String name;
	private String email;
	private String type;
	
	
}
