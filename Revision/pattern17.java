package Revision;
import java.util.*;
public class pattern17 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int row=1;
		int space=0;
		
		while(row<=n*2-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				space+=2;
				star--;
			}else {
				space-=2;
				star++;
			}
			row++;
			System.out.println();
		}
	}
}
