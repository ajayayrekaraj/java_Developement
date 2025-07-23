package javaPatterns1;
import java.util.Scanner;
public class pattern1_1 {
	public static void main(String[]args) {
		Scanner aj=new Scanner(System.in);
		int n=aj.nextInt();
		int row=1;
		
		while(row<=n) {
			int col=1;
			while(col<=n) {
				System.out.print(" *");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
