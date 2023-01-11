package Searching;

public class BinarySearch {

    public static int binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(a[mid]==key){
                return mid;
            } else if (key>a[mid]) {
                low = mid+1;
            }
            else{
                low=0;
                high= mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]= {5,7,6,1,8};
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearch(arr,5));
        System.out.println(binarySearch(arr,8));
        System.out.println(binarySearch(arr,2));




    }
}
