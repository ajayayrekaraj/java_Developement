package javaPatterns1;
import java.util.*;
public class pattern20 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-2;
		while(row<=n) {
			if(row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("* ");
					i++;
				}
			}else {
				System.out.print("* ");
				int i=1;
				while(i<=space) {
					System.out.print("  ");
					i++;
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
	}
}
