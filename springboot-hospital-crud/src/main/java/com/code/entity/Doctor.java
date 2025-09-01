package com.code.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myDoctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="dName",nullable=false)
	private String name;
	@Column(name="dSpecialization",nullable=false)
	private String specialization;
	@Column(name="dContactNumber",nullable=false)
	private String contactNumber;
	@Column(name="dEmail",nullable=false)
	private String email;
	@Column(name="dGender",nullable=false)
	private String gender;
	@Column(name="dExperienceYears",nullable=false)
	private int experienceYears;
	@Column(name="dConsultationFee",nullable=false)
	private double consultationFee;
	
	public Doctor(int id, String name, String specialization, String contactNumber, String email, String gender,
			int experienceYears, double consultationFee) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
		this.email = email;
		this.gender = gender;
		this.experienceYears = experienceYears;
		this.consultationFee = consultationFee;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", contactNumber="
				+ contactNumber + ", email=" + email + ", gender=" + gender + ", experienceYears=" + experienceYears
				+ ", consultationFee=" + consultationFee + "]";
	}
	

}
