package com.syntax.group18project01;

public class ProjectEx07OK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num = 17;
		    boolean f = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for non prime number
		      if (num % i == 0) {
		        f = true;
		        break;
		      }
		    }
		    if (!f)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		   
	}

}
