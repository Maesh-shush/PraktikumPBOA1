/*Nama File  : Mtitik.java 
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : Ikrar Maheswara Rabbani Wibowo
 * Tanggal   : 24-02-2026 */

public class Mtitik
{
    public static void main(String[] args)
    {
        Titik T1 = new Titik(); //membuat objek titik T1(0,0)
        T1.setAbsis(3); //mengubah nilai absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah nilai ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = new Titik(3,5); //membuat objek titik T2(3,5)
        System.out.println("Jumlah objek titik = " +Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " +T2.getCounterTitik());  
    }
}