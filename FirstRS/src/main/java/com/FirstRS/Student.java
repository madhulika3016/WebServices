package com.FirstRS;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private int sid;
	private String sname;
	private String tech;
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
}
