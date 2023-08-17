package PracticeTasks;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int n = sc.nextInt();
        int tempNumber = n;
        int numberCounter = 0;
        int numberValue;
        int remainder = 0;
        int powNumber;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberCounter++;
        }

        tempNumber = n;
        while (tempNumber != 0) {
            numberValue = tempNumber % 10;
            powNumber = 1;
            for (int i = 1; i <= numberCounter; i++) {
                powNumber *= numberValue;
            }
            result += powNumber;
            tempNumber /= 10;
        }
        System.out.println("Result=" + result);

        //sum of digits in a number
        while(n!=0){
            remainder+=n%10;
            n/=10;
        }
        System.out.println("Sum of the digits:"+remainder);

    }
}
