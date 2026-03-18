/* Nama file   : Lingkaran.java
   Deskripsi   : tipe class Lingkaran
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 17-Maret-2026 */

public final class Lingkaran extends BangunDatar implements IResize{
    /************** Atribut ****************/
    private double jari;

    /************** Method *****************/
    public Lingkaran()
    {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String W, String B)
    {
        super(1, W, B);
        this.jari = diameter / 2;
    }

    public double getJari()
    {
        return jari;
    }

    public void setJari(double jari)
    {
        this.jari = jari;
    }

    public double getLuas()
    {
        return  Math.PI * Math.pow(jari, 2);
    }

    public double getKeliling()
    {
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn()
    {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut()
    {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent)
    {
        jari = jari * percent/100;
    }
}
