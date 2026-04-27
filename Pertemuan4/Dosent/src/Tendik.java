/* Nama file   : Tendik.java
   Deskripsi   : tipe class Tenaga Kependidikan
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 16-Maret-2026 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /************** Atribut ****************/
    private String bidang;
    private static final int BUP = 55;

    /************** Method *****************/
    public Tendik()
    {

    }

    public Tendik(String ni, String na, LocalDate tglla, LocalDate tmt, double gapok, String bid)
    {
        super(ni, na, tglla, tmt, gapok);
        this.bidang = bid;
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
        return 0.01 * getMasaKerjaTahun() * gajipok;
    }

    @Override 
    public void printInfo()
    {
        System.out.println("NIP                     : " +nip);
        System.out.println("Nama                    : " +nama);
        System.out.println("Tanggal Lahir           : " +tgllahir.format(FMT));
        System.out.println("TMT                     : " +tmt.format(FMT));
        System.out.println("Jabatan                 : Tenaga Kependidikan");
        System.out.println("Bidang                  : " +bidang);
        System.out.println("Masa Kerja              : " +getMasaKerjaFormatted());
        System.out.println("Tanggal Pensiun         : " +getTglPensiun().format(FMT));
        System.out.println("Gaji Pokok              : " +RpFormatted(gajipok));
        System.out.printf("Tunjangan               : 1%% x %d x %s = %s%n", getMasaKerjaTahun(), RpFormatted(gajipok), RpFormatted(getTunjangan()));
    }
}
