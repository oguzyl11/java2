package This;

public class Ogrenci {
	private String ad;
	private double not;
	public void setAd(String ad) {
		this.ad = ad;
		System.out.println(ad);
	}
	public Ogrenci(String ad,double not) {
		this.ad=ad;
		this.not=not;
		
	}
	public void setNot(double not) {
		if (not <= 100) {
			if(0 <= not) {
			    this.not = not;
		}}
		else {
			System.out.println("Hatalı not girişi");
			
		}
	}
	public String getAd() {
		return ad;
	}
	public double getNot() {
		return not;
	}

}
