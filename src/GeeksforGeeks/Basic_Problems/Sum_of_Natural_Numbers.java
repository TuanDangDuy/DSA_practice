package GeeksforGeeks.Basic_Problems;

import java.util.Scanner;

//Program to find sum of first n natural numbers
//https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/
public class Sum_of_Natural_Numbers {

    public static void findSum(int n) {
        int tong = (n * (n + 1)) / 2;
        System.out.println("Tong cua " + n + " so tu nhien dau tien la: " + tong);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen duong n: ");
        int n = scanner.nextInt();

        findSum(n);
    }

}
