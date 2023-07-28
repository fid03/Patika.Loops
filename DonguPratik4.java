package PracticeTasks;

import java.util.Scanner;

public class DonguPratik4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        int factorialN = 1;
        int factorialR = 1;
        int factorialNfromR = 1;
        System.out.print("Please enter value of n=> ");
        n = sc.nextInt();

        System.out.print("Please enter value of r=> ");
        r = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            factorialN = factorialN * i;
        }
        for (int j = 1; j <= r; j++) {
            factorialR = factorialR * j;
        }
        for (int k = 1; k <= n - r; k++) {
            factorialNfromR = factorialNfromR * k;
        }

        int combination = factorialN / (factorialR * factorialNfromR);
        System.out.println("Combination of " + n + " and " + r + "=>" + combination);
    }
}
