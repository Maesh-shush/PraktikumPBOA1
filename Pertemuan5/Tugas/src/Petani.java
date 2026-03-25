/* Nama file   : Petani.java
   Deskripsi   : tipe class Petani
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 24-Maret-2026 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /************** Atribut ****************/
    private String asal_kota;
    private static int counterPetani = 0;

    /************** Method *****************/
    /* Konstruktor */
    Petani()
    {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    Petani(String n, LocalDate d, String a, double p, String ak)
    {
        super(n, d, a, p);
        this.asal_kota = ak;
        counterPetani++;
    }

    /* Selector & Mutator */
    public String getAsalKota()
    {
        return asal_kota;
    }

    public void setAsalKota(String ak)
    {
        this.asal_kota = ak;
    }

    public static int getCounterPetani()
    {
        return counterPetani;
    }

    public double hitungPajak()
    {
        return 0;
    }

    public String hitungMasaKerja()
    {
        Period p = Period.between(tgl_mulai_kerja, LocalDate.now()).plusYears(2);

        return p.getYears() + " Tahun " +p.getMonths()+ " Bulan " +p.getDays()+ " Hari";
    }
}
