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

import com.code.exception.ResourceNotFoundException;
import com.code.service.IDoctorService;

@RestController
@RequestMapping("/dapi")
public class DoctorController {
	
	@Autowired
	IDoctorService doctorService;
	
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctorList() {
		return doctorService.findAllDoctors();
	}
	@GetMapping("/doctor/{id}")
	public Doctor getDoctor(@PathVariable int id) throws ResourceNotFoundException {
		Doctor d1 = doctorService.getDoctorById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Doctor not found for this id :: " + id));
		return d1;
	}
	@PostMapping("/doctor")
	public ResponseEntity<?> saveDoctor(@RequestBody Doctor doctor) {
	    Map<String, Object> map = new HashMap<>();
	    doctorService.createDoctor(doctor);
	    map.put("status", 1);
	    map.put("message", "Record is Saved Successfully!");
	    return new ResponseEntity<>(map, HttpStatus.CREATED);
	}
	
	@PutMapping("doctor/{id}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable int id, @RequestBody Doctor doctor)throws ResourceNotFoundException{
		return doctorService.updateDoctor(id, doctor);
	}
	
	@DeleteMapping("doctors/{id}")
	public ResponseEntity<Doctor> deleteDoctor(@PathVariable int id){
		return doctorService.deleteDoctor(id);
	}
	
	
	
}
