package array_Revision;
import java.util.*;
public class rotate_Array {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		rotate(arr,k);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void rotate(int arr[],int k) {
		int n=arr.length;
		k=k%n;
		for(int j=1;j<=k;j++) {
			int last_ele=arr[n-1];
			for(int i=n-2;i>=0;i--) {
				arr[i+1]=arr[i];
				}
			arr[0]=last_ele;
		}
	}
}
