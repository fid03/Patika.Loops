package PracticeTasks;

import java.util.Scanner;

public class DonguPratik5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,k;
        System.out.println("Enter value of n");
        n=input.nextInt();

        System.out.println("Enter value of r");
        k=input.nextInt();

        int total=1;

        for(int i=1;i<=k;i++){
          total*=n;
        }
        System.out.println("Total value of "+n+"^"+k+"=>"+total);

       /* Solution with WHILE LOOP
       int i=1;
       while (i<=k){
            total*=n;
            i++;
        }
        */



    }
}
