package Revision;
import java.util.Scanner;
public class pattern6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int star=1;
			int row=1;
			int space=0;
			while(row<=n) {
				int i=1;
				while(i<=space) {
					System.out.print("  ");
					i++;
				}
				int k=row;
				while(k<=n) {
					System.out.print("* ");
					k++;
				}
				System.out.println();
				star++;
				row++;
				space+=2;
		}
	}
}
