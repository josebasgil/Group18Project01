package com.syntax.group18project01;
import java.util.Scanner;
public class ProjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int[] numbers=new int[5];
		int sum=0;
		System.out.println("Enter 5 numbers:");
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=input.nextInt();
			sum+=numbers[i];
		}
		System.out.println("The sum of numbers are: ");
		System.out.print(sum);
		
	}

}
