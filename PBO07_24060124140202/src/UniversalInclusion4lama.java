/* Nama file   : UniversalInclusion4.java
   Deskripsi   : Mencoba Polimorfisme Universal Inclusion lanjut
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 22-April-2026 
   Lab         : D1 */

class Civitasakademika {
    // atribut
    protected String nama;

    // method
    Civitasakademika(String nnew)
    {
        nama = nnew;
    }

    public String getNama()
    {
        return nama;
    }

    public String getNomor()
    {
        return "";
    }
}

class Dosen extends Civitasakademika {
    // atribut
    protected String nip;

    // method
    Dosen(String nipnew, String nnew)
    {
        super(nnew);
        nip = nipnew;
    }

    @Override
    public String getNomor()
    {
        return nip;
    }
}

class Mahasiswa extends Civitasakademika {
    // atribut
    protected String nim;
    protected Dosen doswal;

    // method
    Mahasiswa(String nimnew, String nnew, Dosen dosnew)
    {
        super(nnew);
        nim = nimnew;
        doswal = dosnew;
    }

    @Override
    public String getNomor()
    {
        return nim;
    }

    // i. setDosenWali
    public void setWali(Dosen dosnew)
    {
        this.doswal = dosnew;
    }

    // j. print Detail Mahasiswa
    public void printInfo() 
    {
        System.out.println("NIM        : " +nim);
        System.out.println("Nama       : " +nama);
        System.out.println("Dosen Wali : " +(doswal != null ? doswal.getNama() : "Belum Ada"));
    }
}

class Seminar {
    // atribut
    // b. array statis dan banyaknya peserta seminar
    private Civitasakademika[] peserta = new Civitasakademika[100];
    private int banyakpeserta;

    // method
    Seminar() 
    {
        banyakpeserta = 0;
    }

    // c. count peserta
    public int countPeserta()
    {
        return banyakpeserta;
    }

    // d. registrasi
    public void registrasi(Civitasakademika in)
    {
        if (banyakpeserta < 100)
        {
            peserta[banyakpeserta] = in;
            banyakpeserta++;
        }
        else
        {
            System.out.println("Sudah penuh!");
        }
    }

    // g. menampilkan peserta
    public void lihatPeserta()
    {
        System.out.println("=== Daftar Peserta ===");
        for(int i=0; i < banyakpeserta; i++)
        {
            System.out.println((i+1)+ ". [ " +peserta[i].getNomor()+ " ] " +peserta[i].getNama());
        }
        System.out.println("Total : " +banyakpeserta+ " Peserta");
    }

    // h. count Mahasiswa ddengan instances of
    public int countMahasiswa()
    {
        int count = 0;
        for(int i=0; i < banyakpeserta; i++)
        {
            if(peserta[i] instanceof Mahasiswa)
            {
                count++;
            }
        }

        return count;
    }
}

public class UniversalInclusion4lama {
    public static void main(String[] args)
    {
        // e. 2 dosen dan 5 mahasiswa
        Dosen d1 = new Dosen("50001", "Budi Awan");
        Dosen d2 = new Dosen("50002", "Dani Yanto");

        Mahasiswa m1 = new Mahasiswa("24001", "Wolfie", d1);
        Mahasiswa m2 = new Mahasiswa("24002", "Maesh", d2);
        Mahasiswa m3 = new Mahasiswa("24003", "Vinn", d1);
        Mahasiswa m4 = new Mahasiswa("24004", "SAM", d2);
        Mahasiswa m5 = new Mahasiswa("24005", "AHA", d1);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
        m5.printInfo();

        // f. semua orang di registrasi ke seminar
        Seminar s = new Seminar();
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // c. aplikasi count peserta
        System.out.println("Banyaknya Peserta : " +s.countPeserta()+ "\n");

        // g. aplikasi tampil peseta
        s.lihatPeserta();

        // h. aplikasi countmahasiswa
        System.out.println("Banyak Mahasiswa : " +s.countMahasiswa()+ "\n");

        // i. aplikasi setWali
        m1.setWali((Dosen) d2); //ditukar semua
        m2.setWali((Dosen) d1);
        m3.setWali((Dosen) d2);
        m4.setWali((Dosen) d1);
        m5.setWali((Dosen) d2);

        // j. aplikasi tampil data mahasiswa
        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
        m5.printInfo();
    }
}