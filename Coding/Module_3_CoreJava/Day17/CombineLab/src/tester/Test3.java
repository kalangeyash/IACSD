package tester;
import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import com.app.core.Student;
import com.app.core.Subject;
import com.app.core.Address;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
 * 3.2 Print sum of  marks of students of all students from the specified state
i/p : name of the state */


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println("Sum of students marks from specific State");
		System.out.println("Enter State");
		Scanner sc = new Scanner(System.in);
//		Subject subject = Subject.JAVA;
		String state = sc.next();
//		Subject subject1 = Subject.valueOf(sub);
		
		double sum = (double) map.values()
		.stream()
		.filter(t-> t.getAddress().getState().equals(state))
		.mapToDouble(t -> t.getmark())
		.sum();
		
		System.out.println(sum);

	}

}

