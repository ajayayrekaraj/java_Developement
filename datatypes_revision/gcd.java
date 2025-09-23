package datatypes_revision;
import java.util.*;
public class gcd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident =sc.nextInt();
		//int rem=0;
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.print(divisor);
	}
}
