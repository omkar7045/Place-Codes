//Remove Duplicate Element From Array

package AccentureEasyQ;
import java.util.*;
public class RemoveDuplicateEleInArray {
    public static void main(String[] args) {
        HashSet<Integer> ans = new HashSet<>();
        int[] arr1 = {1,2,2,3,4,5,5};

        for (int i = 0; i < arr1.length; i++) {
            ans.add(arr1[i]);
        }

        for (int no : ans) {
            System.out.println(no);
        }
    }
}
