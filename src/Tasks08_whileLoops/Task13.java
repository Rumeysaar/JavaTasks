package Tasks08_whileLoops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char ch = input.nextLine().charAt(0);

            while (ch != 'x') {
                System.out.println("bir karakter giriniz");
                ch = input.nextLine().charAt(0);
                System.out.println("javaCAN");
            break;
            }
        System.out.println("jAVATAR");

    }
}
