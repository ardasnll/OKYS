import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;
    private List<KitapKopyasi> fizikselKopyalar;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili, String durum) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
        this.fizikselKopyalar = new ArrayList<>();
    }

    public KitapKopyasi kopyaEkle(String barkod) {
        KitapKopyasi kopya = new KitapKopyasi(barkod, this);
        this.fizikselKopyalar.add(kopya);
        return kopya;
    }

    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public String getIsbn() { return isbn; }
    public String getDurum() { return durum; }
    public List<KitapKopyasi> getFizikselKopyalar() { return fizikselKopyalar; }
}