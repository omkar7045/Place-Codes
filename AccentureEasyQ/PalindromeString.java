package AccentureEasyQ;
import java.util.*;

public class PalindromeString {
    public void paliString(String str){
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }
        if (str.equals(newStr)) {
            System.out.println("The Given String Is Palindrome");
        } else {
            System.out.println("The Given String Is Not Palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter A String : ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        PalindromeString obj = new PalindromeString();
        obj.paliString(st);
        sc.close();
    }
}
