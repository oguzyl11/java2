import java.util.ArrayList;
import java.util.HashMap;

// --- 1. ENUM TANIMI ---
// Hasta durumlarını güvenli sabitler olarak tanımlıyoruz
public enum RandevuDurumu {
    BEKLIYOR, MUAYENEDE, TABURCU
}

// --- 2. CUSTOM EXCEPTION (ÖZEL HATA SINIFI) ---
// Exception sınıfından miras alarak kendi hatamızı üretiyoruz
public class RandevuBulunamadiException extends Exception {
    public RandevuBulunamadiException(String mesaj) {
        super(mesaj); // Üst sınıfın yapıcı metoduna mesajı iletiyoruz
    }
}

// --- 3. ANA SİSTEM SINIFI VE KOLEKSİYONLAR ---
public class HastaneSistemi {
    // Doktorları tutacağımız esnek liste
    private ArrayList<Doktor> doktorListesi = new ArrayList<>();
    
    // Hastalara TC kimlik ile hızlı erişim sağlayacak sözlük (Key: TC, Value: Hasta)
    private HashMap<String, Hasta> hastaSozlugu = new HashMap<>();

    // HashMap üzerinde TC ile hasta arayan ve bulamazsa hata fırlatan metot
    public Hasta tcIleHastaBul(String tc) throws RandevuBulunamadiException {
        // containsKey ile bu TC sistemde var mı diye bakıyoruz
        if (hastaSozlugu.containsKey(tc)) {
            return hastaSozlugu.get(tc); 
        } else {
            // Hasta yoksa, özel hatamızı fırlatıyoruz (throw)
            throw new RandevuBulunamadiException("Kayıtlarda bu TC'ye ait hasta bulunamadı: " + tc);
        }
    }
Adım 5: Wrapper Sınıfları, String İşlemleri ve StringBuilder Performansı
Kullanıcıdan gelen metin tabanlı verileri sayılara dönüştürmek için Wrapper sınıflarını (Integer.parseInt) kullanırız. String birleştirmelerinde ise, String sınıfı değiştirilemez (immutable) olduğu için her + işlemi yeni bir nesne oluşturur; bu yüzden rapor gibi uzun metinlerde belleği yormamak adına StringBuilder kullanmak şarttır.

Yukarıda oluşturduğumuz HastaneSistemi sınıfının içine main metodunu ekleyerek bu adımı tamamlayalım:

Java
    // --- 4. MAIN METODU VE SENARYOLAR ---
    public static void main(String[] args) {
        HastaneSistemi sistem = new HastaneSistemi();

        // 5.A: WRAPPER SINIFI VE HATA YAKALAMA (Doğum Yılı)
        String dogumYiliGirdisi = "1998";
        try {
            // Metni tam sayıya çeviriyoruz (Autoboxing / Parsing)
            int dogumYili = Integer.parseInt(dogumYiliGirdisi);
            System.out.println("Doğum yılı dönüştürüldü: " + dogumYili);
        } catch (NumberFormatException e) {
            // Eğer "1998A" gibi geçersiz bir giriş olsaydı program çökmeyecek, burası çalışacaktı
            System.out.println("Hata: Lütfen doğum yılını sadece rakamlarla giriniz.");
        }

        // 5.B: STRING METOTLARI İLE TC DOĞRULAMA
        String tc = "12345678901";
        // Uzunluk tam 11 mi ve ilk karakter '0' haricinde bir şey mi diye kontrol ediyoruz
        if (tc != null && tc.length() == 11 && !tc.startsWith("0")) {
            System.out.println("TC formata uygun, doğrulandı.");
        } else {
            System.out.println("Geçersiz TC Kimlik numarası.");
        }

        // Adım 4'teki Exception fırlatan metodu burada try-catch ile yakalayarak test ediyoruz
        try {
            Hasta bulunan = sistem.tcIleHastaBul("99999999999");
        } catch (RandevuBulunamadiException e) {
            // throw ile fırlatılan hatayı burada kullanıcı dostu bir mesajla ekrana basıyoruz
            System.out.println("Sistem Uyarısı: " + e.getMessage());
        }

        // 5.C: STRINGBUILDER İLE PERFORMANSLI RAPORLAMA
        StringBuilder topluRapor = new StringBuilder();
        topluRapor.append("=== GÜN SONU DOKTOR RAPORU ===\n");

        // ArrayList içindeki doktorları döngüyle gezip raporlarını StringBuilder'a tek bir nesne üzerinden ekliyoruz
        for (Doktor d : sistem.doktorListesi) {
            topluRapor.append(d.detayliRaporOlustur()).append("\n");
        }

        // En son tek bir String nesnesine çevirip yazdırıyoruz
        System.out.println(topluRapor.toString());
    }
}