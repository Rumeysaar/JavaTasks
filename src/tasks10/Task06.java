package tasks10;

import java.util.Scanner;

public class Task06 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	 */


        System.out.println("kare, dikdortgen ve ucgen kelimelerinden birini secin");
        String sekil = sc.nextLine().toLowerCase();
        
        System.out.println("sayı secin");
        System.out.println("1. sayi");
        double num1 = sc.nextDouble();
        System.out.println("2. sayi");
        double num2 = sc.nextDouble();
        
        switch (sekil){
            case "kare" : 
                cevre(num1);
                alan(num1);
                break;
            case "dikdortgen" :
                cevre(num1, num2);
                alan(num1, num2);
                break;
            case "ucgen" :
                cevre1(num1);
                alan(num1, num2);
                break;
            default :
                System.out.println("hatali giris");
                break;

        }
        

    }



    public static double cevre1(double u) {
        System.out.println("ucgenin alani = " + u*3);
        return u*3;
    }

    public static double alan(double a, double b) {
        System.out.println("dikdortgenin alani = " + a*b);
        return a*b;
    }

    public static double cevre(double a, double b){
        System.out.println("dikdortgenin cevresi = " + (2*a + 2*b));
        return 2*a + 2*b;
    }

    public static double alan(double a) {
        System.out.println("karenin alani = " + a*a);
        return a*a;
    }

    public static double cevre(double a) {
        System.out.println("karenin cevresi = " + a*4);
        return a * 4;
    }

}
