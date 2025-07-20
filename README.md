# Restoran Yönetim Sistemi

Bu proje, bir restoran yönetim sistemini simüle eden bir Java uygulamasıdır. Yemek ve içecek siparişlerini yönetme, menüyü görüntüleme ve siparişleri dosyaya kaydetme gibi temel işlevleri içerir.

---

## 📂 İçindekiler

- [Proje Yapısı](#proje-yapısı)  
- [Kurulum](#kurulum)  
- [Kullanım](#kullanım)  
- [Örnek Çıktılar](#örnek-çıktılar)  
- [Dosya Yapısı](#dosya-yapısı)  
- [Notlar](#notlar)  
- [Gereksinimler](#gereksinimler)  
- [Katkıda Bulunma](#katkıda-bulunma)  
- [Lisans](#lisans)

---

## 📘 Proje Yapısı

Proje, aşağıdaki sınıfları içerir:

- **`Kisi`**: Soyut temel sınıf. `Musteri` ve `Garson` sınıfları bu sınıftan türetilir.
- **`Urun`**: Soyut sınıf. Menüdeki ürünlerin (`Yemek`, `Icecek`) ad ve fiyat gibi temel özelliklerini tanımlar.
- **`Yemek`**: Ad, fiyat ve tür bilgilerini içerir.
- **`Icecek`**: Ad, fiyat ve boyut bilgilerini içerir.
- **`Musteri`**: Sipariş verme işlemlerini gerçekleştiren sınıf.
- **`Garson`**: Siparişleri alır ve `Siparisler` klasörüne `.txt` formatında kaydeder.
- **`Siparis`**: Sipariş bilgilerini tutar ve hem konsola hem dosyaya yazdırır.
- **`Restoran`**: Menü, müşteri ve garson listesini yönetir. Rastgele sipariş oluşturma ve menü görüntüleme gibi işlevleri barındırır.
- **`Main`**: Uygulamanın giriş noktasıdır. Menü, müşteri ve garson nesnelerini oluşturur; işlemleri başlatır.

---

## ⚙️ Kurulum

### 1. Gereksinimler

- Java Development Kit (JDK) 8 veya üzeri sürüm
- Yazma izni olan bir klasör

### 2. Proje Dosyalarını İndirme

Bu repoyu klonlayarak veya manuel olarak bir dizine kopyalayarak projeyi edinebilirsiniz.

### 3. Derleme ve Çalıştırma

Bir Java IDE'si (IntelliJ IDEA, Eclipse vb.) kullanabilir veya terminalden aşağıdaki komutlarla çalıştırabilirsiniz:

```bash
javac RestoranYonetim/*.java
java RestoranYonetim.Main
## 🚀 Kullanım

- **Menü Görüntüleme**: Uygulama başladığında menüdeki yemek ve içecekler konsola yazdırılır.
- **Rastgele Sipariş Oluşturma**: `restoran.rasgeleSiparislerOlustur(sayi)` metodu ile istenen sayıda sipariş rastgele oluşturulur.
- **Sipariş Kaydı**: Her sipariş hem konsola yazdırılır hem de `Siparisler/` klasöründe `siparis_1.txt`, `siparis_2.txt` gibi dosyalara kaydedilir.

---

## 📁 Dosya Yapısı

```plaintext
/RestoranYonetim/
├── Kisi.java
├── Musteri.java
├── Garson.java
├── Urun.java
├── Yemek.java
├── Icecek.java
├── Siparis.java
├── Restoran.java
└── Main.java

## 📌 Notlar

- **Dosya Yazma**: Siparişler, çalıştırma dizininde `Siparisler/` klasörüne yazılır. Yazma izni gereklidir.
- **Hata Yönetimi**: Dosya işlemlerinde `IOException` yakalanır ve hata mesajı konsola yazdırılır.
- **Menü Güncelleme**: Yeni yemek veya içecek eklemek için `menuyeUrunEkle()` metodu kullanılabilir.

---

## ✅ Gereksinimler

- Java 8 veya üstü sürüm
- Dosya sistemine yazma izni (`Siparisler/` klasörü için)

---
