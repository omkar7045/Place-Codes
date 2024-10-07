// Count the Occurrence of Each Element in an Array

package AccentureEasyQ;

public class CountFreqOfEleInArray {
    public static void frequency(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if (x == -1) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(x+" : "+count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,30,10,20,40,30,20,10,50};

        frequency(arr);
    }
}
