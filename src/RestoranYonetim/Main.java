
package düzeltilen;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
   //     PrintWriter pw = new PrintWriter(new File("siparisler.txt"));
        Restoran restoran = new Restoran();

        Yemek[] yemekler = {
            new Yemek("Fıstıklı Kuzu Kebap", 250.0, "Kebap"),
            new Yemek("İçli Köfte", 60.0, "Hamurlu"),
            new Yemek("Ciğer Kavurma", 100.0, "Dürüm")
        };
        
        Icecek[] icecekler = {
            new Icecek("Ayran", 20.0, "Soğuk"),
            new Icecek("Acılı Şalgam", 25.0, "Doğal"),
            new Icecek("Gazoz", 5.0, "Asitli")
        };

        for (Yemek yemek : yemekler) {
            restoran.menuyeUrunEkle(yemek);
        }

        for (Icecek icecek : icecekler) {
            restoran.menuyeUrunEkle(icecek);
        }

        Musteri[] musteriler = {
            new Musteri("Necdet"),
            new Musteri("Musa"),
            new Musteri("Furkan")
        };

        Garson[] garsonlar = {
            new Garson("Behzat"),
            new Garson("Ömer"),
            new Garson("Polat")
        };

        for (Musteri musteri : musteriler) {
            restoran.musteriEkle(musteri);
        }

        for (Garson garson : garsonlar) {
            restoran.garsonEkle(garson);
        }

        restoran.menuyuGoster();

        restoran.rasgeleSiparislerOlustur(10);

      
    }
}



