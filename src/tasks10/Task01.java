package tasks10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("bir tam sayi giriniz");
        int sayi2 = input.nextInt();
        esitMi(sayi1, sayi2);

        boolean sonuc = sayilarEsitMi(sayi1, sayi2);
        if (sonuc) System.out.println("esittir");
        else System.out.println("esit degildir");

    }//main sonu

    private static boolean sayilarEsitMi(int sayi1, int sayi2) {
        return sayi1==sayi2;
    }

    public static void esitMi (int a, int b){
        if (a==b) System.out.println("sayilar esittir");
        else System.out.println("sayilar esit degildir");
    }


}
