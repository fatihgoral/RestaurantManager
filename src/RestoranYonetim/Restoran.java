package düzeltilen;


	//import java.io.FileNotFoundException;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;

	public class Restoran {
	    private List<Urun> menu;
	    private List<Siparis> siparisler;
	    private List<Musteri> musteriler;
	    private List<Garson> garsonlar;

	    public Restoran() {
	        this.menu = new ArrayList<>();
	        this.siparisler = new ArrayList<>();
	        this.musteriler = new ArrayList<>();
	        this.garsonlar = new ArrayList<>();
	    }

	    public void menuyeUrunEkle(Urun urun) {
	        menu.add(urun);
	    }

	    public void garsonEkle(Garson garson) {
	        garsonlar.add(garson);
	    }

	    public void musteriEkle(Musteri musteri) {
	        musteriler.add(musteri);
	    }

	    public void menuyuGoster() {
	        System.out.println("----- MENÜ -----");
	        for (Urun urun : menu) {
	            urun.urunBilgisi();
	            System.out.println("----------------");
	        }
	    }

	    public void rasgeleSiparislerOlustur(int sayi) {
	        Random rand = new Random();
	        for (int i = 0; i < sayi; i++) {
	            Musteri musteri = musteriler.get(rand.nextInt(musteriler.size()));
	            Garson garson = garsonlar.get(rand.nextInt(garsonlar.size()));
	            Yemek yemek = null;
	            Icecek icecek = null;

	            // Rastgele bir yemek seç
	            if (rand.nextBoolean()) {
	                List<Yemek> yemekler = new ArrayList<>();
	                for (Urun urun : menu) {
	                    if (urun instanceof Yemek) {
	                        yemekler.add((Yemek) urun);
	                    }
	                }
	                if (!yemekler.isEmpty()) {
	                    yemek = yemekler.get(rand.nextInt(yemekler.size()));
	                }
	            }

	            // Rastgele bir içecek seç
	            if (rand.nextBoolean()) {
	                List<Icecek> icecekler = new ArrayList<>();
	                for (Urun urun : menu) {
	                    if (urun instanceof Icecek) {
	                        icecekler.add((Icecek) urun);
	                    }
	                }
	                if (!icecekler.isEmpty()) {
	                    icecek = icecekler.get(rand.nextInt(icecekler.size()));
	                }
	            }

	            // Sipariş oluştur ve garsona ver
	            Siparis siparis = musteri.siparisVer(yemek, icecek, garson);
	            garson.siparisAl(siparis);
	            siparisler.add(siparis);
		   }
		}
	}


