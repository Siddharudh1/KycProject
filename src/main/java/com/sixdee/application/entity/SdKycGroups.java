package com.sixdee.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="SD_KYC_GROUPS")
public class SdKycGroups {
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="GROUP_NAME")
	private String groupName;
	
	@Column(name="LABEL")
	private String label;
	
	@Column(name="GROUP_ORDER")
	private int groupOrder;
	
	@Column(name="PARENT")
	private int parent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(int groupOrder) {
		this.groupOrder = groupOrder;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public SdKycGroups(int id, String groupName, String label, int groupOrder, int parent) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.label = label;
		this.groupOrder = groupOrder;
		this.parent = parent;
	}

	public SdKycGroups() {
		super();
	}

	@Override
	public String toString() {
		return "SdKycGroup [id=" + id + ", groupName=" + groupName + ", label=" + label + ", groupOrder=" + groupOrder
				+ ", parent=" + parent + "]";
	}
	
	
}

	