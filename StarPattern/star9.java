//Reverse Full pyramid

package StarPattern;

public class star9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = 4; l >=i; l--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
