package com.vehicle;

public class VehicleValidation {
	 public static final int MIN_SPEED = 30;
	 public static final int MAX_SPEED = 80;
	 
	 public static void validateSpeed(int speed) throws VehicleSpeedExcpetion {
	        if (speed < MIN_SPEED || speed > MAX_SPEED) {
	            // If the speed is outside the allowed range, create and throw the custom exception.
	            throw new VehicleSpeedExcpetion("Speed is out of range! It must be between " + MIN_SPEED + " and " + MAX_SPEED + ".");
	        }
	        // If the speed is within the range, this message will be printed.
	        System.out.println("Speed is valid.");
	    }
}
