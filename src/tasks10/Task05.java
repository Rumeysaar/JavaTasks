package tasks10;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..


        System.out.println("bir tam sayi giriniz");
        double sayi1 = input.nextDouble();
        System.out.println("bir tam sayi giriniz");
        double sayi2 = input.nextDouble();



        dortIslem(sayi1, sayi2);

    }

    private static void dortIslem(double sayi1, double sayi2) {
        System.out.println("islem seciniz: +, -, /, *");
        char islem = input.next().charAt(0);
        switch (islem){
            case '+' : topla(sayi1, sayi2);
            break;
            case '-' : cikar(sayi1, sayi2);
            break;
            case '/' : bol(sayi1, sayi2);
            break;
            case '*' : carp(sayi1, sayi2);
            break;
            default:
                System.out.println("gecersiz islem");
                dortIslem(sayi1,sayi2);
        }
        System.out.println("islem sonu");
    }


    private static void carp(double sayi1, double sayi2) {
        System.out.println(sayi1*sayi2);
    }

    private static void bol(double sayi1, double sayi2) {
        System.out.println(sayi1/sayi2);
    }

    private static void cikar(double sayi1, double sayi2) {
        System.out.println(sayi1-sayi2);
    }

    private static void topla(double sayi1, double sayi2) {
        System.out.println(sayi1 + sayi2);
    }
}
