/* Nama file   : BKoleksiKelasBentukan.java
   Deskripsi   : Mencoba koleksi
   NIM / Nama  : 24060124140202 / Ikrar Maheswara Rabbani Wibowo
   Tanggal     : 5-Mei-2026 
   Lab         : D1 */

import java.util.LinkedList;
import java.util.Queue;

class AAnabul {
    // atribut
    private String panggilan;

    // method
    AAnabul(String nnew)
    {
        panggilan = nnew;
    }

    public void setNama(String nama)
    {
        this.panggilan = nama;
    }

    public String getNama()
    {
        return panggilan;
    }

    public String Gerak()
    {
        return "Bergerak";
    }

    public String Bersuara()
    {
        return "Burbunyi";
    }
}

class Kucing extends AAnabul {
    // atribut
    private double bobot;

    // method
    Kucing(String nnew, double bnew)
    {
        super(nnew);
        bobot = bnew;
    }

    public void setBobot(double bnew)
    {
        this.bobot = bnew;
    }

    public double getBobot()
    {
        return bobot;
    }

    @Override
    public String Gerak()
    {
        return "melata";
    }

    @Override
    public String Bersuara()
    {
        return "meong";
    }
}

class Anjing extends AAnabul {
    // atribut

    // method
    Anjing(String nnew)
    {
        super(nnew);
    }   
    
    @Override
    public String Gerak()
    {
        return "melata";
    }

    @Override
    public String Bersuara()
    {
        return "guk-guk";
    }
}

class Burung extends AAnabul {
    // atribut

    // method
    Burung(String nnew)
    {
        super(nnew);
    }

    @Override
    public String Gerak()
    {
        return "terbang";
    }

    @Override
    public String Bersuara()
    {
        return "cuit";
    }
}

class Anggora extends Kucing {
    // atribut

    // method
    Anggora(String nnew, double bnew)
    {
        super(nnew, bnew);
    }
}

class KembangTelon extends Kucing {
    // atribut

    // method
    KembangTelon(String nnew, double bnew)
    {
        super(nnew, bnew);
    }
}

class Piaraan {
    // atribut
    private int nbelm = 0;
    private Queue<AAnabul> Lanabul ;

    // method
    Piaraan()
    {
        Lanabul = new LinkedList<>();
        nbelm++;
    }

    public int getNbelm()
    {
        return nbelm;
    }

    public void enqueueAnabul(AAnabul in)
    {
        Lanabul.add(in);
        nbelm++;
    }

    public boolean isMember(AAnabul in)
    {
        return Lanabul.contains(in);
    }

    public AAnabul getAnabul()
    {
        return Lanabul.element();
    }

    public AAnabul dequeueAnabul()
    {
        nbelm--;
        return Lanabul.poll();
    }

    public void showAnabul()
    {
        for(AAnabul bul : Lanabul)
        {
            System.out.println(bul.getNama());
        }
    }

    public int countKucing()
    {
        int coun = 0;
        for (AAnabul acc : Lanabul)
        {
            if(acc instanceof Kucing)
            {
                coun++;
            }
        }
        return coun;
    }

    public double bobotKucing()
    {
        double botal = 0;
        for (AAnabul ins : Lanabul)
        {
            if(ins instanceof Kucing)
            {
                botal += ((Kucing) ins).getBobot();
            }
        }
        return botal;
    }

    public void showJenisAnabul()
    {
        int k = 1;
        for (AAnabul ins : Lanabul)
        {
            System.out.println(k+ ". " +ins.getClass()+ " | " +ins.getNama());
            k++;
        }
    }
}

public class BKoleksiKelasBentukan {
    public static void main(String[] args) {
        Piaraan Q = new Piaraan();

        AAnabul k1 = new Kucing("Wolfie", 3.5);
        AAnabul k2 = new Kucing("Maesh", 3.7);
        AAnabul ang1 = new Anggora("Kafe", 3.8);
        AAnabul ket1 = new Anggora("Jourd", 3.6);
        AAnabul a1 = new Anjing("Rezzel");
        AAnabul b1 = new Burung("Hay");

        Q.enqueueAnabul(b1); Q.enqueueAnabul(a1); Q.enqueueAnabul(ang1);
        Q.enqueueAnabul(ket1); Q.enqueueAnabul(k2); Q.enqueueAnabul(k1);

        Q.showAnabul();
        System.out.println("Elemen Kucing ada : " +Q.countKucing());
        System.out.printf("Total bobot elemen Kucing : %.2f%n", Q.bobotKucing());
        Q.showJenisAnabul();

        System.out.printf("\n");

        // hapus elem 1 (Hay)
        Q.dequeueAnabul();
        Q.showAnabul();
        System.out.println("Elemen Kucing ada : " +Q.countKucing());
        System.out.printf("Total bobot elemen Kucing : %.2f%n", Q.bobotKucing());
        Q.showJenisAnabul();

        System.out.printf("\n");

        // hapus 2 elemen (Rezzel, Kafe)
        Q.dequeueAnabul();
        Q.dequeueAnabul();
        Q.showAnabul();
        System.out.println("Elemen Kucing ada : " +Q.countKucing());
        System.out.printf("Total bobot elemen Kucing : %.2f%n", Q.bobotKucing());
        Q.showJenisAnabul();

        System.out.printf("\n");
    }
}
