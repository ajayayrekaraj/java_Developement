package JavaCodesDay1;
import java.util.Scanner;
public class input {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter p value: ");
		int p=a.nextInt();
		System.out.print("Enter r value: ");
		int r=a.nextInt();
		System.out.print("Enter t value: ");
		int t=a.nextInt();
		
		int si=(p*r*t)/100;
		
		System.out.println(si);
		}

}
