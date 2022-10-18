package com.sixdee.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "SD_KYC_FIELD_TYPES")
public class SdKycFieldTypes 
{
	@Id
	@Column(name = "ID",nullable = false)
	private int id;
	
	@Column(name = "NAME")
	private String name;

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

	public SdKycFieldTypes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SdKycFieldTypes() {
		super();
	}

	@Override
	public String toString() {
		return "SdKycFieldTypes [id=" + id + ", name=" + name + "]";
	}

	
	
}
