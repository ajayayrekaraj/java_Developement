package practiseArray;
import java.util.*;
public class second_max {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		second_Maximum(arr);
		System.out.println(second_Maximum(arr));
	}
	public static int second_Maximum(int arr[]) {
		int max=Integer.MIN_VALUE;
		int Second_max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				Second_max=max;
				max=arr[i];
			}
		}
		return Second_max;
	}
}
