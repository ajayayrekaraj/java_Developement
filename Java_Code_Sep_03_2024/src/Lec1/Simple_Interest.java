package Lec1;
import java.util.*;
public class Simple_Interest {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		int p=SC.nextInt();
		int r=SC.nextInt();
		int t=SC.nextInt();
		int SI=(p*r*t)/100;
		
		System.out.println(SI);
		
	}

}
