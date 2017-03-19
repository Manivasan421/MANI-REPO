package com.bean;

public class bean
{
	String projectname,projectdetail,month,created,stratdate,enddate,status;
	int prjectid;
	public int userId;

	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public int getPrjectid() {
		return prjectid;
	}
	public void setPrjectid(int prjectid) {
		this.prjectid = prjectid;
	}
	public String getProjectdetail() {
		return projectdetail;
	}
	public void setProjectdetail(String projectdetail) {
		this.projectdetail = projectdetail;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getStratdate() {
		return stratdate;
	}
	public void setStratdate(String stratdate) {
		this.stratdate = stratdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
