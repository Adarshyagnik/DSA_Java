package Arrays;

//Kadane's_Algorithm (max subarray)

public class Kadanes_Algorithm {

    static long maxSubArraySum(int arr[], int n) {
        int curr = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (curr + arr[i] > arr[i]) {
                curr += arr[i];
            } else {
                curr = arr[i];
            }
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,-2,5};
        int n = arr.length;
        ;
        System.out.println(maxSubArraySum(arr,n));
    }
}
