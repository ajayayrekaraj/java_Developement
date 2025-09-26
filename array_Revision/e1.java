package array_Revision;
import java.util.*;
public class e1 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int item=s.nextInt();
		linearSearch(arr,item);
		System.out.println(linearSearch(arr,item));
	}
	public static int linearSearch(int []arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<item){
				return i-1;
			}
		}
		return -1;
	}
}
