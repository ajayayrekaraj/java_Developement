package methods_OR_functions;

public class parameterized_method_with_return_type {
	public static int Add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[]args) {
		int a=10,b=10;
		//Add(a,b);
		int ans =Add(a,b);
		System.out.println(ans         );
	}

}
