import java.util.ArrayList;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;


    private ArrayList<KitapKopyasi> fizikselKopyalar;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili, String durum) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = durum;
        this.fizikselKopyalar = new ArrayList<KitapKopyasi>();
    }


    public KitapKopyasi kopyaEkle(String barkod) {
        KitapKopyasi yeniKopya = new KitapKopyasi(barkod, this);
        this.fizikselKopyalar.add(yeniKopya);
        return yeniKopya;
    }

    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public String getIsbn() { return isbn; }
}