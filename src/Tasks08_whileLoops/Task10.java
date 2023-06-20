package Tasks08_whileLoops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        System.out.println("Girilen bir sayıya kadar tek olanlar = ");
        int i = 1;
        if (sayi % 2 == 0) {
            while (i < sayi-1) {
                i += 2;
                System.out.print(i + " ");
            }
        } else while (i < sayi) {
            i += 2;
            System.out.print(i + " ");
        }




    }
}
