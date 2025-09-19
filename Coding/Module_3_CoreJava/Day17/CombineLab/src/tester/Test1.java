package tester;
import static utils.StudentCollectionUtils.populateMap;
import static utils.StudentCollectionUtils.populateList;

import com.app.core.Student;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<>(populateMap(populateList())); 
		System.out.println("All Students Details");
		map.values()
		.forEach(t-> System.out.println(t));
		
	}

}
