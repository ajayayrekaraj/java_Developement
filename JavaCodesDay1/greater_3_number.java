package JavaCodesDay1;

import java.util.Scanner;

public class greater_3_number {
	public static void main(String[] args) {
		Scanner aj = new Scanner(System.in);

		int a = aj.nextInt();
		int b = aj.nextInt();
		int c = aj.nextInt();

		if (a > b && a > c)
			System.out.println(+a + " a is greater");
		else if (a >= b && a >= c)
			System.out.println("a and c equal");
		else if (b > a && b > c)
			System.out.println(+b + " b is greater");
		else if (b >= a && b >= c)
			System.out.println("b and c is equal");
		else
			System.out.println(+c + " c is greater");
	}

}
