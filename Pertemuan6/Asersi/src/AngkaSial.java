/* Nama file   : AngkaSial.java
   Deskripsi   : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 21-April-2026 
   Lab         : D1 */

public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException
    {
        if (angka == 13)
        {
            throw new AngkaSialException();
        }
        System.out.println(angka+ " bukan angka sial");
    }

    public static void main(String[] args)
    {
        AngkaSial as = new AngkaSial();
        try
        {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase)
        {
            //method getMessage () telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka! ! !");
        }
    }
}
