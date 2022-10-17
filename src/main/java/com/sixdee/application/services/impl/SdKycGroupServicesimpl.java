package com.sixdee.application.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.application.entity.SdKycGroups;
import com.sixdee.application.repo.SdKycGroupRepo;
import com.sixdee.application.services.SdKycGroupServices;
@Service
public class SdKycGroupServicesimpl implements SdKycGroupServices{
	@Autowired
	private SdKycGroupRepo repo;

	@Override
	public SdKycGroups add(SdKycGroups sdGrpup) {
		return repo.save(sdGrpup);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
