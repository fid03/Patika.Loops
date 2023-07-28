package PracticeTasks;

import java.util.Scanner;

public class FindMaxMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers");
        int count = sc.nextInt();
        int max = 0;
        int min = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number:"+(i));
             int num=sc.nextInt();

             if(num>max){
                 max=num;
             }
             if(num<min){
                 min=num;
             }
        }
        System.out.println("Max number is:"+max);
        System.out.println("Min number is:"+min);

    }
}
