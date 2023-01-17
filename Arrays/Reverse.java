package Arrays;

public class Reverse {
	
	public static void printArray(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
	}
	public static void reverseArray(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		
	}
	public static void main(String[] args)   
	{ 
		int arr[]= {1,2,3,4,5};
		printArray(arr,5);
		reverseArray(arr,0,4);
		System.out.println("reversed array is \n");
		printArray(arr,5);
		
	}
}
