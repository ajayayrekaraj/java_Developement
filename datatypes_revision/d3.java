package datatypes_revision;
import java.util.*;
public class d3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Not prime number");
		}else {
			System.out.println("prime number");
		}
	}

}
