package GeeksforGeeks.Basic_Problems;

import java.util.Scanner;

//Program to print multiplication table of a number
//https://www.geeksforgeeks.org/program-to-print-multiplication-table-of-a-number/
public class Multiplication_Table {

    public static void printTable(int n) {
        for (int i =0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen: ");
        int n = scanner.nextInt();

        printTable(n);

        scanner.close();
    }
}
