
package com.service;

import java.util.List;

import com.bean.bean;
import com.dao.daoclass;

public class serviceclass {
	private daoclass dao;
	
	public void saveUser(bean user){
		getdao().saveUser(user);
	}
	
	public void updateUser(bean user){
		getdao().updateUser(user);
	}
	
	public void DeleteUser(bean user){
		getdao().deleteUser(user);
	}
	
	public String listprojectname(String date){
		String a=getdao().listNames(date);
		return a;
	}
	
	public bean projectdetail(String name){
		bean a=getdao().details(name);
		return a;
	}
	
	public daoclass getdao() {
		return dao;
	}
	
	public void setdao(daoclass dao) {
		this.dao = dao;
	}
}
