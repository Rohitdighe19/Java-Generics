package com.Generics;
import java.util.Scanner;

//Finding maximum from given three integers

public class FindMaximum {
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

	  public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println(testMax(10, 5, 20));
	  }
	}