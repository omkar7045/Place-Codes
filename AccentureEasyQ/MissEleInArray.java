// Find the single missing number in array where numbers are consecutive

package AccentureEasyQ;
import java.util.*;

public class MissEleInArray {
    public void missEleArray(int[] arr){
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1^arr[i];
        }
        
        int xor2 = arr[0];
        int end = arr[arr.length - 1];
        for (int i = arr[1]; i <= end; i++) {
            xor2 = xor2^i;
        }
        System.out.println("The Misssing Element Is : "+(xor1^xor2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemnets you want in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MissEleInArray obj = new MissEleInArray();
        obj.missEleArray(arr);
        sc.close();
    }
}
