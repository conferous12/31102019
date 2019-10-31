
import org.junit.*;

public class HesaplamaTest {

	@Test
	public void testTopla() {
		String sayi1="10";
		String sayi2="20";
		String sonuc= Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("30",sonuc);
		
		
		
		
	}

	
	@Test
	public void testToplaa() {
		String sayi1="20";
		String sayi2="20";
		String sonuc= Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("40",sonuc);
		
	}
	@Test
	public void testHataliSayilar() {
		String sayi1="10x";
		String sayi2="20";
		String sonuc= Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("undefined",sonuc);
		
		
	}


}
