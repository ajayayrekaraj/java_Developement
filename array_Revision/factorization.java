package array_Revision;
import java.util.*;
public class factorization {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factor(n);
		System.out.println(factor(n));
	}
	public static int factor(int n) {
		int mul=1;
		while(n!=0) {
			mul=mul*n;
			n--;
		}
		return mul;
	}
}
