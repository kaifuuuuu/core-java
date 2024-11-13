package project_3;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name:");
		String peru = scanner.nextLine();
		
		System.out.print("Enter reg no:");
		String num = scanner.nextLine();
		
		System.out.print("Enter grade:");
		String grade = scanner.nextLine();
		
		System.out.print("Enter percentage");
		float per = scanner.nextFloat();
		
		System.out.println(peru);
		System.out.println(num);
		System.out.println(grade);
		System.out.println(per);
		
		scanner.close();
		
		

	}

}
