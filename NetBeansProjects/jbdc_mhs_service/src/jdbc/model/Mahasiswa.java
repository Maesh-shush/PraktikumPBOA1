package jdbc.model;

/**
 * File : Mahasiswa.java
 * Deskripsi : Kelas ini merupakan persistent 
 */
public class Mahasiswa {
    // atribut
    private int id;
    private String nama;
    
    // Constructor
    public Mahasiswa(){
        id = 0;
        nama = "";
    }
    
    public Mahasiswa(int inid, String innama){
        id = inid;
        nama = innama;
    }
    
    // getter and setter
    public int getId(){
        return id;
    }
    
    public void setId(int inid){
        this.id = inid;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String innama){
        this.nama = innama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}
