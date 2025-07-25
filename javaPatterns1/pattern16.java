/*
 *     *****
 *    **** 
 *   ***
 *  **
 * * 
 *  **
 *   ***
 *    ****
 *     *****
 */
package javaPatterns1;
import java.util.*;
public class pattern16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=n-1;
		while(row<=n*2-1) {
			if(row<n) {
				int i=1;
				while(i<=space) {
					System.out.print("  ");
					i++;
				}
				int j=1;
				while(j<=star){
					System.out.print("* ");
					j++;
				}
				space--;
				star--;
			}
			else {
				int i=1;
				while(i<=space) {
					System.out.print("  ");
					i++;
				}
				int j=1;
				while(j<=star) {
					System.out.print("* ");
					j++;
				}
				star++;
				space++;
			}
			row++;
			System.out.println();
		}
	}
}
