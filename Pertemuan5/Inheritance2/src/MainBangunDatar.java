/* Nama file   : MainBangunDatar.java
   Deskripsi   : file main BangunDatar
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 17-Maret-2026 */

public class MainBangunDatar {
    public static void main(String[] args) {

        // ===== Objek Persegi =====
        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Persegi p2 = new Persegi(8, "Biru", "Putih");

        System.out.println("===== Persegi 1 =====");
        p1.printInfo();
        System.out.println("Luas      : " +p1.getLuas());
        System.out.println("Keliling  : " +p1.getKeliling());
        System.out.println("Diagonal  : " +p1.getDiagonal());

        System.out.println();

        System.out.println("===== Persegi 2 =====");
        p2.printInfo();
        System.out.println("Luas      : " +p2.getLuas());
        System.out.println("Keliling  : " +p2.getKeliling());
        System.out.println("Diagonal  : " +p2.getDiagonal());

        System.out.println();

        // ===== Objek Lingkaran =====
        Lingkaran l1 = new Lingkaran(14, "Kuning", "Hijau");

        System.out.println("===== Lingkaran 1 =====");
        l1.printInfo();
        System.out.println("Jari-jari : " +l1.getJari());
        System.out.println("Luas      : " +l1.getLuas());
        System.out.println("Keliling  : " +l1.getKeliling());

        System.out.println();

        // ===== Counter =====
        BangunDatar.printCounterBangunDatar();
    }
}