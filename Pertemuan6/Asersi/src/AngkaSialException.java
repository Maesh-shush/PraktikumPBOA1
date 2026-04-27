/* Nama file   : AngkaSialException.java
   Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 21-April-2026 
   Lab         : D1 */

 public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
 }