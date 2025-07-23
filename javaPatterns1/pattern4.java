package javaPatterns1;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {
		Scanner aj = new Scanner(System.in);
		int n = aj.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("_");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
			star++;
			space--;
			System.out.println();
			row++;
		}
	}
}
