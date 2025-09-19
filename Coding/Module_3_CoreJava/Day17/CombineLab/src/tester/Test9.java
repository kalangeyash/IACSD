
/*
3.8 Find any student with GPA above 8
(Should run as short circuit operation, meaning the moment you come across any student with GPA > 8 , 
the streams should stop iterating & return the result immediately)
*/
package tester;
import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import com.app.core.Student;
import com.app.core.Subject;
import com.app.core.Address;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new TreeMap<>(populateMap(populateList())); 
		System.out.println(" First topper with  > 8 ");
//		System.out.println("Enter subject");
//		Scanner sc = new Scanner(System.in);
////		Subject subject = Subject.JAVA;
//		String sub = sc.next().toUpperCase();
//		Subject subject = Subject.valueOf(sub);
		double failure = 8.0;
		
		
		System.out.println(
			map.values()
			.stream()
			.filter(t -> t.getmark()>failure)
//			.sorted((t1,t2)-> Double.compare(t1.getmark(), t2.getmark()))
			.findFirst());	
		
		
		


		

		
//		System.out.println(topper);

	}

}


