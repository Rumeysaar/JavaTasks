package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("bir tam sayi giriniz");
		int sayi1 = input.nextInt();

		int i = 0;

		while (i < sayi1 ) {
			i++;
			System.out.print((i + "x"  + sayi1 + "="  + i * sayi1 + "\t"));
		}



	}

}
