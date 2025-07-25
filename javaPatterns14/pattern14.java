package javaPatterns14;
import java.util.Scanner;
public class pattern14 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			if(star==n-1)
				space=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(star==n)
				k=2;
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
