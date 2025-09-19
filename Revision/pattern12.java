package Revision;
import java.util.*;
public class pattern12 {
	public static void main(String[]args) {
		Scanner ahe=new Scanner(System.in);
		int n=ahe.nextInt();
		int row=1;
		int star=n;
		int space =0;
		
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			if(row==n-3) {
				space=1;
			}
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n-4) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			row++;
			space+=2;
			star--;
			System.out.println();
		}
	}
}
