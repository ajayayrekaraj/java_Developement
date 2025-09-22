package datatypes_revision;
import java.util.*;
public class fib {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int one=0;
	int two=1;
	for(int i=1;i<=n;i++) {
		System.out.print(one+" ");
		int sum=one+two;
		one=two;
		two=sum;
	}
	System.out.println(one);
	
	}
} 
