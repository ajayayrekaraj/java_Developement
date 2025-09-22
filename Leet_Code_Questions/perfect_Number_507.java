package Leet_Code_Questions;
import java.util.*;
public class perfect_Number_507 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			count++;
			sum+=i;
		}
	}
	if(sum==n) {
		System.out.println("Perfect Number");
	}else {
		System.out.println("Not Perfect Number");
	}
	}
}
