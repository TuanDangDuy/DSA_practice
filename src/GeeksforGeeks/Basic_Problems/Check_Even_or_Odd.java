package GeeksforGeeks.Basic_Problems;

import java.util.Scanner;

//Check whether a given number is even or odd
//https://www.geeksforgeeks.org/check-whether-given-number-even-odd/
public class Check_Even_or_Odd {

    public static boolean isEven(int n) {
        return  (n % 2) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen: ");
        int n = scanner.nextInt();

        if (isEven(n)) {
            System.out.println(n + " la so chan.");
        } else {
            System.out.println(n + " la so le.");
        }
    }
}
