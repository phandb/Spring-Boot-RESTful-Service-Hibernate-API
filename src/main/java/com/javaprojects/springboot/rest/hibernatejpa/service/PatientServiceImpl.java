package com.javaprojects.springboot.rest.hibernatejpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaprojects.springboot.rest.hibernatejpa.dao.PatientDAO;
import com.javaprojects.springboot.rest.hibernatejpa.enity.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	
	private PatientDAO patientDAO;
	
	//injection constructor
	@Autowired
	public PatientServiceImpl(PatientDAO thePatientDAO) {
		
		patientDAO = thePatientDAO;
	}

	
	@Override
	@Transactional
	public List<Patient> findAll() {
		
		return patientDAO.findAll();
	}

	@Override
	@Transactional
	public Patient findById(int theId) {
		
		return patientDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Patient thePatient) {

		patientDAO.save(thePatient);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {

		patientDAO.deleteById(theId);

	}

}
