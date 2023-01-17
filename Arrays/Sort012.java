package Arrays;

public class Sort012 {
	
	
	public static void swap(int[] a,int i,int j) {
		
	
		int temp=a[j];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
	public static int[] swa(int[] a) {
		int low=0;
		int mid=0;
		
		int high=a.length-1;
		
		while(low<=high) {
			if(a[mid]==0) {
				swap(a,low,mid);
				low++;
				mid++;
				
			}
			else if(a[mid]==1) {
				mid++;
				
			}
			else {
				swap(a,mid,high);
			}
		}
		return a;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {2,1,0,1,0,2};
		
		System.out.println(Sort012.swa(a));
	}

}
