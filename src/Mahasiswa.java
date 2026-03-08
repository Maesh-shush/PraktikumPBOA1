/* Nama file   : Mahasiswa.java
   Deskripsi   : tipe class mahasiswa
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 03-Maret-2026 */

import java.util.ArrayList;

public class Mahasiswa {
    /************** Atribut ****************/
    private String nim;
    private String nama;
    private String prodi;

    static ArrayList<MataKuliah> listMatkul = new ArrayList<>();;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    /************** Method *****************/
    Mahasiswa()
    {
        nim = "";
        nama = "";
        prodi = "";
    }

    Mahasiswa(String nim, String nama, String prodi)
    {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali()
    {
        return this.dosenwali;
    }

    public Kendaraan getKendaraan()
    {
        return this.kendaraan;
    }

    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenwali)
    {
        this.dosenwali = dosenwali;
    }
    public void setKendaraan(Kendaraan kendaraan)
    {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah a)
    {
        if(listMatkul.size() < 50)
        {
            listMatkul.add(a);
        } else 
        {
            System.out.println("sudah penuh");
        }
    }

    public int getJumlahSks()
    {
        int total = 0;
        for(int i=0; i < listMatkul.size(); i++)
        {
            total += listMatkul.get(i).getSks();
        }

        return total;
    }

    public int getJumlahMatKul()
    {
        return listMatkul.size();
    }

    public void printMhs()
    {
        System.out.println("NIM: " +getNim()+ "\n" +
                           "Nama: " +getNama()+ "\n" +
                           "Program Studi: " +getProdi()+ "\n"
        );
    }

    public void printDetailMhs()
    {
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        for(int i=0; i < listMatkul.size(); i++)
        {
            System.out.println("-" +listMatkul.get(i).getNama()+ "\n");
        }

        System.out.println("Detail Dosen Wali: \n" + 
                           "NIP: " +dosenwali.getNIP()+ "\n" +
                           "Nama: " +dosenwali.getNama()+ "\n" +
                           "Program Studi: " +dosenwali.getProdi()+ "\n"
        );

        System.out.println("Detail Kendaraan: \n" + 
                           "Nomor Polisi: " +kendaraan.getNoPlat()+ "\n" +
                           "Jenis Kendaraan: " +kendaraan.getJenis()+ "\n"
        );
    }
} //end class Mahasiswa
