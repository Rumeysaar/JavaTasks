package Tasks08_whileLoops;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("kac adet sayi toplamak istiyorsunuz?");
        int count = input.nextInt();

        int toplam = 0;

        while (count > 0){
            System.out.println("sayi giriniz");
            int sayi = input.nextInt();
            toplam += sayi;
            count--;
        }
        System.out.println("sayilarin toplami = " + toplam);


    }

}
