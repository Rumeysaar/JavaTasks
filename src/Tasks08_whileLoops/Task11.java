package Tasks08_whileLoops;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz, cikmak icin 0'a basiniz ");
        int sayi = input.nextInt();

        int count = 0;
        int toplam = 0;

        while (sayi != 0){
            toplam += sayi;
            sayi = input.nextInt();
            count++;
        }
        System.out.println(count + " adet sayi girdiniz \ngirilen sayilarin toplami = " + toplam);







    }
}
