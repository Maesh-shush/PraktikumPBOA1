package jdbc.program;

/**
 * File : Program.java
 * Deskripsi : program utama
 */
import java.util.*;

import jdbc.service.*;
import jdbc.model.*;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    static void displayAll(){
        System.out.println("===displayAll");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list){
            System.out.println(m);
        }
    }
    
    public static void main(String[] args){
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5,"Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " +mhsAdd);
        displayAll();
        
        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " +mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " +mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // delete
        System.out.println("===delete");
        System.out.println("akan didelete: " +service.getById(5));
        service.delete(5);
        displayAll();
    }
}
