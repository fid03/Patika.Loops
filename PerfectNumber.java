package PracticeTasks;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int count=0;
        System.out.print("Please enter a number..");
        number=input.nextInt();

        for(int i=1;i<number;i++){
            if(number%i==0){
                count+=i;
            }
        }
        if(count==number){
            System.out.println("Entered number ("+number+") is a Perfect Number");
        }else
            System.out.println("Entered number ("+number+") is NOT a Perfect Number");

    }
}
