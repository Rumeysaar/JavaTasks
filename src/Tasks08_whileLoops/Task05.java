package Tasks08_whileLoops;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner input = new Scanner(System.in);
		System.out.println("adiniz?");
		String name = input.nextLine().toUpperCase();
		//String fullName = input.nextLine();
		char ilkHarf = name.charAt(0);

		System.out.println("soyadiniz");
		String surname = input.nextLine().toUpperCase();
		char sonHarf = surname.charAt(surname.length()-1);

		if (ilkHarf <= sonHarf ) {

			while (ilkHarf <= sonHarf) {
				System.out.print(ilkHarf + " ");
				ilkHarf++;
			}
		}else
			System.out.println("son harf ilk harften once");


		//int i = 0;
	    //while (i <= fullName.length()-1) {
		//	System.out.print(fullName.charAt(i) + " ");
		//	i++;
	    //}
//
		//while (i <= fullName.charAt(fullName.length()-1)) {
		//	System.out.print(fullName.charAt(i) + " ");
		//	i++;
		//}


	}

}
