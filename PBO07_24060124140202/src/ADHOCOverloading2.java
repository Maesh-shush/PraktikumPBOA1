/* Nama file   : ADHOCOverloading2.java
   Deskripsi   : Mencoba Polimorfisme AD HOC Overloading
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 21-April-2026 
   Lab         : D1 */

// a. realisasi kelas Mahasiswa
class Mahasiswa {
    // atribut
    protected int nim;
    protected String nama;
    protected String prodi;

    // method/operator
    // c. Konstruktor mahasiswa tanpa parameter
    Mahasiswa()
    {
        nim = -999;
        nama = "n/a";
        prodi = "n/a";
    }

    // d. konstruktor mahasiswa dengan 3 parameter
    Mahasiswa(int nimnew, String nnew, String pnew)
    {
        nim = nimnew;
        nama = nnew;
        prodi = pnew;
    }

    // e. konstruktor dengan 1 parameter mahasiswa lain (kloning)
    Mahasiswa(Mahasiswa Mhs)
    {
        nim = Mhs.getNIM();
        nama = Mhs.getNama();
        prodi = Mhs.getProdi();
    }

    // b. realisasi method/operator kelas mahasiswa
    public int getNIM()
    {
        return nim;
    }

    public void setNIM(int nimnew)
    {
        this.nim = nimnew;
    }

    public String getNama()
    {
        return nama;
    } 

    public void setNama(String nnew)
    {
        this.nama = nnew;
    }

    public String getProdi()
    {
        return prodi;
    }

    // 2a. method setProgramStudi tanpa parameter
    public void setProdi()
    {
        this.prodi = "Kosong";
    }

    // 2b. method setProgramStudi dengan 1 parameter input string
    public void setProdi(String pnew)
    {
        this.prodi = pnew;
    }

    // 2c. method setProgramStudi dengan 1 parameter input mahasiswa lain (kloning)
    public void setProdi(Mahasiswa M)
    {
        this.prodi = M.getProdi();
    }


    // method tambahan untuk menampilkan info
    public void printMahasiswa()
    {
        System.out.println("NIM           : " +getNIM());
        System.out.println("Nama          : " +getNama());
        System.out.println("Program Studi : " +getProdi());
    }
}

public class ADHOCOverloading2 {
    public static void main(String[] args) {
        // realisasi c
        Mahasiswa M1 = new Mahasiswa();
        System.out.println("== Mahasiswa 1 (tanpa parameter) ==");
        M1.printMahasiswa();
        System.out.println("\n");

        // realisasi d
        Mahasiswa M2 = new Mahasiswa(24001, "Wolfie", "Informatika");
        System.out.println("== Mahasiswa 2 (dengan parameter) ==");
        M2.printMahasiswa();
        System.out.println("\n");

        // realisasi e
        Mahasiswa M3 = new Mahasiswa(M2);
        System.out.println("== Mahasiswa 3 (kloning mahasiswa 2) ==");
        M3.printMahasiswa();
        System.out.println("\n");

        // realisasi 2a
        System.out.println("== setPrordi tanpa parameter ==");
        M1.setNIM(24002);
        M1.setNama("Maesh");
        M1.setProdi();
        M1.printMahasiswa();
        System.out.println("\n");

        // realisasi 2b
        System.out.println("== setPrordi dengan parameter ==");
        M1.setProdi("Ilmu Komunikasi");
        M1.printMahasiswa();
        System.out.println("\n");

        // realisasi 2c
        System.out.println("== setPrordi parameter objek lain (kloning) ==");
        M1.setProdi(M2);
        M1.printMahasiswa();
        System.out.println("\n");
    }
}
