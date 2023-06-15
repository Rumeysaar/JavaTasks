package Tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner input = new Scanner(System.in);


        int toplam = 0;
        int count = 0;

        while (toplam <= 333) {
            System.out.println("bir tam sayi giriniz");
            int sayi = input.nextInt();
            toplam += sayi;
            count ++;
        }
        System.out.println("girilen sayi adedi " + count + "\n" + "toplam " + toplam);






    }
}
