package Revision;
import java.util.*;
public class pattern26 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int num=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(num+"\t");
				num++;
				j++;
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}
	}
}
