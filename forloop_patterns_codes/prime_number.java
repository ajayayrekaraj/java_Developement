package forloop_patterns_codes;

import java.util.*;

public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println(" Not prime number");
		}else {
			System.out.println("Prime number");
		}
	}
}
