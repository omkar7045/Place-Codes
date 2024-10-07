// Find Maximum Element In Array 

package AccentureEasyQ;
import java.util.*;

public class MaxEleInArray {
    public void maxElementArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The Maximum Element In Array Is : "+max);
    }
    public static void main(String[] args) {
        System.out.println("Enter Input For Array : ");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        MaxEleInArray obj = new MaxEleInArray();
        obj.maxElementArray(arr);
        sc.close();

    }
}
