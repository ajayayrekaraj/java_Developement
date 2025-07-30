package methods_OR_functions;

public class parameterized_method {
	public static void Add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[]args) {
		int a=10,b=11,i=1,j=2;
		Add(a,b);
		Add(9,5);
		Add(i,a);
		
		System.out.println("End ");
	}
	
}
