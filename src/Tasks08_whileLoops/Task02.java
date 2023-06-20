package Tasks08_whileLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("bir tam sayi giriniz");
        int sayi2 = input.nextInt();

       if (sayi2 > sayi1) {
           for (int i = sayi1; i <= sayi2; i++) {
               System.out.println(i);
           }
       }
       else if (sayi1 > sayi2) {
           for (int i = sayi2; i <= sayi1; i++) {
               System.out.println(i);
           }
       }






    }
}
