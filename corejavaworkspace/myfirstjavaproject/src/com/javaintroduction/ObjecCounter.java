
package com.javaintroduction;

public class ObjecCounter {
	static int counter=0;
	{
		ObjecCounter.counter++ ;
	}
	public static void main(String[] args) {
	  new ObjecCounter();
	  new ObjecCounter();
	  new ObjecCounter();
	  new ObjecCounter();
	  new ObjecCounter();
	  System.out.println("Number of Objects Created:" +counter);

	}

}
