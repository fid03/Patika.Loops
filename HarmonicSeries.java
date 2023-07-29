package PracticeTasks;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of N...");
        int n=scanner.nextInt();
        double total=0;
        for(double i=1;i<=n;i++){
            total+=(1/i);
        }
        System.out.println("Total result is=>"+total);
    }
}
