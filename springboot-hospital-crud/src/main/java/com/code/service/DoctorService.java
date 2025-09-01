package com.code.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.code.entity.Doctor;
import com.code.repository.DoctorRespository;

@Service
public class DoctorService implements IDoctorService {
	
	@Autowired
	DoctorRespository doctorRepo;
	
	@Override
	public List<Doctor> findAllDoctors(){
		return doctorRepo.findAll();
	}
	
	
	public Optional<Doctor> getDoctorById(int id) {
		return doctorRepo.findById(id);
	}
	
	@Override
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}
	
	//update
	public ResponseEntity<Doctor> updateDoctor(Integer doctorId, Doctor newDoctor){
		Doctor doctor =doctorRepo.findById(doctorId).get();
		    doctor.setName(newDoctor.getName());
		    doctor.setSpecialization(newDoctor.getSpecialization());
		    doctor.setContactNumber(newDoctor.getContactNumber());
		    doctor.setEmail(newDoctor.getEmail());
		    doctor.setGender(newDoctor.getGender());
		    doctor.setExperienceYears(newDoctor.getExperienceYears());
		    doctor.setConsultationFee(newDoctor.getConsultationFee());
		doctorRepo.save( doctor);
		return ResponseEntity.ok( doctor);	
	}
	
	//delete
	public ResponseEntity<Doctor> deleteDoctor(Integer doctorId){
		Doctor doctor =doctorRepo.findById(doctorId).get();
		doctorRepo.deleteById(doctorId);
		return ResponseEntity.ok(doctor);	
	}
}
