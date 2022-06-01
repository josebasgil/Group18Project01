package com.syntax.group18project01;

public class ProjectEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]= {8, 10, 17, 21, 35, 29, 34};
		int first=numbers[0];
		int second=numbers[0];
		
		for (int i=0; i<numbers.length;i++) {
			if (numbers[i]>first) {
				second=first;
				first=numbers[i];
			} else if(numbers[i]>second) {
				second=numbers[i];
			}
		}
		System.out.println("The second largest number is "+second);
	}

}
