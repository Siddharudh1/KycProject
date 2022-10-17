package com.sixdee.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sixdee.application.entity.SdKycGroups;
@Repository
public interface SdKycGroupRepo extends JpaRepository<SdKycGroups, Integer>{
}