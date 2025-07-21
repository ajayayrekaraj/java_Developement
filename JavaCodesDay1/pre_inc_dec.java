package JavaCodesDay1;

public class pre_inc_dec {
	public static void main(String[]a) {
		int x=11;
		System.out.println(++x);
		System.out.println(x);
		
		int ab=6,b=5;
		int c=ab++ + ++ab - --b + ++b - b--;
		System.out.println(c);
		
	}

}
