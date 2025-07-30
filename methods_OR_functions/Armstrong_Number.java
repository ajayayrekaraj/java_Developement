package methods_OR_functions;
import java.util.*;
public class Armstrong_Number {
	public static int Count_of_Digit(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;	
	}
	public static boolean Armstrong(int n) {
		int d=Count_of_Digit(n);
		int sum=0;
		int temp=n;
		while(temp!=0) {
			int rem=temp%10;
			sum=(int)(sum+Math.pow(rem, d));
			temp=temp/10;
		}
		if(sum==n)
			return true;
		else
			return false;
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Armstrong(n));
	}
}
