/*Nama File  : Titik.java 
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : Ikrar Maheswara Rabbani Wibowo
 * Tanggal   : 24-02-2026 */

public class Titik {
    /*************ATRIBUT**************/
    private double absis;
    private double ordinat;
    private static int countertitik = 0;

    /*************METHOD***************/
    //konstruktor untuk membuat titik dengan input nilai absis dan ordinat
    public Titik(double absis, double ordinat)
    {
        this.absis = absis;
        this.ordinat = ordinat;
        countertitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    public Titik()
    {
        this(0,0);
    }

    //mengembalikan nilai countertitik
    public static int getCounterTitik()
    {
        return countertitik;
    }

    //mengembalikan nilai absis
    public double getAbsis()
    {
        return absis;
    }
    
    //mengembalikan nilai ordinat
    public double getOrdinat()
    {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x)
    {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y)
    {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y)
    {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan nilai kuadran dari absis dan ordinat input
    public int getKuadran()
    {
        if(absis > 0.0 && ordinat > 0.0)
        {
            return 1;
        } else if(absis < 0.0 && ordinat > 0.0)
        {
            return 2;
        } else if(absis > 0.0 && ordinat < 0.0)
        {
            return 3;
        } else if(absis < 0.0 && ordinat < 0.0)
        {
            return 4;
        } else 
        {
            return 0;
        }
    }

    //mengembalikan jarak dari titik absis dan ordinat ke titik pusat (0,0)
    public double getJarakPusat()
    {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //mengembalikan jarak dari titik 1 ke titik 2
    public double getJarak(Titik T)
    {
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    //mencetak koordinat titik
    public void printTitik()
    {
        System.out.println("Titik (" +absis+ "," +ordinat+ ")");
    }

    //merefleksikan titik terhadap sumbu X
    public void refleksiX()
    {
        ordinat = ordinat * -1;
    }

    //merefleksikan titik terhadap sumbu Y
    public void refleksiY()
    {
        absis = absis * -1;
    }

    //mengembalikan titik yang direfleksi ke terhadap sumbu X
    public Titik getRefleksiX()
    {
        Titik baru = new Titik();
        baru.absis = absis;
        baru.ordinat = ordinat * -1;
        return baru;
    }

    //mengembalikan titik yang direfleksi ke terhadap sumbu Y
    public Titik getRefleksiY()
    {
       Titik baru = new Titik();
       baru.absis = absis * -1;
       baru.ordinat = ordinat;
        return baru;
    }

    //mencetak CounterTitik ke layar
    public void printCounterTitik()
    {
        System.out.println(this.countertitik);  
    }

} //endclass titik