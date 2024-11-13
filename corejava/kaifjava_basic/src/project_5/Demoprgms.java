package project_5;

import java.util.Scanner;

public class Demoprgms {

	public static void main(String[] args) {
		
		int a,b,c,i,sum;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter A:");
		 a = s.nextInt();
		
		System.out.print("enter B:");
		 b = s.nextInt();
		
		System.out.print("enter C:");
		 c = s.nextInt();
		
		for( i = a; i <= b; i++) {
			
		      sum = (i/10)+(i%10);
			
			if(sum == c) {
				System.out.print(i+",");
			}
		}
		
		

	}

}
