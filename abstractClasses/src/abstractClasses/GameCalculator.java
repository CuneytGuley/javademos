package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public void gameOver() {
		System.out.println("Oyun bitti!");
	}
}

// abstract class içerisindeki hesapla işlemi GameCalculator ı extend eden class larda olmak zorunda
// abstract sınıf olabilmesi abstract class imzası olmalı
// hesapla işleminin abstract olabilmesi için abstract imzası olmalı.
// abstract sınıfta abstract bir işlem olması zorunlu değil.
// abstract sınıflar new lenemez.

