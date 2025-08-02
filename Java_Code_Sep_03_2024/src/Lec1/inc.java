package Lec1;

public class inc {
	public static void main(String[]args) {
		int a=9;
		int b=8;

		int c=a++ - b++ - b-- + a++ + 8 + a++ - b++; 
		System.out.println(c);
	}

}
