package AccentureEasyQ;

public class MergeSortedArrays1 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,9,10};

        int n = arr1.length;
        int m = arr2.length;

        int[] arr3 = new int[m+n];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left<n && right<m) {
            if (arr1[left]<=arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }
        while (left<n) {
            arr3[index++] = arr1[left++];
        }
        while (right<m) {
            arr3[index++] = arr2[right++];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
        System.out.println("");

        for (int i = 0; i < n+m; i++) {
            if (i<n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i-n] = arr3[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
