package Revision;
import java.util.*; 
public class pattern7 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=1;
		while(row<=n) {
			int i=row;
			while(i<n) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			star+=2;
			row++;
			System.out.println();
		}
	}

}
