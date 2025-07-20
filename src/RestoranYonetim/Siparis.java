package düzeltilen;


	import java.io.PrintWriter;

	public class Siparis {
	    private Yemek yemek;
	    private Icecek icecek;
	    public Garson garson;
	    private Musteri musteri;
	    public java.util.Date tarih;
	    public static long siparisNo = 0;

	    public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri) {
	        this.yemek = yemek;
	        this.icecek = icecek;
	        this.garson = garson;
	        this.musteri = musteri;
	        this.tarih = new java.util.Date();
	        siparisNo++;
	    }

	    public void siparisBilgisi() {
	        System.out.println(
	                "Sipariş Bilgileri:\n" +
	                        "Yemek: " + ((yemek == null) ? "Boş - 0.0" : yemek.getAd() + " - " + yemek.getFiyat()) + "\n" +
	                        "İçecek: " + ((icecek == null) ? "Boş - 0.0" : icecek.getAd() + " - " + icecek.getFiyat()) + "\n" +
	                        "Garson: " + garson.getAd() + "\n" +
	                        "Müşteri: " + musteri.getAd() + "\n" +
	                        "Zaman: " + tarih);
	    }

	    public void siparisYazdir(PrintWriter yazici) {
	        yazici.println(
	                "Sipariş Bilgileri:\n" +
	                "Yemek: " + ((yemek == null) ? "Boş - 0.0" : yemek.getAd() + " - " + yemek.getFiyat()) + "\n" +
	                "İçecek: " + ((icecek == null) ? "Boş - 0.0" : icecek.getAd() + " - " + icecek.getFiyat()) + "\n" +
	                "Garson: " + garson.getAd() + "\n" +
	                "Musteri: " + musteri.getAd() + "\n" +
	                "Zaman: " + tarih + "\n");
	        yazici.close();
	    }
	}


