

package Project;

import java.math.*;
import java.util.Scanner;

public class BMICalculator  {

	public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   
   //To get the weight from the user;
   
   
   System.out.print("Enter the value of Weight (in kg) : ");
   float Weight = sc.nextFloat();
   
  
   //To get the height from the user;
   System.out.print("Enter the value of Height (in m) : ");
   float Height = sc .nextFloat();
   
   
   //To calculate the Body Mass Index;
   float BMI = Weight / (Height*2);
   
   //To round half the value ;
   BigDecimal bd = new BigDecimal(BMI);
   bd = bd.setScale(2, RoundingMode.HALF_UP);
   double roundedBMI = bd.doubleValue();
   
   //To print the Rounded BMI value;
   System.out.println("Your Body Mass Index (BMI) is " +  roundedBMI +" kg/m^2");
	
   
   // BMI Category 
   if (roundedBMI < 18.5) {
       System.out.println("Status : You are underweight.");
   } else if (roundedBMI < 24.9) {
       System.out.println("Status : You are in the normal weight range.");
   } else if (roundedBMI < 29.9) {
       System.out.println("Status : You are overweight.");
   } else {
       System.out.println("Status : You are obese.");
   }

   sc.close();
	}

}

