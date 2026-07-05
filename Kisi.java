package This;

public class Kisi {
	String ad;
	Kisi(String ad ){
		this.ad = ad;
	}
	

}
class Calisan extends Kisi{
	int maas;
	Calisan(int maas,String ad){
		super(ad);
		this.maas = maas;
	}
}
class Mudur extends Calisan {
	String ekip;
	Mudur (String ekip , int maas , String ad){
		super(maas, ad);
		this.ekip = ekip ;
		
	}
	
	 
	
	
	
}
