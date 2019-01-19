package com.javaprojects.springboot.rest.hibernatejpa.dao;

import java.util.List;

import com.javaprojects.springboot.rest.hibernatejpa.enity.Patient;



public interface PatientDAO {
	
	//
	public List<Patient> findAll();
	
	public Patient findById(int patientId);
	
	public void save(Patient thePatient);
	
	public void deleteById(int patientId);

}
