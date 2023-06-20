package Tasks08_whileLoops;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("toplamak uzere pozitif sayilar giriniz");
        System.out.println("sayi giriniz");
        int sayi = input.nextInt();

        int count = 1;
        int negativeCount = 0;
        int toplam = sayi;

        while (sayi != 0){
            System.out.println("sayi giriniz");
            sayi = input.nextInt();
            if (sayi>0){
                toplam += sayi;
                count++;
            }else if (sayi < 0) {
                System.out.println("negatif sayi giremezsiniz");
                negativeCount++;
            }
        }
        System.out.println(count + " adet pozitif sayi girdiniz");
        System.out.println(negativeCount + " adet negatif sayi girdiniz");
        System.out.println("girilen pozitif sayilarin toplami = " + toplam);





    }
}
