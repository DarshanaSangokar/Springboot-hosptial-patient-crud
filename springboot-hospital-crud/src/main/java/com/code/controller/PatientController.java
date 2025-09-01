package com.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.entity.Doctor;
import com.code.entity.Patient;
import com.code.exception.ResourceNotFoundException;
import com.code.service.DoctorService;
import com.code.service.PatientService;

@RestController //because we are creating restful web services.
@RequestMapping("/papi")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/patients")
	public List< Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
}

