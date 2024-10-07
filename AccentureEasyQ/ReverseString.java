//Write a function that Reverse a given String

package AccentureEasyQ;
import java.util.*;

public class ReverseString {
        public void reverseString(String str){
            String newStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                newStr = newStr + str.charAt(i);
            }
            System.out.println("The Reverse String Is : "+newStr);
        }
        public static void main(String args[]){
            System.out.print("Enter a String : ");
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            ReverseString obj = new ReverseString();
            obj.reverseString(st);
            sc.close();
        }
    }


