public class OduncKaydi {
    private int islemNo;
    private String oduncTarihi;
    private String sonTeslimTarihi;
    private String teslimTarihi;

    private Uye uye;
    private KitapKopyasi kitapKopyasi;

    public OduncKaydi(int islemNo, Uye uye, KitapKopyasi kitapKopyasi, String oduncTarihi, String sonTeslimTarihi) {
        this.islemNo = islemNo;
        this.uye = uye;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.teslimTarihi = "Henüz teslim edilmedi"; // Basit metin ataması
    }

    public void bilgileriYazdir() {
        System.out.println("--- ÖDÜNÇ ALMA KAYDI ---");
        System.out.println("İşlem No: " + islemNo);
        System.out.println("Üye: " + uye.getAd());
        System.out.println("Kitap: " + kitapKopyasi.getKitap().getBaslik());
        System.out.println("Barkod No: " + kitapKopyasi.getBarkod());
        System.out.println("Ödünç Tarihi: " + oduncTarihi);
        System.out.println("Son Teslim Tarihi: " + sonTeslimTarihi);
        System.out.println("Durum: " + teslimTarihi);
    }
}