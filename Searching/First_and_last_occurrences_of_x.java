package Searching;

import java.util.ArrayList;

public class First_and_last_occurrences_of_x {

    static long firstOccurence(long arr[], int n , int x) {
        int s = 0;
        int e = n - 1;
        int mid = (s + e) / 2;
        int ans = -1;
        while (s <= e) {
            if (arr[mid] == x) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = (s + e) / 2;

        }
        return ans;
    }

    static long lastOccurence(long arr[], int n, int x){
        int s=0;
        int e = n-1;
        int mid = (s+e)/2;
        int ans =-1;
        while(s<=e){
            if(arr[mid]==x){
                ans =mid;
                s=mid+1;

            }

            else if(arr[mid]<x){
                s=mid+1;

            }
            else{
                e=mid-1;

            }
            mid = (s+e)/2;
        }
        return ans;
    }

    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here

        ArrayList<Long>list = new ArrayList<>();
        long first = firstOccurence(arr,n,x);
        long last = lastOccurence(arr,n,x);
        list.add(first);
        list.add(last);
        return list;
    }

    public static void main(String args[]){
        long arr[] = {2,3,5,5,5,5,5,6,7,123,125};
        int n=arr.length-1;
        System.out.println(firstOccurence(arr,n,5));
        System.out.println(lastOccurence(arr,n,5));


    }
}
