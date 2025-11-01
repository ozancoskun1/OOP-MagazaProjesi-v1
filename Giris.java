package OOP;

import java.util.Scanner;

public class Giris {

	public static void main(String[] args) {
		

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

