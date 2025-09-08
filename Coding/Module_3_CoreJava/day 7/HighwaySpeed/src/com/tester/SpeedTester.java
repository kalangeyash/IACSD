package com.tester;
import com.vehicle.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;



public class SpeedTester {
    public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter the speed of the vehicle: ");
                int speed = sc.nextInt();

                
                VehicleValidation.validateSpeed(speed);

            } catch (VehicleSpeedExcpetion e) {
                
            	System.err.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                
                System.err.println("Error: Invalid input. Please enter a valid number for speed.");
            }
            catch(NoSuchElementException e)
            {
            	System.err.println("no Such element excpetion");
            }
    	
    }
}
