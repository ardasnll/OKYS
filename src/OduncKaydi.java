import java.time.LocalDate;
public class OduncKaydi {
    private int islemNo;
    private LocalDate oduncTarihi;
    private LocalDate sonTeslimTarihi;
    private LocalDate teslimTarihi;

    private Uye uye;
    private KitapKopyasi kitapKopyasi;

    public OduncKaydi(int islemNo, Uye uye, KitapKopyasi kitapKopyasi, LocalDate oduncTarihi, LocalDate sonTeslimTarihi) {
        this.islemNo = islemNo;
        this.uye = uye;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.teslimTarihi = null;
    }

    public void bilgileriYazdir() {
        System.out.println("=== Ödünç Kaydı #" + islemNo + " ===");
        System.out.println("Üye: " + uye.getAd() + " (ID: " + uye.getId() + ")");
        System.out.println("Kitap: " + kitapKopyasi.getKitap().getBaslik() + " - " + kitapKopyasi.getKitap().getYazar());
        System.out.println("Kopya Barkod: " + kitapKopyasi.getBarkod());
        System.out.println("Ödünç Tarihi: " + oduncTarihi + " | Son Teslim: " + sonTeslimTarihi);
    }
}