package com.sixdee.application.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.application.entity.SdKycFieldTypes;

@Repository
public interface SdKycFieldTypesRepo extends JpaRepository<SdKycFieldTypes, Integer>{

}
