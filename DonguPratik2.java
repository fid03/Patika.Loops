package PracticeTasks;

import java.util.Scanner;

public class DonguPratik2 {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner sc=new Scanner(System.in);
         do{
             System.out.println("Please enter a number");
             n=sc.nextInt();
              if(n%2==0 && n%4==0){
                  total+=n;
              }
         }while(n%2==0);
        System.out.println("Total:"+total);
    }
}
