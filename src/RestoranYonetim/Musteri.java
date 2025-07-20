package düzeltilen;
// musteri sinifini kisi sinifindan miras alarak olusturdum
	class Musteri extends Kisi {
	    public Musteri(String ad) {
	        super(ad); // ata ssinifin constructoru kullanilarak
		}
	    public Siparis siparisVer(Yemek yemek, Icecek icecek, Garson garson){
	        return new Siparis(yemek, icecek, garson, this);
	    }
	}


