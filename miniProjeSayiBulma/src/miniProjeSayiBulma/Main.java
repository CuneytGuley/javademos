package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 15;
		boolean varmi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varmi = true;
				break;
			}
		}

		if (varmi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
