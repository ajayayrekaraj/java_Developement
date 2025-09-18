package Revision;
import java.util.*;
public class pattern9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int row=1;
		int star=n;
		
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			space+=2;
			row++;
			star--;
			System.out.println();
		}
	}
}
