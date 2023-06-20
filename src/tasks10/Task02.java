package tasks10;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("adiniz?");
        String name = input.nextLine();
        System.out.println("soyadiniz?");
        String surname = input.nextLine();

        isimYaz(name, surname);



    }

    private static void isimYaz(String name, String surname) {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
        System.out.println(name + " " + surname);
    }


}
