package javaPatterns1;

import java.util.*;

public class pattern26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int count = 1;
			while (j <= star) {
				System.out.print(count + " ");
				if (j <= star / 2) {
					count++;
				} else {
					count--;
				}
				j++;
			}
			System.out.println();
			row++;
			star += 2;
			space--;
		}
	}

}
