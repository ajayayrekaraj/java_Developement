package javaPatterns1;
import java.util.*;
public class pattern11 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2==1)
					System.out.print("* ");
				else
					System.out.print("  ");
				j++;
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}
	}

}
