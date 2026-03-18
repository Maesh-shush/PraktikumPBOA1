/* Nama file   : IResize.java
   Deskripsi   : file inteface IResize
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 17-Maret-2026 */

public interface IResize {
    //menambah ukuran menjadi 10%
    public void zoomIn();

    //mengurangi ukuran menjadi 10%
    public void zoomOut();

    //menskala ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
