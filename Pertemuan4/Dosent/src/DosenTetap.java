/* Nama file   : DosenTetap.java
   Deskripsi   : tipe class Dosen Tetap
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 16-Maret-2026 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /************** Atribut ****************/
    private String nidn;
    private static final int BUP = 65;
 
    /************** Method *****************/
    DosenTetap()
    {

    }

    DosenTetap(String ni, String nid, String na, LocalDate tglla, LocalDate tmt, double gapok, String fak)
    {
        super(ni, na, tglla, tmt, gapok, fak);
        this.nidn = nid;
    }

    @Override
    public String getID()
    {
        return nidn;
    }

    @Override
    public String getJabatan()
    {
        return "Dosen Tetap";
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
        return 0.02 * getMasaKerjaTahun() * gajipok;
    }

    @Override 
    public void printInfo()
    {
        System.out.println("NIP                 : " +nip);
        System.out.println("NIDN                : " +nidn);
        System.out.println("Nama                : " +nama);
        System.out.println("Tanggal Lahir       : " +tgllahir.format(FMT));
        System.out.println("TMT                 : " +tmt.format(FMT));
        System.out.println("Jabatan             : " +getJabatan());
        System.out.println("Fakultas            : " +fakultas);
        System.out.println("Masa Kerja          : " +getMasaKerjaFormatted());
        System.out.println("Tanggal Pensiun     : " +getTglPensiun().format(FMT));
        System.out.println("Gaji Pokok          : " +RpFormatted(gajipok));
        System.out.printf("Tunjangan           : 2%% x %d x %s = %s%n", getMasaKerjaTahun(), RpFormatted(gajipok), RpFormatted(getTunjangan()));
    }
}

