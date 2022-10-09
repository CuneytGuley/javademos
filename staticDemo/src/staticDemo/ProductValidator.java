package staticDemo;

public class ProductValidator {
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	
}

// public static boolean yaptığımızda, productvalidator ı new lemeden kullanabiliyoruz. 
// direct class ismi ile kullanılabiliyor.
// static yaptığımızda varsa constructor çalışmaz.Çalışması için static blok yapıyoruz.
// Ana class static olamıyor, 
