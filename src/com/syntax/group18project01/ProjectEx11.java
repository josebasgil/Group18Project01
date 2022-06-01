package com.syntax.group18project01;

public class ProjectEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors= {"Pink", "Blue", "White", "Black", "Pink","Red", "Yello", "Red"};
		String reference=colors[0];
		for (int i=0;i<colors.length;i++) {
			for(int j = i + 1; j < colors.length; j++) {  
	                if(colors[i] == colors[j]) {  
	                    System.out.println(colors[j]);  
	            }  
	        }  
		}
	}

}
