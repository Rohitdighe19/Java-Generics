package com.Generics;
import java.util.Scanner;

//Finding maximum from given three integers

public class FindMaximum  {
	  // test case 1.1 Giving Max Number at 1st position return same number
	  // test case 1.2 Giving Max Number at 2nd position return same number
	  // test case 1.3 Giving Max Number at 3rd position return same number
	  public static Integer testMax(Integer intX, Integer intY, Integer intZ) {
	      Integer max = intX;
	      if (intY.compareTo(max) > 0) {
	          max = intY; // Y is the largest
	      }
	      if (intZ.compareTo(max) > 0) {
	          max = intZ; // z is the largest
	      }
	      return max; //returns largest value
	  }

	  //Giving three float values and finding maximum at first , second and third position.
	  public static Float testMax(Float floatX, Float floatY, Float floatZ) {
	      Float max = floatX;
	      if (floatY.compareTo(max) > 0) {
	          max = floatY;
	      }
	      if (floatZ.compareTo(max) > 0) {
	          max = floatZ;
	      }
	      return max;
	  }

	  public static void main(String args[]) {
	      System.out.println(testMax(10, 20, 7));
	      System.out.println(testMax(10.2f, 12.4f, 7.8f));

	  }
	  
	 
	}