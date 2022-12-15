public class SelectionSort {

    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void Selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int Smallest = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[Smallest]>arr[j]){
                    Smallest = j;
                }
            }
            int temp = arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]=temp;
        }
        PrintArray(arr);
    }

    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        Selection(arr);
    }
}
