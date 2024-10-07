import java.util.*;

class UserInput{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The Sum Is : ");
        System.out.println(c);

    }
}