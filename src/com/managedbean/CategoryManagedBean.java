package com.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name= "categoryMB")
@ViewScoped
public class CategoryManagedBean {
	private Integer id;
	private String category;
}
