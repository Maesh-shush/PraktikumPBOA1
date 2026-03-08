/* Nama file   : MataKuliah.java
   Deskripsi   : tipe class MataKuliah
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 03-Maret-2026 */

public class MataKuliah {
    /************** Atribut ****************/
    private String idMatKul;
    private String nama;
    private int sks;

    /************** Method *****************/
    MataKuliah()
    {
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    MataKuliah(String id, String nama, int sks)
    {
        this.idMatKul = id;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul()
    {
        return this.idMatKul;
    }

    public String getNama()
    {
        return this.nama;
    }

    public int getSks()
    {
        return this.sks;
    }

    public void setIdMatKul(String idMatKul)
    {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setSks(int sks)
    {
        this.sks = sks;
    }
} //end class MataKuliah