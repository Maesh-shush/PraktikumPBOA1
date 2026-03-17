/*Nama File  : MGaris.java 
 * Deskripsi : class main untuk menguji setiap fungsi dalam class Garis
 * Pembuat   : Ikrar Maheswara Rabbani Wibowo
 * Tanggal   : 02-03-2026 */

public class MGaris {
    public static void main(String[] args) {

        System.out.println("===== UJI CLASS GARIS =====\n");

        // ----- Konstruktor Default -----
        System.out.println("-- Konstruktor Default --");
        Garis g1 = new Garis();
        g1.printGaris();

        // ----- Konstruktor Berparameter -----
        System.out.println("-- Konstruktor Berparameter (0,0) -> (4,3) --");
        Garis g2 = new Garis(0, 0, 4, 3);
        g2.printGaris();

        // ----- counterGaris -----
        System.out.println("-- getCounterGaris() --");
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris() + "\n");

        // ----- getter Titik Awal & Akhir -----
        System.out.println("-- getAwal() dan getAkhir() --");
        Titik awal = g2.getAwal();
        Titik akhir = g2.getAkhir();
        System.out.println("Titik Awal  : (" + awal.absis + ", " + awal.ordinat + ")");
        System.out.println("Titik Akhir : (" + akhir.absis + ", " + akhir.ordinat + ")\n");

        // ----- panjangGaris -----
        System.out.println("-- panjangGaris() --");
        System.out.println("Panjang g2  : " + g2.panjangGaris() + "\n");

        // ----- panjangGradien -----
        System.out.println("-- panjangGradien() --");
        System.out.println("Gradien g2  : " + g2.panjangGradien() + "\n");

        // ----- getTitikTengah -----
        System.out.println("-- getTitikTengah() --");
        Titik tengah = g2.getTitikTengah();
        System.out.println("Titik Tengah g2 : (" + tengah.absis + ", " + tengah.ordinat + ")\n");

        // ----- isSejajar -----
        System.out.println("-- isSejajar() --");
        Garis g3 = new Garis(1, 1, 5, 4);
        System.out.println("g2 sejajar dengan g3? " + g2.isSejajar(g3) + "\n");

        // ----- isTegakLurus -----
        System.out.println("-- isTegakLurus() --");
        Garis g4 = new Garis(0, 0, 3, -4);
        System.out.println("g2 tegak lurus dengan g4? " + g2.isTegakLurus(g4) + "\n");

        // ----- printPersamaan -----
        System.out.println("-- printPersamaan() --");
        System.out.print("Persamaan g2 : ");
        g2.printPersamaan();

        // ----- Garis vertikal (x = c) -----
        System.out.println("-- printPersamaan() garis vertikal --");
        Garis gv = new Garis(3, 0, 3, 5);
        System.out.print("Persamaan gv : ");
        gv.printPersamaan();
    }
}