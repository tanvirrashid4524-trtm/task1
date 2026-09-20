package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average number of books read per month v: ");
        int v = sc.nextInt();

        System.out.print("Enter average number of visitors per year n: ");
        int n = sc.nextInt();

        double k = (12.0 * v) / n;

        System.out.printf("Average books read per visitor per year (k): %.2f%n", k);

        sc.close();
    }
}