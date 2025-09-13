package Revision;
import java.util.*;
public class pattern4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=i;
			while(j<n) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=i) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
