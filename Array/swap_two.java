package Array;

public class swap_two {
	public static void main(String[]args) {
		int arr[]= {10,20,30,40,50};
		int other[]= {100,200,300,400,500};
		System.out.println(arr[0]+" "+other[0]);
		
		Swap(arr,other,0,0);
		System.out.println(arr[0]+" "+other[0]);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		} 
		for(int i=0;i<other.length;i++) {
			System.out.print(other[i]+" ");
		}
		
		
	}
	public static void Swap(int [] arr,int []other,int i,int j) {
		int temp=arr[i];
		arr[i]=other[j];
		other[j]=temp;
	}
}
