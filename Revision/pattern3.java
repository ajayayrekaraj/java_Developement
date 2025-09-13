package Revision;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=i;
			while(j<=n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
