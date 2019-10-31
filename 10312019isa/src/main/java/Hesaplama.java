import java.util.*;
import java.math.*;

public class Hesaplama {
	
	
	public static String topla(String sayi1, String sayi2) {
		try {
			BigDecimal bigDecimal1 = new BigDecimal(sayi1);
			BigDecimal bigDecimal2= new BigDecimal(sayi2);
			return bigDecimal1
				.add(bigDecimal2)
				.toPlainString();
		
	}		catch(Exception e) {
				return "undefined";
	}
	}
	
	
	public static void main(String[]args) {
		
		Scanner konsolOku = new Scanner(System.in);
		
		System.out.print("1.Sayiyi giriniz:");
		String sayi1 = konsolOku.nextLine();
		
		System.out.print("2.Sayiyi giriniz:");
		String sayi2 = konsolOku.nextLine();
		
		String sonuc=Hesaplama.topla(sayi1,sayi2);
		
		System.out.printf("%s + %s = %s",sayi1,sayi2,sonuc);
		
	}

}
