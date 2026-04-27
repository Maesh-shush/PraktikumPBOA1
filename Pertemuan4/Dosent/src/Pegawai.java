/* Nama file   : Pegawai.java
   Deskripsi   : tipe class Pegawai
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 16-Maret-2026 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Pegawai {
    /************** Atribut ****************/
    protected String nip;
    protected String nama;
    protected LocalDate tgllahir;
    protected LocalDate tmt;
    protected double gajipok;
    private static int counterPegawai;
    protected static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("d MMMM yyyy", new java.util.Locale("id", "ID"));

    /************** Method *****************/
    Pegawai()
    {
        counterPegawai++;
    }

    Pegawai(String ni, String na, LocalDate tglla, LocalDate tm, double ga)
    {
        this.nip = ni;
        this.nama = na;
        this.tgllahir = tglla;
        this.tmt = tm;
        this.gajipok = ga;
        counterPegawai++;
    }

    public String getNIP()
    {
        return nip;
    }

    public void setNIP(String n)
    {
        this.nip = n;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String n)
    {
        this.nama = n;
    }

    public int getMasaKerjaTahun()
    {
        return Period.between(tmt, LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan()
    {
        return Period.between(tmt, LocalDate.now()).getMonths();
    }

    public String getMasaKerjaFormatted()
    {
        return getMasaKerjaTahun() +" Tahun "+ getMasaKerjaBulan() +" Bulan ";
    }

    public int getCounterPegawai()
    {
        return counterPegawai;
    }

    public abstract LocalDate getTglPensiun();
    public abstract double getTunjangan();
    public abstract void printInfo();

    public String RpFormatted(double nilai)
    {
        return String.format("Rp: %s,00", String.format("%,.0f", nilai).replace(',','.'));
    }
}
