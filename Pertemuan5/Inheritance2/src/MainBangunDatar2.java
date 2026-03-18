/* Nama file   : MainBangunDatar2.java
   Deskripsi   : file main BangunDatar2
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 17-Maret-2026 */

public class MainBangunDatar2  {
    public static void main(String[] args) {
        //BangunDatar B1 = new BangunDatar();  /*cannot instantate the type BangunDatar*/
        BangunDatar P1 = new Persegi(5, "biru", "hitam");  
        Persegi P2 = new Persegi(5, "biru", "hitam");
        BangunDatar L1 = new Lingkaran(7, "biru", "hitam");
        Lingkaran L2 = new Lingkaran(14, "biru", "hitam");

        System.out.println(P1.isEqualLuas(P2));
        System.out.println(L1.isEqualLuas(L2));
        P2.zoomIn();
        System.out.println(P1.isEqualLuas(P2));
    }
}
