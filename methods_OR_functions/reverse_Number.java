package methods_OR_functions;
import java.util.*;
public class reverse_Number {
	public static int Reverse(int n) {
		int temp=n;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		return rev;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Reverse(n));
	}

}
