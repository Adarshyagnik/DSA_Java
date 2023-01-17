package Arrays;
import java.util.Scanner;

public class ArraysMethods {
	
	
	
	public static void printArray(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		
	}
	
	
	public static void arr() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter arr Size");
		 int n=sc.nextInt();
		 int[]arr1 = new int [n];
		 for(int i=0; i<n;i++) {
			 System.out.println("enter number"+i+1);
			 arr1[i]=sc.nextInt();
		 }
		sc.close();
		 printArray(arr1);
	}
	
	

	
	public static void main(String[] args)   
	{ 
		ArraysMethods arraysMethod = new ArraysMethods();
		arraysMethod.arr();
		
		
	}
	

}
