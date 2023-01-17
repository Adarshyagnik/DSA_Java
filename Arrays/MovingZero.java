package Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class MovingZero {
	
	public static void printArray(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		
	}
	
	public void Move() {
		
		int[] arr = {1,5,0,6,0,1};
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		printArray(arr);
	}
	public static void main(String[] args)   
	{ 
		MovingZero moving = new MovingZero();
		moving.Move();
		
		
	}
	

}
