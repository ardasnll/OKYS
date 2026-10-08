import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Uye uye = new Uye(1, "Hasan Arda Şenel", "ardawaitforitsenel@gmail.com", "arda123");
        Kitap kitap = new Kitap("818-435-07", "Bir Delinin Hatıra Defteri", "Nikolay Gogol", 1835, "Ödünç Verilebilir");
        KitapKopyasi kopya1 = kitap.kopyaEkle("Barkod-001");

        OduncKaydi kayit = new OduncKaydi(
                101,
                uye,
                kopya1,
                LocalDate.now(),
                LocalDate.now().plusDays(15)
        );

        kayit.bilgileriYazdir();
    }
}