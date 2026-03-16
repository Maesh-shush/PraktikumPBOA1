/* Nama file   : Dosen.java
   Deskripsi   : tipe class Dosen
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 16-Maret-2026 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    /************** Atribut ****************/
    protected String fakultas;

    /************** Method *****************/
    Dosen()
    {
        
    }

    Dosen(String ni, String na, LocalDate tglla, LocalDate tmt, double gapo, String fak)
    {
        super(ni, na, tglla, tmt, gapo);
        this.fakultas = fak;
    }

    public String getFakultas()
    {
        return fakultas;
    }

    public void setFakultas(String n)
    {
        this.fakultas = n;
    }

    public abstract String getID();
    public abstract String getJabatan();
    public abstract int getBUP(); 
}
