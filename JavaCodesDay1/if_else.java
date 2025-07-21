package JavaCodesDay1;
import java.util.Scanner;

public class if_else {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>6) {
			System.out.println("hello");
		}
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}

}
