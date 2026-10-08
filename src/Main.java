public class Main {
    public static void main(String[] args) {

        Uye uye = new Uye(1, "Hasan Arda Şenel", "ardawaitforitsenel@gmail.com", "arda123");

        Kitap kitap = new Kitap("818-435-07", "Bir Delinin Hatıra Defteri", "Nikolay Gogol", 1835, "Rafta");

        KitapKopyasi kopya1 = kitap.kopyaEkle("Barkod-001");


        OduncKaydi kayit1 = new OduncKaydi(
                5001,
                uye,
                kopya1,
                "08.10.2026",
                "23.10.2026"
        );


        kayit1.bilgileriYazdir();
    }
}