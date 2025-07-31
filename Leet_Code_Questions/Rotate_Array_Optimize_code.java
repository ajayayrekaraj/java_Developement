package Leet_Code_Questions;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Rotate_Array_Optimize_code {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Rotate(arr,k);
		for(int l=0;l<arr.length;l++) {
			System.out.println(arr[l]+" ");
		}
		
	}
	public static void Rotate(int[]arr,int k) {
		int n=arr.length;
		k=k%n;
		Reverse(arr,0,n-k-1);
		Reverse(arr,n-k,n-1);
		Reverse(arr,0,n-1);
	}
	public static void Reverse(int []arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
