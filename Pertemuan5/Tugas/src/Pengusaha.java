/* Nama file   : Pengusaha.java
   Deskripsi   : tipe class Pengusaha
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 24-Maret-2026 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /************** Atribut ****************/
    private String npwp;
    private static int counterPengusaha = 0;

    /************** Method *****************/
    /* Konstruktor */
    Pengusaha()
    {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    Pengusaha(String n, LocalDate d, String a, double p, String npwp)
    {
        super(n, d, a, p);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /* Selector & Mutator */
    public String getNPWP()
    {
        return npwp;
    }

    public void setNPWP(String n)
    {
        this.npwp = n;
    }

    public static int getCounterPengusaha()
    {
        return counterPengusaha;
    }

    public double hitungPajak()
    {
        return 0.15 * pendapatan;
    }

    public String hitungMasaKerja()
    {
        Period p = Period.between(tgl_mulai_kerja, LocalDate.now()).plusYears(0);

        return p.getYears() + " Tahun " +p.getMonths()+ " Bulan " +p.getDays()+ " Hari";
    }
}
