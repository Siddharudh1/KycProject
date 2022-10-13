package com.sixdee.application.services;

import org.springframework.stereotype.Service;

import com.sixdee.application.entity.SdKycFieldTypes;
@Service
public interface SdKycFieldTypesServices {
	SdKycFieldTypes add(SdKycFieldTypes fieldTypes);
	void delete(byte Id);
}
