package com.sixdee.application.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.application.entity.SdKycFieldMaster;
import com.sixdee.application.repo.SdKycFieldMasterRepo;
import com.sixdee.application.services.SdKycFieldMasterServices;
@Service
public class SdKycFieldMasterServicesimpl implements SdKycFieldMasterServices{
	@Autowired
	private SdKycFieldMasterRepo repo;
	
	public SdKycFieldMasterServicesimpl(SdKycFieldMasterRepo repo) {
		super();
		this.repo = repo;
	}


	@Override
	public SdKycFieldMaster add(SdKycFieldMaster fieldmaster) {
		// TODO Auto-generated method stub
		return repo.save(fieldmaster);
	}


	@Override
	public void delete(int fieldId) {
		// TODO Auto-generated method stub
		repo.findById(fieldId).orElseThrow(null);
		repo.deleteById(fieldId);
		
	}


	@Override
	public List<SdKycFieldMaster> getAllSdKycFieldMaster(SdKycFieldMaster fieldmaster) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
