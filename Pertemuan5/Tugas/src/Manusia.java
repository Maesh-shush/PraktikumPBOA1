/* Nama file   : Manusia.java
   Deskripsi   : tipe class abstract Manusia
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 24-Maret-2026 */

import java.time.LocalDate;

public abstract class Manusia {
    /************** Atribut ****************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /************** Method *****************/
    /* Konstruktor */
    Manusia()
    {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    Manusia(String n, LocalDate d, String a, double p)
    {
        this.nama = n;
        this.tgl_mulai_kerja = d;
        this.alamat = a;
        this.pendapatan = p;
        counterMns++;
    }

    /* Selector & Mutator */
    public String getNama()
    {
        return nama;
    }

    public void setNama(String n)
    {
        this.nama = n;
    }

    public LocalDate getTglMK()
    {
        return tgl_mulai_kerja;
    }

    public void setTglMK(LocalDate d)
    {
        this.tgl_mulai_kerja = d;
    }

    public String getAlamat()
    {
        return alamat;
    }

    public void setAlamat(String a)
    {
        this.alamat = a;
    }

    public double getPendapatan()
    {
        return pendapatan;
    }

    public void setPendapatan(double p)
    {
        this.pendapatan = p;
    }

    public void cetakInfo()
    {
        System.out.println("Nama: " +getNama());
        System.out.println("Tanggal Mulai Kerja: " +getTglMK());
        System.out.println("Alamat: " +getAlamat());
        System.out.println("Pendapatan: " +String.format("%.0f", getPendapatan()));
    }

    public static int getCounterMns()
    {
        return counterMns;
    }
}
