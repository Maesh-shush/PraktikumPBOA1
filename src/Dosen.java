/* Nama file   : Dosen.java
   Deskripsi   : tipe class Dosen
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 03-Maret-2026 */

public class Dosen {
    /************** Atribut ****************/
    private String nip;
    private String nama;
    private String prodi;

    /*************** Method ****************/
    Dosen()
    {
        nip = "";
        nama = "";
        prodi = "";
    }
    
    Dosen(String a, String n, String p)
    {
        this.nip = a;
        this.nama = n;
        this.prodi = p;
    }

    public String getNIP()
    {
        return this.nip;
    }

    public String getNama()
    {
        return this.nama;
    }

    public String getProdi()
    {
        return this.prodi;
    }

    public void setNIP(String a)
    {
        this.nip = a;
    }

    public void setNama(String n)
    {
        this.nama = n;
    }

    public void setProdi(String p)
    {
        this.prodi = p;
    }
} //endclass Dosen