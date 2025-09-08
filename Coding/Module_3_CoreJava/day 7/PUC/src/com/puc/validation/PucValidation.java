package com.puc.validation;
import com.puc.exception.*;
public class PucValidation  {
	
	private final static int PUC_LIMIT = 20;
	
	public static  void pucValidate (int output) throws PollutingVehicleExcpetion
	{
		if(output<PUC_LIMIT) {
			throw new  PollutingVehicleExcpetion("PUC certificate will not be generated as it is over limit i.e "+PUC_LIMIT);
		}
		 System.out.println("PUC certificate generated successfully.");
	}

}
