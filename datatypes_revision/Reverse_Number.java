package datatypes_revision;
import java.util.*;
public class Reverse_Number {
	public static int reverse(int x) {
		int sum=0;
		while(x!=0) {
			int rem=x%10;
			sum=(sum*10)+rem;
			x=x/10;
		}
		return sum;
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		reverse(n);
		System.out.println(reverse(n));
	}
}
