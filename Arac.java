package This;

public class Arac {
	String marka;
	int hiz ;
	void bilgiGoster() {
		System.out.println(marka+"  "+ hiz );
	}
	Arac( String marka , int hiz ) {	
		this.marka = marka ;
		this.hiz = hiz ;
   }
}
	class Otomobil extends Arac {
		int kapiSayisi;
		@Override
		void bilgiGoster() {
			super.bilgiGoster();
			System.out.println(""+this.kapiSayisi+"");
		}
		Otomobil (int kapiSayisi ,int hiz , String marka ){
			super(marka,hiz);
			this.kapiSayisi = kapiSayisi;
			
		}
	}

	

