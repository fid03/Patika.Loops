package PracticeTasks;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = input.nextInt();

        int ebob = 1;
        int i = 1;
        while (i < num1) {

            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB=" + ebob);

        int ekok = (num1 * num2) / ebob;
        System.out.println("EKOK=" + ekok);
    }
}
