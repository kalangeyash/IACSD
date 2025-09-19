
/*
 *3.5 Display names of students enrolled in a
 * specified subject , securing marks > specified marks
i/p : subject name , marks
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

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println("no  of students failed in from specific subject");
		System.out.println("Enter subject");
		Scanner sc = new Scanner(System.in);
//		Subject subject = Subject.JAVA;
		String sub = sc.next();
		Subject subject = Subject.valueOf(sub);
		System.out.println("Enter Marks Criteria");
		double marks = sc.nextDouble();
		
		
		map.values().stream()
		.filter(t-> t.getSubject() == subject)
		.filter(t -> t.getmark() > marks)
		.forEach(t-> System.out.println(t));
		
		
		
		

		

		
//		System.out.println(topper);

	}

}


