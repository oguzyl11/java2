package This;

public class Kutuphane {
	public class Yayin {
		String baslik,yazar;
		static int toplamYayinSayisi;
		Yayin(String baslik,String yazar){
			this.baslik =baslik ;
			this.yazar = yazar ;
			toplamYayinSayisi++;
		}
		Yayin(){
			this.baslik = "Isimisz Yayin";
			this.yazar = "Bilinmiyor";
			
		}
		void bilgiGoster(){
			System.out.println(baslik+"  "+yazar);
			
		}
	}
	public class Kitap extends Yayin{
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

}
