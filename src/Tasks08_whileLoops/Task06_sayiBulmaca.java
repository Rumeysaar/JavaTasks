package Tasks08_whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin


        Random random = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("1-100 arasinda bir sayi tahmin et");

        int num = random.nextInt(100)+1;

        int counter = 0;

        while (true) {
            System.out.println("tahminin?");
            int sayi = input.nextInt();
            counter++;

            if (sayi < num)
                System.out.println("daha buyuk bir sayi");
            else if (sayi > num) {
                System.out.println("daha kucuk bir sayi");
            } else {
                System.out.println("Sayiyi = " + counter + ". tahminde buldunuz");
                break;
            }


        }



    }

}
