/* Nama file   : Main.java
   Deskripsi   : Program utama untuk menguji class Pegawai dan turunannya
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 16-Maret-2026 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
            "9545647548", "78647324", "Andi",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5000000, "Fakultas Sains dan Matematika"
        );

        DosenTamu dtamu = new DosenTamu(
            "8812340001", "45678901", "Budi Santoso",
            LocalDate.of(1985, 3, 20),
            LocalDate.of(2022, 8, 1),
            6000000, "Fakultas Teknik",
            LocalDate.of(2026, 7, 31)
        );

        Tendik tendik = new Tendik(
            "7723450002", "Citra Dewi",
            LocalDate.of(1980, 11, 10),
            LocalDate.of(2010, 3, 1),
            4500000, "Akademik"
        );

        System.out.println("===== Dosen Tetap =====");
        dt.printInfo();

        System.out.println("\n===== Dosen Tamu =====");
        dtamu.printInfo();

        System.out.println("\n===== Tenaga Kependidikan =====");
        tendik.printInfo();

        System.out.println("\nTotal pegawai : " + dt.getCounterPegawai());
    }
}