package javaPatterns1;
import java.util.Scanner;
public class pattern2_1 {
	public static void main(String[]args){
		Scanner aj=new Scanner(System.in);
		int n=aj.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			while(col<=row) {
				System.out.print(" *");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
