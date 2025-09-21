package Revision;
import java.util.*;
public class pattern28 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int num=1;
			while(j<=star) {
				System.out.print(num+"\t");
				if(j<=star/2) {
					num++;
				}else {
					num--;
				}
				j++;
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}
		
	}
}
