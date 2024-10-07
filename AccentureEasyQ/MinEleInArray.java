// Find Minimum Element In Array

package AccentureEasyQ;
import java.util.*;

public class MinEleInArray {
    public void minEleArray(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("The Minimum Element In Array Is : "+min);
    }
    public static void main(String[] args) {
        System.out.println("Enter Input For Array : ");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        MinEleInArray obj = new MinEleInArray();
        obj.minEleArray(arr);
        sc.close();
    }
}
