/* Nama file   : Lingkaran.java
   Deskripsi   : tipe class Lingkaran
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 10-Maret-2026 */

public final class Lingkaran extends BangunDatar {
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


}
