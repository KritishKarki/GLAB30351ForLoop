import java.util.Scanner;

public class GlabForLoop {
    public void example1() {
        int n = 5;
        //for loop
        for (int i=1; i<=n; i++) {
            System.out.println("Java is fun");
        }
    }

    public void example2() {
        int sum = 0;
        int n = 1000;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public void example3() {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number/string to check if it is a palindrome");
        original = in.nextLine();
        int originalLength = original.length();
        for (int i=0; i < originalLength; i++) {
            reverse =  original.charAt(i) + reverse;
        }
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number is not a palindrome.");
        }
    }

    public void example4() {
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
