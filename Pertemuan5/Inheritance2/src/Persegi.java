/* Nama file   : Persegi.java
   Deskripsi   : tipe class Persegi
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 17-Maret-2026 */

public class Persegi extends BangunDatar implements IResize {
    /************** Atribut ****************/
    private double sisi;
 
    /************** Method *****************/
    public Persegi()
    {
        setJmlSisi(4);
    }

    // public Persegi(double sisi, String Warna, String Border)
    // {
    //     this.jmlSisi = 4;
    //     this.warna = Warna;
    //     this.border = Border;
    //     this.sisi = sisi;
    // }

    // public Persegi(double sisi, String Warna, String Border)
    // {
    //     this.sisi = sisi;
    //     setWarna(Warna);
    //     setBorder(Border);
    //     setJmlSisi(4);
    // }

    public Persegi(double sisi, String Warna, String Border)
    {
        super(4, Warna, Border);
        this.sisi = sisi;
    }

    public double getSisi()
    {
        return sisi;
    }

    public void setSisi(double S)
    {
        this.sisi = S;
    }

    // @Override
    // public void printInfo()
    // {
    //     System.out.println("Jumlah sisi: " +getJmlSisi());
    //     System.out.println("warna: " +getwarna());
    //     System.out.println("Border: " +getBorder());
    //     System.out.println("Sisi: " +sisi);
    // }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Sisi: " +sisi);
    }

    ///////////////////////////////////////
    public double getLuas()
    {
        return sisi * sisi;
    }

    public double getKeliling()
    {
        return sisi * 4;
    }
    
    public double getDiagonal()
    {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void zoomIn()
    {
        sisi = sisi * 1.1;
    }

    // @Override
    // public void zoomOut()
    // {
    //     sisi = sisi * 0.9;
    // }

    // @Override
    // public void zoom(int percent)
    // {
    //     sisi = sisi * percent/100;
    // }
}
