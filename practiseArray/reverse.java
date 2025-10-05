package practiseArray;
import java.util.*;
public class reverse {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		reverse_Array(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int reverse_Array(int arr[]) {
		int j=0;
		int k=arr.length-1;
		while(j<k) {
			int temp=arr[j];
			arr[j]=arr[k];
			arr[k]=temp;
			j++;
			k--;
		}
		return j;
	}
}
