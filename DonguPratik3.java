package PracticeTasks;

import java.util.Scanner;

public class DonguPratik3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        n = sc.nextInt();
        System.out.println("Power of 4:");
        for (int i = 1; i < n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("-------------");
        System.out.println("Power of 5:");
        for (int i = 1; i < n; i *= 5) {
            System.out.println(i);
        }

        //Solution with WHILE LOOP
        /**int k;
         System.out.println("PLease enter a number");
         k = sc.nextInt();
         int b = 1;
         System.out.println("Power of 4(b)");
         while (b <= k) {
         System.out.println(b);
         b *= 4;
         }
         **/

    }
}
