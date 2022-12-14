package com.sixdee.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.application.entity.SdKycFieldMaster;
import com.sixdee.application.repo.SdKycFieldMasterRepo;
import com.sixdee.application.services.SdKycFieldMasterServices;

@RestController
@RequestMapping("/api")
public class SdKycFieldMasterController {
	@Autowired
	private SdKycFieldMasterServices FieldMasterServices;
	@Autowired
	private SdKycFieldMasterRepo repo;
	
	/*@PostMapping("/addSdKycFieldMaster")
	public ResponseEntity<SdKycFieldMaster> add(@RequestBody SdKycFieldMaster fieldmaster){
		System.out.println("Details Added.....");
		return new ResponseEntity<SdKycFieldMaster>(FieldMasterServices.add(fieldmaster), HttpStatus.OK);
	}*/
	@PostMapping("/addSdKycFieldMaster")
	public int add(@RequestBody SdKycFieldMaster fieldmaster) {
		FieldMasterServices.add(fieldmaster);
		System.out.println("Data Added.....");
		return 0;
	}
	@DeleteMapping("deleteSdKycFieldMaster/{fieldId}")
	public ResponseEntity<SdKycFieldMaster> deleteMaster(@PathVariable("fieldId") int fieldId){
		System.out.println("Data Deleted.....");
		return new ResponseEntity<SdKycFieldMaster>(FieldMasterServices.deleteMatser(fieldId), HttpStatus.OK);
	}

	@GetMapping("/getAllSdKycFieldMaster")
	public List<SdKycFieldMaster> getAllSdKycFieldMaster(){
		System.out.println("Data feteched.....");
		return repo.findAll();
	}

}
