package com.healthcare.dao;

import java.sql.SQLException;
import java.util.List;

import com.healthcare.pojos.Patient;
/*
 4.1 Patient sign in
i/p - email , password
o/p - Patient details (via Patient POJO ) or error message.

4.2 Display patient details born between start date & end date
i/p - start date , end date
o/p - List of patient details

4.3 Delete Patient Details
i/p - patient id 
o/p - a message (success | failure)

4.4 Interesting work (Optional !)
Book an appointment
i/p - doctor_id, patient_id, appointment_datetime
o/p - a message (booking successful or failed)
 */

public interface PatientDao {
	
	Patient patientSignin(String email,String password) throws SQLException;
	
	List<Patient> patientBetweenStartAndEnd(String d1,String d2) throws SQLException;
	
	String deletePatient(int id) throws SQLException;
	
	String bookAppointment(int pid,int docid, String dateTime) throws SQLException;
}
