package com.java.basics;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("enter:");
		int no = in.nextInt();
		
		if(no >= 0) {
		System.out.println(no);
		}
		else{
			System.out.println("input should not be less then 0 ");
		}
	}
}

