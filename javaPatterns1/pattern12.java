package javaPatterns1;
import java.util.*;
public class pattern12 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n*2-3;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n) {
				k=2;
			}
			
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			row++;
			star++;
			space-=2;
			System.out.println();
		}
	}

}
