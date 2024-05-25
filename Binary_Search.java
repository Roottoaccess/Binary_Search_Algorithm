import java.util.Scanner;
import java.lang.Thread;
import java.util.Arrays;
public class Binary_Search extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit of the array: ");
        int lmt = sc.nextInt();

        int arr[] = new int[lmt];
        System.out.println("Enter the elemenets one by one ! ");
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }
        /* Showing the elements */
        System.out.println("----ARRAY ELEMENETS----");
        try{
            for (int i : arr) {
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        /* Applying the sorting here */
        Arrays.sort(arr);

        /* Printing the sorted and final elements to process further */
        System.out.println("----AFTER SORTING THE ARRAY FOR FINAL IMPLEMENT----");
        try{
            for (int i : arr) {
                System.out.print(i+" ");
                Thread.sleep(i);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println();
        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();

        int res = BinarySearch(arr, target);
        if(res != -1){
            System.out.print("Element found at the index: "+res);
        }else{
            System.out.println("Element not found !");
        }
    }

    public static int BinarySearch(int arr[], int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }
}