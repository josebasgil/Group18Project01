package com.syntax.group18project01;

public class ProjectEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num= {67,-67,23,-56};
	    int max , min;
	    min=max = num[0];
	    for (int i = 1; i <num.length; i++) {
	        if (num[i] > max) {
	            max = num[i];
	        } else if(num[i]<min)
	        	 min=num[i];
	    }
	    System.out.println("max is:"+max+"   and  min is:"+min );
	}

}
