//Printing Arrays using for and forEach loop

package Arrays;

public class arr1D {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("------------------");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
