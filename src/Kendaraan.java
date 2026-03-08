/* Nama file   : Kendaraan.java
   Deskripsi   : tipe class Kendaraan
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 03-Maret-2026 */

public class Kendaraan {
    /************** Atribut ****************/
    private String noPlat;
    private String jenis;

    /************** Method *****************/
    Kendaraan()
    {
        noPlat = "";
        jenis = "";
    }

    Kendaraan(String no, String jen)
    {
        this.noPlat = no;
        this.jenis = jen;
    }

    public String getNoPlat()
    {
        return this.noPlat;
    }

    public String getJenis()
    {
        return this.jenis;
    }

    public void setNoPlat(String noPlat)
    {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis)
    {
        this.jenis = jenis;
    }
} //end class Kendaraan