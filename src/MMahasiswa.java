/* Nama file   : MMahasiswa.java
   Deskripsi   : file main tipe mahasiswa   
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 03-Maret-2026 */

public class MMahasiswa {
    public static void main(String[] args) {
    MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
    MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
    Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
    Dosen D1 = new Dosen("123", "Andi", "informatika");
    Kendaraan K1 = new Kendaraan("H1234AB", "motor");
    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.addMatKul(PBO);
    M1.addMatKul(MBD);
    M1.printDetailMhs();
    System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
    System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSks());
    }
}