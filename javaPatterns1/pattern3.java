package javaPatterns1;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[]args) {
		Scanner aj=new Scanner(System.in);
		
		int n=aj.nextInt();
		int row=1;
		while(row<=n) {
			int star=n;
			while(row<=star) {
				System.out.print(" *");
				star--;
			}
			row++;
			System.out.println();
			
		}
	}

}
