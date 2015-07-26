package com.mybatis.domain;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private String nation;
	public User() {
		
	}
	public User(int id,String name,String nation) {
		this.id=id;
		this.name=name;
		this.nation=nation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String toString() {
		return "User [id:"+this.id+";name:"+this.name+";nation:"+this.nation+"]";
	}
}
