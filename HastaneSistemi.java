public static void main(String[] args) {
        HastaneSistemi sistem = new HastaneSistemi();

        // Sistemi test etmek için birkaç veri ekleyelim
        Doktor d1 = new Doktor("Ali Yılmaz", "11111111111", "Kardiyoloji");
        sistem.doktorListesi.add(d1);
        
        Hasta h1 = new Hasta("Ayşe Demir", "12345678901");
        sistem.hastaSozlugu.put("12345678901", h1);

        // --- WRAPPER SINIFI TESTİ ---
        String dogumYiliGirdisi = "1998";
        try {
            int dogumYili = Integer.parseInt(dogumYiliGirdisi);
            System.out.println("Doğum yılı dönüştürüldü: " + dogumYili);
        } catch (NumberFormatException e) {
            System.out.println("Hata: Lütfen doğum yılını sadece rakamlarla giriniz.");
        }

        // --- STRING METOTLARI İLE TC DOĞRULAMA ---
        String tc = "12345678901";
        if (tc != null && tc.length() == 11 && !tc.startsWith("0")) {
            System.out.println("TC formata uygun, doğrulandı.");
        } else {
            System.out.println("Geçersiz TC Kimlik numarası.");
        }

        // --- EXCEPTION YAKALAMA TESTİ ---
        try {
            Hasta bulunan = sistem.tcIleHastaBul("99999999999");
        } catch (RandevuBulunamadiException e) {
            System.out.println("Sistem Uyarısı: " + e.getMessage());
        }

        // --- STRINGBUILDER İLE RAPORLAMA ---
        StringBuilder topluRapor = new StringBuilder();
        topluRapor.append("\n=== GÜN SONU DOKTOR RAPORU ===\n");

        for (Doktor d : sistem.doktorListesi) {
            topluRapor.append(d.detayliRaporOlustur()).append("\n");
        }

        System.out.println(topluRapor.toString());
        System.out.println("Sistemde Oluşturulan Toplam Kişi Sayısı: " + Kisi.toplamKisiSayisi);
    }
}