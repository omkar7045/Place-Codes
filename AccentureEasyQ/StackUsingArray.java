package AccentureEasyQ;

import java.util.Scanner;

class stack{
    int top = -1;
    int[] arr = new int[10];

    Scanner sc = new Scanner(System.in);
    void push(){
        if (top == arr.length) {
            System.out.println("The Stack Is Overflow");
        } else {
            System.out.print("Enter a data to insert is Stack : ");
            int ele = sc.nextInt();
            top++;
            arr[top] = ele;
            System.out.println("The Data Is Pushed");
        }
    }
    void pop(){
        if (top == -1) {
            System.out.println("The Stack Is Underflow");
        } else {
            int removedElement = arr[top];
            top--;
            System.out.println("The Poped Element Is : " + removedElement);
        }
    }
    void display(){
        System.out.print("The Stack Elements Are : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        stack obj = new stack();
        @SuppressWarnings("resource")
        Scanner sd = new Scanner(System.in);
        
        
        System.out.println("Enter 1 For PUSH.");
        System.out.println("Enter 2 For POP.");
        System.out.println("Enter 3 For Display Stack ELements.");
        System.out.println("Enter 4 For EXIT.");
    
        while(true){

            int num = sd.nextInt();
            switch (num) {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }

        }
    }
    
}
