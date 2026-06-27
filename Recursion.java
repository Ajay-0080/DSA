import java.util.Scanner;

public class Recursion {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter a number: ");
        num = sc.nextInt();

        int result = fact(num);
        System.out.println("factorial is "+ result);
    }

    public static int fact(int num) {
        if(num>0) {
            return num * fact(num-1);
        }
        return 1;
    }
}
