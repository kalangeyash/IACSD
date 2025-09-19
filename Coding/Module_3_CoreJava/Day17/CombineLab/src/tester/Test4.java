
/*
 * 3.3 Print name of specified subject  topper
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

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println("Sum of students marks from specific State");
		System.out.println("Enter State");
		Scanner sc = new Scanner(System.in);
//		Subject subject = Subject.JAVA;
		String sub = sc.next();
		Subject subject = Subject.valueOf(sub);
		
		Student topper = map.values()
		.stream()
		.filter(t-> t.getSubject() == subject)	
		.max((t1,t2) -> Double.compare(t1.getmark(),t2.getmark()))
		.orElseThrow(null);
		
		System.out.println(topper);
		
		

		

		
//		System.out.println(topper);

	}

}


