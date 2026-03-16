/* Nama file   : DosenTamu.java
   Deskripsi   : tipe class Dosen Tamu
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 16-Maret-2026 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /************** Atribut ****************/
    private String nidk;
    private LocalDate tglAkhirKontrak;
    private static final int BUP = 65;
 
    /************** Method *****************/
    DosenTamu()
    {

    }

    DosenTamu(String ni, String nid, String na, LocalDate tglla, LocalDate tmt, double gapo, String fak, LocalDate tglAK)
    {
        super(ni, na, tglla, tmt, gapo, fak);
        this.nidk = nid;
        this.tglAkhirKontrak = tglAK;
    }

    @Override
    public String getID()
    {
        return nidk;
    }

    @Override
    public String getJabatan()
    {
        return "Dosen Tamu";
    }

    @Override
    public int getBUP()
    {
        return BUP;
    }

    @Override
    public LocalDate getTglPensiun()
    {
        LocalDate BUPDate = tgllahir.plusYears(BUP);
        return BUPDate.withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public double getTunjangan()
    {
        return 0.025 * gajipok;
    }

    @Override 
    public void printInfo()
    {
        System.out.println("NIP                     : " +nip);
        System.out.println("NIDK                    : " +nidk);
        System.out.println("Nama                    : " +nama);
        System.out.println("Tanggal Lahir           : " +tgllahir.format(FMT));
        System.out.println("TMT                     : " +tmt.format(FMT));
        System.out.println("Jabatan                 : " +getJabatan());
        System.out.println("Fakultas                : " +fakultas);
        System.out.println("Tanggal Akhir Kontrak   : " +tglAkhirKontrak.format(FMT));
        System.out.println("Masa Kerja              : " +getMasaKerjaFormatted());
        System.out.println("Tanggal Pensiun         : " +getTglPensiun().format(FMT));
        System.out.println("Gaji Pokok              : " +RpFormatted(gajipok));
        System.out.printf("Tunjangan               : 2.5%% x %s = %s%n", RpFormatted(gajipok), RpFormatted(getTunjangan()));
    }
}
