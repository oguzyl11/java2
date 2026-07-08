package Deneme;

public abstract class Kisi {
	protected String ad;
	private int tcKimlik;
	private int dogumYili;
	static int toplamKisiSayisi;
	abstract void gorevRaporu(){
	}
	Kisi(String ad,int tcKimlik,int dogumYili){
		this.ad = ad;
		this.tcKimlik = tcKimlik;
		this.dogumYili = dogumYili;
		
	}
	public void getTcKimlik(int tcKimlik){
		this.tcKimlik = tcKimlik;
		return ;
		
	}
	public void setAd(String ad) {
		if (ad != null && !ad.trim().isEmpty()) {
			this.ad = ad;
		}
		else {
			System.out.println("Hata: Ad alanı boş bırakılamaz veya geçersiz olamaz!");
		}
		
	}
	public void getAd(String ad) {
		this.ad = ad;
		return;
		
	}

}
