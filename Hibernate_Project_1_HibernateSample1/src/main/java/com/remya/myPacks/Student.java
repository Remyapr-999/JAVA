package com.remya.myPacks;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;
@Entity
public class Student {
	@Id
	private int sid;
	
	private String sname;
	private String sgender;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	
	

}
