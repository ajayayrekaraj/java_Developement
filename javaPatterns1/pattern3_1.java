package javaPatterns1;
import java.util.Scanner;
public class pattern3_1 {
	public static void main(String[]args) {
		Scanner aj=new Scanner(System.in);
		int n=aj.nextInt();
		int row=1;
		while(row<=n) {
			int col=row;
			while(col<=n) {
				System.out.print(" *");
				col++;
			}
			row++;
			System.out.println();
		}
	}

}
