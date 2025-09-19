package tester;
import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import com.app.core.Student;
import com.app.core.Subject;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
 * Display  details of the students from  specified subject */


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println("Details of students from specific subject");
		System.out.println("Enter subject");
		Scanner sc = new Scanner(System.in);
		Subject subject = Subject.JAVA;
//		String sub = sc.next().toUpperCase();
//		Subject subject1 = Subject.valueOf(sub);
		
		map.values()
		.stream()
		.filter(t-> t.getSubject() == subject)
		.forEach(t-> System.out.println(t));

	}

}

