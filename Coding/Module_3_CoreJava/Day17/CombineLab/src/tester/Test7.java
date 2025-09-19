
/*
3.6 Suppose a particular subject faculty is unavailable for few days.
 So you have to inform the students of specified subject. 
Collect the specified subject students into the list n display it.
i/p : subject name
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

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println("To which students tell your subject techer is not coming for few days");
		System.out.println("Enter subject");
		Scanner sc = new Scanner(System.in);
//		Subject subject = Subject.JAVA;
		String sub = sc.next().toUpperCase();
		Subject subject = Subject.valueOf(sub);
//		double failure = 5.0;
		
		map.values()
		.stream()
		.filter(t-> t.getSubject() == subject)
		.forEach(t-> System.out.println(t));
		
		
		


		

		
//		System.out.println(topper);

	}

}


