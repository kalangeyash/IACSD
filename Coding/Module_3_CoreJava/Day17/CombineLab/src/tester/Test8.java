
/*
3.7 Display  student details for specified subject , sorted as per DoB
*/
package tester;
import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import com.app.core.Student;
import com.app.core.Subject;
import com.app.core.Address;

import java.util.Comparator;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println(" which students from the subject you want to sort by dob");
		System.out.println("Enter subject");
		Scanner sc = new Scanner(System.in);
//		Subject subject = Subject.JAVA;
		String sub = sc.next().toUpperCase();
		Subject subject = Subject.valueOf(sub);
//		double failure = 5.0;
		
		
		map.values()
		.stream()
		.filter(t-> t.getSubject() == subject)
		.sorted((t1,t2)-> t1.getDob().compareTo(t2.getDob()))
		.forEach(t -> System.out.println(t));
		
		
		


		

		
//		System.out.println(topper);

	}

}


