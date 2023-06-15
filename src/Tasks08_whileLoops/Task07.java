package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        Scanner input = new Scanner(System.in);
        System.out.println("5 adet tam sayi giriniz");

        int ebSayi = Integer.MIN_VALUE;
        int counter = 0;

        while (counter <5){
            System.out.println(counter + 1+ ". sayi");
            int sayi = input.nextInt();
            if (sayi > ebSayi){
                ebSayi = sayi;
            }
            counter++;
        }
        System.out.println("en buyuk Sayi = " + ebSayi);

    }
}
