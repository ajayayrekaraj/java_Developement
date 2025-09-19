package Revision;
import java.util.*;
public class pattern14 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		
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
				space--;
				star++;
			}else {
				space++;
				star--;
			}
			row++;
			System.out.println();
			
		}
	}

}
