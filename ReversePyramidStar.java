package PracticeTasks;

import java.util.Scanner;

public class ReversePyramidStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of steps in pyramid:");
        int step=sc.nextInt();

        for(int i=step;i>=1;i--){
            for(int j=(step-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int k=(2*i)-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
