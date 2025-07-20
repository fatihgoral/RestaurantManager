package düzeltilen;

//icecek sinifini urun sinifindan miras aldim
class Icecek extends Urun {
    private String boy;

    public Icecek(String ad, double fiyat, String boy) { //miras alınan sinif ile  ad fiyati belirledim
        super(ad, fiyat);
        this.boy = boy; // boyu burda belirledim
    }

    @Override
    // konsaola bu metotla klasik yazdirma islemi yaptim
    public void urunBilgisi() {
        System.out.println("İçecek Adı: " + ad + "\nFiyat: " + fiyat + "\nBoyut: " + boy);
        System.out.println("----------------");
	}
}

