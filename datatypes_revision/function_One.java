package datatypes_revision;
import java.util.*;
public class function_One {
	public static boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem*10;
            temp=temp/10;
        }
        if(x==sum){
            return true;
        }else{
            return false;
        }
    }
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		isPalindrome(n);
	}
}
