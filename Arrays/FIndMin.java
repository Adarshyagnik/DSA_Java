package Arrays;

import java.util.Scanner;

public class FIndMin {
	
	

	public static int findmin(int[] arr1) {
		if(arr1==null || arr1.length==0) {
			throw new IllegalArgumentException("invalid input");
		}
		
		int min=arr1[0];
			
			for(int j=0;j<arr1.length;j++) {
				if(arr1[j]< min) {
					min=arr1[j];
				}
			}
		
			return min;
		
	}
	
	public static void main(String[] args)   
	{ 
		FIndMin find = new FIndMin();
		
		int arr1[]= {9,5,1};
		System.out.println(find.findmin(arr1));
		
		
		
		
	}
}
