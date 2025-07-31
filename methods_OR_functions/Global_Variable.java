package methods_OR_functions;

public class Global_Variable {
	public static void main(String[]args) {
		System.out.println("hey");
		int x=60;
		System.out.println(val);
		fun(x);
		System.out.println(val);
	}
	static int val=100; //global variable
	public static void fun(int x) {
		int a=90;
		System.out.println(x);
		int val=19; //local variable
		val=120;
		System.err.println(val);
	}

}
