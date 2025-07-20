package düzeltilen;


	abstract class Urun {
	    protected String ad;
	    protected double fiyat;

	    public Urun(String ad, double fiyat) {
	        this.ad = ad;
	        this.fiyat = fiyat;
	    }

	    public String getAd() {
	        return ad;
	    }

	    public double getFiyat() {
	        return fiyat;
	    }

	    public abstract void urunBilgisi();
	}
	


