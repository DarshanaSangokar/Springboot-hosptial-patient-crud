package com.code.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="patient5")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String patientName;
	@Column
	private int age;
	@Column
	private String disease;
	
	@ManyToOne
	@JoinColumn(name="doctor_id",nullable=false)
	private Doctor doctor;
	//Many patients belong to one doctor

	public Patient(Long id, String patientName, int age, String disease, Doctor doctor) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.age = age;
		this.disease = disease;
		this.doctor = doctor;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", age=" + age + ", disease=" + disease
				+ ", doctor=" + doctor + "]";
	}
}

