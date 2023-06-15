package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		int sayi = 999;
		int counter = 0;

		System.out.print("3 basamakli 4 ve 6 ya tam bolunebilen tam sayilar = " );

		while (sayi >= 100){
			sayi--;
			if (sayi % 4 == 0 & sayi % 6 == 0){
				System.out.print(sayi + " ");
				counter++;
			}
		}System.out.println();

		System.out.println("adedi = "+ counter);


		

		
			
	}

}
