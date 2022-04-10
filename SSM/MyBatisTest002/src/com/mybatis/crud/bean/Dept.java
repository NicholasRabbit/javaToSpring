package com.mybatis.crud.bean;

public class Dept {
	private Integer did;
	private String dname;
	public Dept() {
		
	}
	
	public Dept(Integer did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
}
