package VideoTasks;

import java.util.Scanner;

public class DonguPratik1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi giriniz..");
        int k=sc.nextInt();
        int toplam=0;
        int sayi=0;
         for(int i=1;i<=k;i++){
             if(i%3==0 && i%4==0){
                 toplam+=i;
                 sayi++;
             }
         }
         double ortalama=toplam/sayi;
        System.out.println("3-e ve 4e tam bolunen sayilarin ortalamasi:"+ortalama);
    }
}
