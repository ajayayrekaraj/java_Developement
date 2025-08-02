package Lec2;
import java.util.*;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		
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
			star++;
			row++;
			space--;
			System.out.println();
			
		}
	}

}
