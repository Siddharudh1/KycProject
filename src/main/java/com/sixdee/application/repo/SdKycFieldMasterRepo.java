package com.sixdee.application.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.application.entity.SdKycFieldMaster;
@Repository
public interface SdKycFieldMasterRepo extends JpaRepository<SdKycFieldMaster, Integer>{

}
