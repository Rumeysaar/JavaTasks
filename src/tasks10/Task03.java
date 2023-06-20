package tasks10;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.


		saniye(10);
		mil(2);
		gram(3);


	}

	private static double gram(int i) {
		System.out.println(i + " kg = " + i * 1000 + " grdir");
		return i * 100;

	}

	private static double mil(int m) {
		System.out.println(m + " mil = " + m * 1.609344 + " kmdir");
		return m * 1.609344;
	}

	public static int saniye(int a) {
		System.out.println(a + " saat = " + a * 60 + " saniyedir");
		return a * 3600;

	}


}
