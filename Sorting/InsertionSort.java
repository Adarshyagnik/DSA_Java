
public class InsertionSort {

    public static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Insertion(int [] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        PrintArray(arr);
    }

    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        Insertion(arr);
    }

}
