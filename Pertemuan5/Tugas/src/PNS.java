/* Nama file   : PNS.java
   Deskripsi   : tipe class PNS
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 24-Maret-2026 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /************** Atribut ****************/
    private String nip;
    private static int counterPNS = 0;

    /************** Method *****************/
    /* Konstruktor */
    PNS()
    {
        super();
        counterPNS++;
    }

    PNS(String n, LocalDate d, String a, double p, String nip)
    {
        super(n, d, a, p);
        this.nip = nip;
        counterPNS++;
    }

    /* Selector & Mutator */
    public String getNIP()
    {
        return nip;
    }

    public void setNIP(String n)
    {
        this.nip = n;
    }

    public static int getCounterPNS()
    {
        return counterPNS;
    }

    public double hitungPajak()
    {
        return 0.1 * pendapatan;
    }

    public String hitungMasaKerja()
    {
        Period p = Period.between(tgl_mulai_kerja, LocalDate.now()).plusYears(2);

        return p.getYears() + " Tahun " +p.getMonths()+ " Bulan " +p.getDays()+ " Hari";
    }
}
