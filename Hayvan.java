package This;

public class Hayvan {
	void sesCikar() {
		System.out.println("Çıkarılan Ses:");
	}

}
class Kedi extends Hayvan{
	@Override
	void sesCikar() {
		System.out.println("Tür: Kedi , Çıkarılan Ses: Miyav");
	}
	
	
}
class Kopek extends Hayvan{
	
	@Override
	void sesCikar() {
		System.out.println("Tür: Köpek, Çıkarılan Ses: Hav");
	}
	}
