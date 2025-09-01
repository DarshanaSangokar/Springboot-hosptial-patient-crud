package com.code.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.code.entity.Doctor;


public interface IDoctorService {

	List<Doctor> findAllDoctors();
	Optional<Doctor>  getDoctorById(int id);
	Doctor createDoctor(Doctor doctor);
	ResponseEntity<Doctor> updateDoctor(Integer id, Doctor doctor);
	ResponseEntity<Doctor> deleteDoctor(Integer doctorId);
}
