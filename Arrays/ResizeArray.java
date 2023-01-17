package Arrays;

public class ResizeArray {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static int[] resize(int[] arr,int capacity) {
		
		int[] temp =new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		
		return arr;
		
	}
	public static void main(String[] args)   
	{ 
		ResizeArray resizearray=new ResizeArray();
		int orignial[]= new int []{1,2,3,4,5};
		System.out.println(orignial.length);
		orignial=resizearray.resize(orignial, 10);
		System.out.println(orignial.length);
		
		
		
	}

}
