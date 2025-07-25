package javaPatterns1;

import java.util.*;

public class pattern28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int count = 1;
		while (row <= n * 2 - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int P = count;
			while (j <= star) {
				System.out.print(P + " ");
				if (j <= star / 2) {
					P++;
				} else {
					P--;
				}
				j++;
			}
			if (row < n) {
				space--;
				star += 2;
				count++;
			} else {
				space++;
				star -= 2;
				count--;
			}
			row++;
			System.out.println();
		}
	}

}