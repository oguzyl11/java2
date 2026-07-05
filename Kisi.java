package This;

public class Kisi {
	int ad;
	Kisi(int ad ){
		this.ad = ad;
	}
	

}
class Calisan extends Kisi{
	int maas;
	Calisan(int maas,int ad){
		super(ad);
		this.maas = maas;
	}
}
class Mudur extends Calisan {
	String ekip;
	Mudur (String ekip , int maas , int ad){
		super(maas, ad);
		this.ekip = ekip ;
		
	}
	
	 
	
	
	
}
