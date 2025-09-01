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
	/**********/
	// delete
	public ResponseEntity<Patient> deletePatient(Long patientId) {
		Patient patient =patientRepo.findById(patientId).get();
		patientRepo.deleteById(patientId);
		return ResponseEntity.ok(patient);
	}

	public ResponseEntity<Patient> updatePatient(long id, Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/// THIS MIGHT BE NOT SUITABLE I GUESS DOCTOR IS REQUIRED:: HERE
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepo.save(patient);
	}

	// I HAVE TO IMPLEMENT THAT::
	
	//GET ALL PATIENTS BY DOCTORS
	//GET PATIENT BY ID
	// UPDATE PATIENT
	// DELETE PATIENT
	// ADD NEW PATIENT
	
	
}
