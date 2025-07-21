package JavaCodesDay1;
import java.util.Scanner;
public class grade_marks {
	public static void main(String[]args) {
	Scanner a=new Scanner(System.in);
	
	int marks=a.nextInt();
	if(marks >85 && marks <=100)
		System.out.println("Distinction with A+");
	else if(marks >60 && marks<=85)
		System.out.println("B");
	else if(marks>=40 && marks <=60)
		System.out.println("c");
	else
		System.out.println("fail");
	}
}
