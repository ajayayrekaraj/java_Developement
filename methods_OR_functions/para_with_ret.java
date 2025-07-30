package methods_OR_functions;

public class para_with_ret {
	public static void main(String [] args) {
		int a=9,b=7;
		int ans=Add(a,b); //30
		System.out.println(ans);//30
	}
	public static int Add(int a,int b) {
		int c=a+b; //10+20  c=30
		System.out.println(Sub(c,a));  //30,10  //20
		return c;//30
	}
	public static int Sub(int a,int b) {
		return a-b;  //30-10=20
	}

}
