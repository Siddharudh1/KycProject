package com.sixdee.application.services;

import org.springframework.stereotype.Service;

import com.sixdee.application.entity.SdKycGroups;
@Service
public interface SdKycGroupServices {
	SdKycGroups add(SdKycGroups sdGrpup);
	void delete(int id);
}
