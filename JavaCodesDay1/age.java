package JavaCodesDay1;
import java.util.Scanner;
public class age {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		
		int Age=a.nextInt();
		if(Age>=18)
			System.out.println("Vote dega");
		else
			System.out.println("Vote nhi dega");
	}

}
