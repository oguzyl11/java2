package This;

public class Arac {
	String marka;
	int hiz ;
	void bilgiGoster() {
		System.out.println(marka+"  "+ hiz );
		
	}
	class Otomobil extends Arac {
		int kapiSayisi;
		@Override
		void bilgiGoster() {
			super.bilgiGoster();
			System.out.println(""+this.kapiSayisi+"");
		}
		Otomobil (int kapiSayisi ,int hiz , String marka ){
			super();
			this.kapiSayisi = kapiSayisi;
			
		}
	}

	
}
