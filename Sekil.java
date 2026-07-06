package This;
public abstract class Sekil {
	abstract void alanHesapla() ;
}
 class Daire extends Sekil { 
	 private double r;

	    Daire(double r) {
	        this.r = r;
	    }

	    @Override
	    void alanHesapla() {
	        double alan = Math.PI * r * r;
	        System.out.println("Dairenin Alanı: " + alan);
    }
}
 class Dikdortgen extends Sekil {
    private double uzunluk;
    private double genislik;

    Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    void alanHesapla() {
        double alan = uzunluk * genislik;
        System.out.println("Dikdörtgenin Alanı: " + alan);
    }
}
