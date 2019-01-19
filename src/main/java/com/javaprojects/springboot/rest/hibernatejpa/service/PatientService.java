package com.javaprojects.springboot.rest.hibernatejpa.service;

import java.util.List;

import com.javaprojects.springboot.rest.hibernatejpa.enity.Patient;

public interface PatientService {
	
	public List<Patient> findAll();
	
	public Patient findById(int theId);
	
	public void save(Patient thePatient);
	
	public void deleteById(int theId);

}
