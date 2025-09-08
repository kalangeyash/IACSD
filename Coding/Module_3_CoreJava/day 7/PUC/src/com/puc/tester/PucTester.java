package com.puc.tester;
import java.util.*;
import com.puc.exception.*;
import com.puc.validation.*;

public class PucTester {

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("enter polutionlevel");
			int output = sc.nextInt();
			
			PucValidation.pucValidate(output);
			
		}catch(PollutingVehicleExcpetion e)
		{
			System.err.println("Error : " + e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.err.println("Error : "+e.getMessage());
		}
	}
}
