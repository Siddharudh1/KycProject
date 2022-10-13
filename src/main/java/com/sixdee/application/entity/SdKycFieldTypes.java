package com.sixdee.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name="SD_KYC_FIELD_TYPES")
public class SdKycFieldTypes {
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
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

	@Override
	public String toString() {
		return "SdKycFieldTypes [Id=" + id + ", name=" + name + "]";
	}

	public SdKycFieldTypes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SdKycFieldTypes() {
		super();
	}
	
}
