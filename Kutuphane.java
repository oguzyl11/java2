package This;

public class Kutuphane {
	 public static void main(String[] args) {   // <-- SADECE BU SATIRI DEĞİŞTİR
	        Yayin yayin = new Yayin();
	        yayin.bilgiGoster();
	        Kitap kitap = new Kitap("Suç ve Ceza", "Dostoyevski", 550);
	        kitap.bilgiGoster();
	        EKitap eKitap = new EKitap("Java Rehberi", "Ferhat Uçar", 300, 15.5);
	        eKitap.bilgiGoster();
	        System.out.println(Yayin.toplamYayinSayisi);
	        System.out.println(eKitap instanceof Kitap);
	        System.out.println(eKitap instanceof Yayin);
	    }
}
class Yayin {
		String baslik,yazar;
		static int toplamYayinSayisi;
		Yayin(String baslik,String yazar){
			this.baslik =baslik ;
			this.yazar = yazar ;
			toplamYayinSayisi++;
		}
		Yayin(){
			this("Isimsiz Yayin","Bilinmiyor");
			
			
		}
		void bilgiGoster(){
			System.out.println(baslik+"  "+yazar);
			
		}
	}
 class Kitap extends Yayin{
		int sayfaSayisi;
		Kitap(String baslik , String yazar , int sayfaSayisi){
			super (baslik,yazar);
			this.sayfaSayisi = sayfaSayisi;
			
		
		}
		@Override
		void bilgiGoster() {
			super.bilgiGoster();
			System.out.println("  "+ sayfaSayisi +"  ");
			
			
		}
	}
 class EKitap extends Kitap {
		double dosyaBoyutuMB;
		EKitap (String baslik, String yazar , int sayfaSayisi , double dosyaBoyutuMB){
			super(baslik,yazar,sayfaSayisi);
			this.dosyaBoyutuMB =dosyaBoyutuMB;
			
		}
		@Override
		void bilgiGoster() {
			super.bilgiGoster();
			System.out.println("  "+dosyaBoyutuMB+"  ");
			
		}
		
		
	}
	

			
	
		
		
		
		
		