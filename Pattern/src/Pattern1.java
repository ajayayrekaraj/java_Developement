import java.util.*;
public class Pattern1 {
	public static void main(String[]args) {
		Scanner s=new Scanner (System.in);
		
		int n=s.nextInt();
		int row=1;
		int start=n;
		
		while(row<=n) {
			int i=1;
			
			while(i<=start) {
				System.out.print(" *");
				i++;
			}
			row++;
			System.out.println();
		}
	}

}
