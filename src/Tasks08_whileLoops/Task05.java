package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner input = new Scanner(System.in);
		System.out.println("adiniz soyadiniz?");
		String fullName = input.nextLine();

	    int i = 0;
	    while (i <= fullName.length()-1) {
			System.out.print(fullName.charAt(i) + " ");
			i++;
	    }


		//for (int i = 0; i < fullName.length(); i++) {
		//	System.out.print(fullName.charAt(i) + " ");
		//}

	}

}
