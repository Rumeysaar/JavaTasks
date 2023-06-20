package Tasks08_whileLoops;

import java.util.Locale;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

			Scanner scan = new Scanner(System.in);
		System.out.println("Bir metin giriniz");
		String metin = scan.nextLine().toLowerCase();

		int harfSayisi = 0;
		int rakamSayisi = 0;
		int ozelKarakter = 0;

		int index = 0;

		while (metin.length()>index){
			if (Character.isDigit(metin.charAt(index)))
				rakamSayisi++;
			else if (Character.isAlphabetic(metin.charAt(index)))
				harfSayisi++;
			else
				ozelKarakter++;
			index++;
		}
		System.out.println("harfSayisi = " + harfSayisi);
		System.out.println("rakamSayisi = " + rakamSayisi);
		System.out.println("ozelKarakter = " + ozelKarakter);







	}

}
