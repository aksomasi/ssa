package com.ssa.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	
	@Id
	private Integer id;

	private  String uid;

	@Column(name="displayname")
	private String dname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String displayname) {
		this.dname = displayname;
	}

	
}
