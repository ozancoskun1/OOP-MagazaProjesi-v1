package OOP;

import java.util.Scanner;

public class Giris {

	public static void main(String[] args) {
		/*
		 * =========================================== 🧱 CLASS (Sınıf) Nedir?
		 * =========================================== Bir sınıf (class), aslında bir
		 * "taslak" veya "şablondur". Yani, bir nesnenin (object) hangi özelliklere ve
		 * davranışlara sahip olacağını tanımlar.
		 * 
		 * Örneğin "Araba" bir sınıf olabilir. Arabanın özellikleri (marka, renk, hız)
		 * ve davranışları (çalış, hızlan, dur) vardır.
		 * 
		 * Sınıf sadece bir tanımdır, kendi başına bir şey yapmaz. Ancak bu sınıftan
		 * nesneler oluşturduğumuzda işler gerçek olur.
		 */
		/*
		 * =========================================== 🚗 OBJECT (Nesne) Nedir?
		 * =========================================== Nesne, sınıfın **gerçek hali**,
		 * yani **canlı versiyonudur**.
		 * 
		 * Sınıf bir “plan” ise, nesne bu planla yapılan “gerçek bina” gibidir.
		 * 
		 * Örneğin: "Araba" sınıfı bir plan, "BenimArabam" o plandan üretilmiş gerçek
		 * bir arabadır.
		 * 
		 * Her nesne aynı sınıftan gelse bile kendine özgü değerler taşıyabilir.
		 */

		/*
		 * Ogrenci emre= new Ogrenci(); emre.aktif=true; emre.isim=" Emre ";
		 * emre.ogrenciNo= 220240016 ; emre.sinif= 12 ;
		 * 
		 * emre.bilgiYazdir();
		 * 
		 * Ogrenci ozan=new Ogrenci();
		 * 
		 * ozan.isim=" Ozan " ; ozan.ogrenciNo= 220240016 ; ozan.sinif= 4 ;
		 * 
		 * ozan.bilgiYazdir();
		 * 
		 * Dikdortgen d1 = new Dikdortgen(); d1.en=5; d1.boy=3;
		 * 
		 * d1.enBoyHesaplama();
		 * 
		 * d1.toplamAlaniYaz();
		 * 
		 * Araba birNoluAraba =new Araba(); birNoluAraba.marka=" Alfa Romeo ";
		 * birNoluAraba.model=" Gulia "; birNoluAraba.yil= 2022; birNoluAraba.fiyat=
		 * 3500000;
		 * 
		 * birNoluAraba.aracBilgileri();
		 * 
		 * Araba ikiNoluAraba =new Araba(); ikiNoluAraba.marka=" Fiat ";
		 * ikiNoluAraba.model=" Bravo "; ikiNoluAraba.yil= 2013; ikiNoluAraba.fiyat=
		 * 560000;
		 * 
		 * ikiNoluAraba.aracBilgileri();
		 */

		/*
		 * Arac bir =new Arac(); bir.marka="BMW"; bir.model=" 1.18d ";
		 * bir.depoKapasitesi=60; bir.yakitTuketimi=9.3;
		 * 
		 * bir.aracBilgiler(); bir.menzilHesapla();
		 * 
		 * 
		 * Arac iki=new Arac(); iki.marka="Alfa Romeo"; iki.model="Gulia";
		 * iki.depoKapasitesi=50; iki.yakitTuketimi=6.7;
		 * 
		 * iki.aracBilgiler(); iki.menzilHesapla();
		 */

		/*
		 * Dikdortgen d1=new Dikdortgen(); d1.alanHesapla(3,6); d1.alanHesapla(9, 7);
		 */

		/*
		 * Telefon t1 =new Telefon("Apple","iPhone",10);
		 * 
		 * t1.hakkindaGoster(); t1.sarjEt(50); t1.sarjAzalt(10); t1.hakkindaGoster();
		 * t1.pilDurumu();
		 * 
		 * Telefon t2=new Telefon("Xiaomi","Redmi Note 11 s ",10);
		 * 
		 * t2.hakkindaGoster(); t2.sarjEt(50); t2.sarjAzalt(61); t2.hakkindaGoster();
		 * t2.pilDurumu();
		 * 
		 * Telefon t3=new Telefon("Samsung","A50 S",10);
		 * 
		 * t3.hakkindaGoster(); t3.sarjEt(4); t3.sarjAzalt(90); t3.hakkindaGoster();
		 * t3.pilDurumu();
		 */

		/*
		 * Telefon1 t1=new Telefon1("Apple", " iPhone 17 pro", 81);
		 * t1.TelefonHakkinda(); t1.bataryaYenile(); t1.eskiPilSeviyesiGoster();
		 * Telefon1 t2=new Telefon1("Apple", " iPhone 11 pro", 78);
		 * t2.TelefonHakkinda(); t2.bataryaYenile(); t2.eskiPilSeviyesiGoster();
		 */

		menuGoster();
	}

	public static void menuGoster() {
		Scanner tara = new Scanner(System.in);
		ElektronikMagaza urun1 = new ElektronikMagaza(" Bulaşık Makinesi ", " Siemens ", " S290 ", 19399);

		ElektronikMagaza urun2 = new ElektronikMagaza(" Bulaşık Makinesi ", " Samsung ", " S5690 ", 29399);

		ElektronikMagaza urun3 = new ElektronikMagaza(" Dizüstü Bilgisayar ", " Monster ", " Abra ", 45000);

		ElektronikMagaza urun4 = new ElektronikMagaza(" Dizüstü Bilgisayar ", " Apple ", " MacBook Pro ", 79000);

		ElektronikMagaza urun5 = new ElektronikMagaza(" Cep Telefonu ", " Apple ", " iPhone 11 pro Max ", 24500);

		ElektronikMagaza urun6 = new ElektronikMagaza(" Cep Telefonu ", " Apple ", " iPhone 14  ", 70000);

		ElektronikMagaza urun7 = new ElektronikMagaza(" Akıllı saat ", " Apple ", " watch 3 ", 11500);

		ElektronikMagaza urun8 = new ElektronikMagaza(" Akıllı saat ", " Apple ", " watch 5 ", 21500);

		System.out.println("Mağazamıza Hoşgeldiniz.");
		System.out.println("------------------------");
		System.out.println("1 - Bulaşık Makinaları ");
		System.out.println("2 - Dizüstü Bilgisayarlar  ");
		System.out.println("3 - Cep Telefonları ");
		System.out.println("4 - Akıllı saatler ");

		System.out.println("--------------------------");
		System.out.println("Lütfen ilgilendiğiniz ürünün kodunu tuşlayın 1 - 4 arası");
		int secim = tara.nextInt();
		if (secim == 1) {
			urun1.urunHakkinda();
			urun2.urunHakkinda();
			System.out.println("Menüye dönmek için 0'ı tuşlayın.");
			int menuTusu = tara.nextInt();
			if (menuTusu == 0) {
				System.out.println("Menüye dönülüyor...");
				menuGoster();
			}
		}
		if (secim == 2) {
			urun3.urunHakkinda();
			urun4.urunHakkinda();
			System.out.println("Menüye dönmek için 0'ı tuşlayın.");
			int menuTusu = tara.nextInt();
			if (menuTusu == 0) {
				System.out.println("Menüye dönülüyor...");
				menuGoster();
			}
		}
		if (secim == 3) {
			urun5.urunHakkinda();
			urun6.urunHakkinda();
			System.out.println("Menüye dönmek için 0'ı tuşlayın.");
			int menuTusu = tara.nextInt();
			if (menuTusu == 0) {
				System.out.println("Menüye dönülüyor...");
				menuGoster();
			}
		}
		if (secim == 4) {
			urun7.urunHakkinda();
			urun8.urunHakkinda();
			System.out.println("Menüye dönmek için 0'ı tuşlayın.");
			int menuTusu = tara.nextInt();
			if (menuTusu == 0) {
				System.out.println("Menüye dönülüyor...");
				menuGoster();
			}
		}
	}

}
