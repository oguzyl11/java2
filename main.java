package This;

public class Main {
	public static void main(String[] args) {
	Mudur a = new Mudur("Remap",30000,"Oğuz");
	System.out.println(a instanceof Calisan);
	System.out.println(a instanceof Kisi);	
	Hayvan[] hayvanlar = new Hayvan[2];
	hayvanlar[0] = new Kedi();
	hayvanlar[1] = new Kopek();
	for(Hayvan h : hayvanlar){
		h.sesCikar();
		
	}}
}
