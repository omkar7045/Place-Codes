package AccentureEasyQ;
import java.util.*;

public class MergeSortedArraysO {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,9};
    
        int left = arr1.length -1;
        int right = 0;
        int temp;

        while (left>=0 && right<arr2.length) {
            if (arr1[left]>=arr2[right]) {
                temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
    
}
