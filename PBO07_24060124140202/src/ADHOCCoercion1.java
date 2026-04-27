/* Nama file   : ADHOCCoercion1.java
   Deskripsi   : Mencoba Polimorfisme AD HOC Coercion
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 21-April-2026 
   Lab         : D1 */

public class ADHOCCoercion1 {
    public static void main(String[] args) {

        // a. Polimorfisme
        int bulat = 65;
        char huruf = (char) bulat;
        double desimal = (double) bulat;
        System.out.println("=== A. POLIMORFISME ===");
        System.out.println("Jadi Integer  : " +bulat);
        System.out.println("Jadi Karakter : " +huruf);
        System.out.println("Jadi Real     : " +desimal);

        // b. integer -> real -> integer
        double real1 = (double) 65;
        int integer1 = (int) real1;
        System.out.println("=== B. INT -> REAL -> INT ===");
        System.out.println("Jadi Real    : " +real1);
        System.out.println("Ubah kembali : " +integer1);

        // c. string x dan y, konkat ke s dan penjumlahan integer ke z
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("=== C. Konkat dan Penjumlahan String ke Integer ===");
        System.out.println("Konkat : " +S);
        System.out.println("Jumlah : " +Z);

        // d. string p dan q, konkat ke r dan penjumlahan real ke d
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("=== D. Konkat dan Penjumlahan String ke Real ===");
        System.out.println("Konkat : " +R);
        System.out.println("Jumlah : " +D);

        // e. objek a yang dimasukin s
        int A = Integer.parseInt(S);
        System.out.println("=== E. Objek A dengan Isi Konversi S ===");
        System.out.println("Isi A : " +A);

        // f. objek t yang dimasukin a
        String T = S.toString();
        System.out.println("=== F. Objek T dengan Isi Konversi A ===");
        System.out.println("Isi T : " +T);
    }
}
