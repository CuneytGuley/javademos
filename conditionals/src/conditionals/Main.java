package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 20;
		if (sayi<20) {
			System.out.println("Sayı 20 den küçüktür");
		}
		
		if (sayi<15) {
			System.out.println("Sayı 15 den küçüktür");
		}
		
		if (sayi<20) {
			System.out.println("Sayı 20 den küçüktür");
		} else {
			System.out.println("Sayı 20 den küçüktür değildir");
		}
		
		if (sayi<20) {
			System.out.println("Sayı 20 den küçüktür");
		} else if(sayi == 20){ 
			System.out.println("Sayı 20 e eşittir");
		} else {
			System.out.println("Sayı 20 den büyüktür");
		}

	}

}
