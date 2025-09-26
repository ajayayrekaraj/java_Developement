package datatypes_revision;
import java.util.*;
public class Armstrong {
	public static int CountOfDigits(int x) {
		int count=0;
		while(x!=0) {
			x=x/10;
			count++;
		}
		return count;
	}
	public static boolean isArmstrong(int x) {
		int d=CountOfDigits(x);
		int temp=x;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum=(int)(sum+Math.pow(rem, d));
			temp=temp/10;
		}
		if(sum==x) return true;
		else return false;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//isArmstrong(n);
		//CountOfDigits(n);
		//System.out.println(CountOfDigits(n));
		System.out.println(isArmstrong(n));
	}
}
