/* Nama file   : BangunDatar.java
   Deskripsi   : tipe class BangunDatar
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 10-Maret-2026 */

public class BangunDatar {
    /************** Atribut ****************/
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar;

    /************** Method *****************/
    public BangunDatar()
    {
        counterBangunDatar++;
    }
    
    public BangunDatar(int jmlSisi, String warna, String border)
    {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi()
    {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi)
    {
        this.jmlSisi = jmlSisi;
    }

    public String getwarna()
    {
        return warna;
    }

    public void setwarna(String W)
    {
        this.warna = W;
    }

    public String getBorder()
    {
        return border;
    }

    public void setBorder(String B)
    {
        this.border = B;
    }

    public void printInfo()
    {
        System.out.println("Jumlah sisi: " +getJmlSisi());
        System.out.println("warna: " +getwarna());
        System.out.println("Border: " +getBorder());
    }

    // @Override
    public static void printCounterBangunDatar()
    {
        System.out.println("Jumlah Objek Bangun Datar: " +counterBangunDatar);
    }
}
