package tasks10;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner input =new Scanner(System.in);
        System.out.println("3 adet sayi giriniz");
        System.out.println("1.sayi");
        int num1 = input.nextInt();
        System.out.println("2.sayi");
        int num2 = input.nextInt();
        System.out.println("3.sayi");
        int num3 = input.nextInt();

        int enBuyuk = enBuyukSayi(num1, num2, num3);
        System.out.println("en buyuk sayi = " + enBuyuk);

    }

    private static int enBuyukSayi(int num1, int num2, int num3) {
        return Math.max(num1,Math.max(num2,num3));
    }
}

