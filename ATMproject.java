package PracticeTasks;

import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {
        String userName, password;
        Scanner sc = new Scanner(System.in);
        int limit = 3;
        int balance = 1500;
        int option;
        int price;
        while (limit > 0) {
            System.out.print("Enter your user name:");
            userName = sc.nextLine();
            System.out.print("Enter your password:");
            password = sc.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank!");
                do {
                    System.out.println(" 1.Deposit \n 2.Withdraw money \n 3.Balance information \n 4.Exit");
                    System.out.print("Choose operation:");
                    option = sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("Your Balance:"+balance);
                            System.out.print("Enter price:");
                            price=sc.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.println("Your Balance:"+balance);
                            System.out.print("Enter price:");
                           price=sc.nextInt();
                           if(price>balance){
                               System.out.println("Insufficient balance!");
                           } else{
                               balance-=price;
                           }
                           break;
                        case 3:
                            System.out.println("Balance:"+balance);
                        break;
                    }
                }while (option!=4);
                System.out.println("Thanks for using our services");
               return;
            }else {
                limit--;
                System.out.println("Wrong password or user name,please try again");
                if(limit==0){
                    System.out.println("Your account was blocked!");
                }
                else System.out.println("Your limit:"+limit);
            }
        }
    }
}
