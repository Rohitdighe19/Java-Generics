package com.Generics;


//Finding maximum from given three integers

public class FindMaximum  <E extends Comparable<E>>{
	
	E a, b, c;
	
	public FindMaximum(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

public static <E extends Comparable<E>> E testMax(E a, E b, E c) {
	E max = a;
	if (b.compareTo(max) > 0)
		max = b;
	if (c.compareTo(max) > 0)
		max = c;
	return max;
}

 public static void main(String args[]) {
      System.out.println(testMax(10, 20, 7));
      System.out.println(testMax(10.2f, 12.4f, 7.8f));
      System.out.println(testMax("Apple","Banana","Orange"));

  }
}
