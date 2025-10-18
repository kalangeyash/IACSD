package com.healthcare.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.healthcare.pojos.Patient;

import static com.healthcare.utils.DBUtils.*;

public class PatientDaoImpl implements PatientDao {
	private Connection cn;
	private PreparedStatement ps1,ps2,ps3,ps4;
	
	
	public PatientDaoImpl() throws SQLException{
		cn = openConnection();
		
		ps1 = cn.prepareStatement("Select * from patients where email=? and password=?");
		ps2 = cn.prepareStatement("Select * from patients where dob between ? and ?");
		ps3 = cn.prepareStatement("delete from patients where id=?");
		
		System.out.println("Connected succcessfully and Constrtuctor succeded");
//		4.4 Interesting work (Optional !)
//		Book an appointment
//		i/p - doctor_id, patient_id, appointment_datetime
//		o/p - a message (booking successful or failed)

//		ps4.executeQuery("Insert into appointments( ");
		
	}

	@Override
	public Patient patientSignin(String email, String password) throws SQLException {
		Patient p = null;
		ps1.setString(1,email);
		ps1.setString(2, password);
		
		try (ResultSet rs =  ps1.executeQuery()){
		
			while(rs.next())
			{
				//int id, String name, String email, String password, int phone, LocalDate dob
				p = new Patient(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate());
			}
		
		}
		
		if(p!=null)
		{
			System.out.println("User Signed in successfully");
			
		}
		
		return p;
	}



	@Override
	public String deletePatient(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bookAppointment(int pid, int docid, String dateTime) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> patientBetweenStartAndEnd(String d1, String d2) throws SQLException {
		List<Patient> list = new ArrayList<>();
		
		LocalDate pd1 = LocalDate.parse(d1);
		LocalDate pd2 = LocalDate.parse(d2);
		
		ps2.setDate(1,Date.valueOf(pd1));
		ps2.setDate(2,Date.valueOf(pd2));
		
		try(ResultSet rs = ps2.executeQuery()){
			while(rs.next()) {
				list.add( new Patient(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate()));
				
			}
		}
		
		return list;
	}

}
