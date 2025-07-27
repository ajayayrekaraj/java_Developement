package forloop_patterns_codes;
import java.util.*;
public class hacker_block_code_pattern_with_zero {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		
		while(row<=n) {
			int i=1;
			while(i<=row) {
				if(i==1 || i==row) {
					System.out.print(row+"  ");
				}else {
					System.out.print("0"+"  ");
				}
				i++;
			}
			row++;
			System.out.println();
		}
	}
}
