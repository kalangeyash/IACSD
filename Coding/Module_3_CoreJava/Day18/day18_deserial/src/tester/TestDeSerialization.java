package tester;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class TestDeSerialization {

	public static void main(String[] args) {
		/*
		 * Restore the product map - using de-serialization
		 * 
		 */
		System.out.println("Enter bin file name - to restore details");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- OIS: de serial <----- FIS (bin file)
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(sc.nextLine()))) {
			Object o = in.readObject();
			System.out.println(o);//HashMap's to string {k1=v1,......}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
