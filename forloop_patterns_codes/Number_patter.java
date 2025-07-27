package forloop_patterns_codes;
import java.util.*;
public class Number_patter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int count=1;
		while(row<=n) {
			int i=1;
			while(i<=row) {
				System.out.print(count+"  ");
				i++;
				count++;
			}
			row++;
			//count++;
			System.out.println();
		}
	}
}
