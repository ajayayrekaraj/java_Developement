package javaPatterns1;

import java.util.*;

public class pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n * 2 - 2;
		int star = 1;
		while (row <= n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			space-=2;
			star++;
			System.out.println();
		}
	}
}
