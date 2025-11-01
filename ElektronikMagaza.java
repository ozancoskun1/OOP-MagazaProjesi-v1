package OOP;

public class ElektronikMagaza {

	
	String urun;
	String marka;
	String model;
	int fiyat;
	
	public ElektronikMagaza(String urun,String marka,String model , int fiyat) {
		this.urun=urun;
		this.marka=marka;
		this.model=model;
		this.fiyat=fiyat;
	}
	public void urunHakkinda() {
		System.out.println("Ürün Hakkında ");
		System.out.println("-------------------------------");
		System.out.println("Ürün:" + urun +"Marka :" +marka +"Model :" +model + "Fiyat :" +fiyat );
		System.out.println("-------------------------------");
	}
}
