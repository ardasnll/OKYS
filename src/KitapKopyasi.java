public class KitapKopyasi {
    private String barkod;
    private Kitap kitap;

    public KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
    }

    public String getBarkod() {
        return barkod;
    }

    public Kitap getKitap() {
        return kitap;
    }
}