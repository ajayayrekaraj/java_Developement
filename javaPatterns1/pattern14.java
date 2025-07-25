package javaPatterns1;
import java.util.*;
public class pattern14 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n*2-1) {
			if(row<n) {
				int i=1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
				star++;
			}
			else {
				int j=1;
				while(j<=star) {
					System.out.print("* ");
					j++;
				}
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
