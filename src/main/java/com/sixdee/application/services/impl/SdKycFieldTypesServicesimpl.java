package com.sixdee.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.application.entity.SdKycFieldTypes;
import com.sixdee.application.repo.SdKycFieldTypesRepo;
import com.sixdee.application.services.SdKycFieldTypesServices;
@Service
public class SdKycFieldTypesServicesimpl implements SdKycFieldTypesServices{
	@Autowired
	private  SdKycFieldTypesRepo repo;

	public SdKycFieldTypesServicesimpl(SdKycFieldTypesRepo repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public SdKycFieldTypes add(SdKycFieldTypes fieldTypes) {
		return repo.save(fieldTypes);
	}

	@Override
	public void delete(byte Id) {
		repo.findById(Id).orElseThrow(null);
		repo.deleteById(Id);
	}

}
