package Lec2;
import java.util.*;
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int star=n;
		int space=0;
		int row=1;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(" *");
				j++;
			}
			
		
		row++;
		System.out.println();
		space=space+2;
		star--;
		}
	}

}
