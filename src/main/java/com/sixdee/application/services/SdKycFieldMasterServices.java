package com.sixdee.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sixdee.application.entity.SdKycFieldMaster;
@Service
public interface SdKycFieldMasterServices {
	 SdKycFieldMaster add(SdKycFieldMaster fieldmaster);
	 void delete(int fieldId);
	 List<SdKycFieldMaster> getAllSdKycFieldMaster(SdKycFieldMaster fieldmaster);
}
