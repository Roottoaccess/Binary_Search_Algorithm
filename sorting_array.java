import java.lang.Thread;
import java.util.Arrays;
import java.util.Scanner;
public class sorting_array extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int lmt = sc.nextInt();

        int a[] = new int[lmt];
        System.out.println("Element....");
        for(int i = 0; i < lmt; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements: ");
        try{
            for (int i : a) {
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Sorting the array */
        Arrays.sort(a);
        System.out.println();
        System.out.println("----SORTED ARRAY----");
        try{
            for (int i : a) {
                System.out.print(i+ " ");
                Thread.sleep(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}