package tester;

import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

import com.app.core.Mgr;
import com.app.core.SalesMgr;
import static utils.GenericUtils.*;

public class Test1 {

	public static void main(String[] args) {
		// Test Cases - HashSet<Mgr> , LinkedList<String> , TreeSet<Double>
		HashSet<Mgr> managers=new HashSet<>();
		managers.add(new Mgr(1000));
		managers.add(new Mgr(2000));
		managers.add(new SalesMgr(3000));
		displayElements(managers);
		/*
		 * Collections class API
		 * public static void shuffle(List<?> anyList)
		 * Use this to shuffle Vector of Strings
		 */
		Vector<String> strings=new Vector<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		Collections.shuffle(strings);
		System.out.println(strings);
		
		
		
		

	}

}
