package com.code.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.entity.Doctor;

public interface DoctorRespository extends JpaRepository<Doctor,Integer> {

	

}
