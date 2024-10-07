//Find the intersection of two arrays

package AccentureEasyQ;
import java.util.*;

public class FindIntersectionArray {
    public static List<Integer> findIntersectionArray(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0,j=0;
        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i]<arr2[j]) {
                i++;
            }
            else if (arr2[j]<arr1[i]) {
                j++;
            }
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2};

        List<Integer> ans = findIntersectionArray(arr1, arr2);
        System.out.println("Intersections Are : ");
        for (Integer no : ans) {
            System.out.print(no+ " ,");
        }
    }
}
