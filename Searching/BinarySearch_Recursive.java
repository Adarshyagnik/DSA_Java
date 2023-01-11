package Searching;

public class BinarySearch_Recursive {


    public static int binarySearch(int a[],int key,int low,int high){
        if(low>high){
            return -1;
        }

        else {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                return mid;
            }

            if (key > a[mid]) {
                return binarySearch(a, key, mid + 1, high);
            }
            return binarySearch(a, key, low, mid - 1);
        }
    }

    public static void main(String args[]){
        int arr[]= {5,7,6,1,8};
        int n = arr.length;
        System.out.println(binarySearch(arr,7,0,n));
        System.out.println(binarySearch(arr,5,0,n));
        System.out.println(binarySearch(arr,8,0,n));
        System.out.println(binarySearch(arr,2,0,n));




    }
}
