package düzeltilen;


	import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
	import java.io.PrintWriter;
// garson sınıfını kisi sinifindan miras aldim
	public class Garson extends Kisi { 
	    public Garson(String ad) {
	        super(ad);
	    }
// siparis aldim ve konsola yazdirdim bu metotlarla
	    public void siparisAl(Siparis siparis) {
	        siparis.siparisBilgisi();
	        System.out.println("Sipariş alındı.\n");
	        //siparis bilgilerini dosyaya yazmak icin asagidakiislemleri yaptim
	        
	        
	        try {
	            PrintWriter yazici = new PrintWriter(new File("Siparisler/siparis_" + Siparis.siparisNo + ".txt"));
	            siparis.siparisYazdir(yazici);
	            yazici.close();
	        } catch (IOException e) {
	            System.out.println("Hata: " + e.getMessage());
		   }
		}
	}
	


