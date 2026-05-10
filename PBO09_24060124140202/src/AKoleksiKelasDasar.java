/* Nama file   : AKoleksiKelasDasar.java
   Deskripsi   : Mencoba koleksi
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 5-Mei-2026 
   Lab         : D1 */

import java.util.*;

class Teman 
{
    // atribut
    private int nbelm;
    private List<String> Lnama;

    // method
    Teman()
    {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    public int getNbelm()
    {
        return nbelm;
    }

    public String getNama(int idx)
    {
        if(idx < nbelm)
        {
            return this.Lnama.get(idx);
        }
        else 
        {
            return "no";
        }
    }

    public void setNama(int idx, String nnew)
    {
        if(idx < nbelm)
        {
            this.Lnama.set(idx, nnew);
        }
        
    }

    public void addNama(String nnew)
    {
        this.Lnama.add(nnew);
        this.nbelm++;
    }

    public void delNama(String ndel)
    {
        int i = 0;
        while(i < nbelm && !Lnama.get(i).equals(ndel))
        {
            i++;
        }

        if(i < nbelm)
        {
            this.Lnama.remove(i);
            nbelm--;
        }
    }

    public boolean isMember(String ncheck)
    {
        int i = 0;
        while(i < nbelm && !Lnama.get(i).equals(ncheck))
        {
            i++;
        }

        if(i < nbelm)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void gantiNama(String ncheck, String nnew)
    {
        int i = 0;
        while(i < nbelm && !Lnama.get(i).equals(nnew))
        {
            i++;
        }

        if(i < nbelm)
        {
            this.Lnama.set(i, nnew);
        }
    }

    public int countNama(String ncheck)
    {
        int cnt = 0, i = 0;
        while(i < nbelm)
        {
            if(this.Lnama.get(i).equals(ncheck))
            {
                cnt++;
            }
            i++;
        }
        return cnt;
    }

    public void showTeman()
    {
        System.out.printf("[ ");
        for(int i=0; i < nbelm; i++)
        {
            System.out.printf(getNama(i)+ " ");
        }
        System.out.printf("]\n");
    }
}

public class AKoleksiKelasDasar {
    public static void main(String[] args) throws Exception {
        Teman t = new Teman();

        t.addNama("Faiq");
        t.addNama("Jordan");
        t.addNama("Wolfie");
        t.addNama("Maesh");
        t.addNama("Fulan");
        t.showTeman();

        t.delNama("Fulan");
        t.showTeman();

        System.out.println("Apakah Faiq anggota? " +t.isMember("Faiq"));
        System.out.println("Apakah Fulan anggota? " +t.isMember("Fulan"));

        System.out.println("Faiq ada berapa? " +t.countNama("Faiq"));

        t.gantiNama("Jordan", "Haydar");
        t.showTeman();
    }
}
