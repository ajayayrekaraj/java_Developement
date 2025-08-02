package Lec1;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>18) {
			System.out.println(n + " is eligible for voting ");
		}
		else {
			System.out.println(n + " is not eligible for voting ");
		}
	}

}
