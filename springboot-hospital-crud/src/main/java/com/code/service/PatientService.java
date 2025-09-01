package com.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.code.entity.Doctor;
import com.code.entity.Patient;
import com.code.repository.PatientRepository;


@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientRepo;
	
	//Get all the patients
	public List<Patient> getAllPatients(){
		return patientRepo.findAll();
	}
	
	
	
}

