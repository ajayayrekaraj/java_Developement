package javaPatterns1;

import java.util.*;

public class pattern22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n ) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("1 ");
				j++;
			}
			space--;
			star += 2;
			row++;
			System.out.println();
		}
	}
}
