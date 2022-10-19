package com.sixdee.application.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SD_KYC_FIELD_MASTER")
public class SdKycFieldMaster 
{
	@Id
	@Column(name = "FIELD_ID",nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fieldId;
	
	@Column(name = "FIELD_NAME")
	private String fieldName;
	
	@Column(name = "FIELD_TYPE")
	private int fieldType;
	
	@Column(name = "TAG_TYPE")
	private int tagType;
	
	@Column(name = "DROPDOWN")
	private String dropDown;
	
	
	@OneToMany(targetEntity = SdKycFieldTypes.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "id",referencedColumnName = "FIELD_ID")
	private List<SdKycFieldTypes> fieldTypes;
	
	@OneToMany(targetEntity = SdKycGroups.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "id",referencedColumnName = "FIELD_ID")
	private List<SdKycGroups> kycGroups;

	public List<SdKycFieldTypes> getFieldtypes() {
		return fieldTypes;
	}

	public void setFieldtypes(List<SdKycFieldTypes> fieldTypes) {
		this.fieldTypes = fieldTypes;
	}

	public List<SdKycGroups> getKycGroups() {
		return kycGroups;
	}

	public void setKycGroups(List<SdKycGroups> kycGroups) {
		this.kycGroups = kycGroups;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getFieldType() {
		return fieldType;
	}

	public void setFieldType(int fieldType) {
		this.fieldType = fieldType;
	}

	public int getTagType() {
		return tagType;
	}

	public void setTagType(int tagType) {
		this.tagType = tagType;
	}

	public String getDropDown() {
		return dropDown;
	}
	
	
	public void setDropDown(String dropDown) {
		this.dropDown = dropDown;
	}

	public SdKycFieldMaster(int fieldId, String fieldName, int fieldType, int tagType, String dropDown) {
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropDown = dropDown;
	}

	public SdKycFieldMaster() {
		super();
	}
	@Override
	public String toString() {
		return "SdKycFieldMaster [fieldId=" + fieldId + ", fieldName=" + fieldName + ", fieldType=" + fieldType
				+ ", tagType=" + tagType + ", dropDown=" + dropDown + ", fieldTypes=" + fieldTypes + ", kycGroups="
				+ kycGroups + "]";
	}
}