/*Nama File  : Garis.java 
 * Deskripsi : berisi atribut dan method dalam class garis
 * Pembuat   : Ikrar Maheswara Rabbani Wibowo
 * Tanggal   : 02-03-2026 */

public class Garis {
    /*************ATRIBUT**************/
    Titik Tawal;                //Titik awal garis
    Titik Takhir;               //Titik akhir garis
    static int counterGaris = 0;

    /*************METHOD***************/

    //konstruktor garis dengan titik awal (0,0) dan akhir (1,1)
    Garis()
    {
        Tawal = new Titik(0,0);
        Takhir = new Titik(1,1);
        counterGaris++;
    }

    //konstruktor garis dengan titik input titik awal (w,x) dan input titik akhir (y,z)
    Garis(double w, double x, double y, double z)
    {
        this.Tawal = new Titik(w,x);
        this.Takhir = new Titik(y,z);
        counterGaris++;
    }

    //getter untuk counterGaris
    static int getCounterGaris()
    {
        return counterGaris;
    }

    //getter untuk Titik Awal
    Titik getAwal()
    {
        return Tawal;
    }

    //getter untuk Titik Akhir
    Titik getAkhir()
    {
        return Takhir;
    }

    //fungsi mengembalikan panjang garis
    double panjangGaris()
    {
        return Math.sqrt(
            Math.pow(Takhir.absis - Tawal.absis, 2) + 
            Math.pow(Takhir.ordinat - Tawal.ordinat, 2)
        );
    }

    //fungsi mengembalikan panjang gradien
    double panjangGradien()
    {
        if(Takhir.absis == Tawal.absis)
        {
            return 0;
        }
        return ((Takhir.ordinat - Tawal.ordinat) / (Takhir.absis - Tawal.absis));
    }

    //fungsi mengembalikan Titik Tengah dari garis
    Titik getTitikTengah()
    {
        Titik baru = new Titik(
            (Tawal.absis + Takhir.absis) / 2,     //absis
            (Tawal.ordinat + Takhir.ordinat) / 2  //ordinat
        );
        return baru;
    }

    //fungsi mengecek apakah 2 garis sejajar atau tidak
    boolean isSejajar(Garis G)
    {
        return Math.abs(this.panjangGradien() - G.panjangGradien()) < 0.0001;
    }

    //fungsi mengecek apakah 2 garis tegak lurus atau tidak
    boolean isTegakLurus(Garis G)
    {
        return Math.abs(this.panjangGradien() * G.panjangGradien() - (-1)) < 0.0001;
    }

    //mencetak garis dengan menampilkan titik awal dan titik akhir
    void printGaris()
    {
        System.out.println("Titik Awal: (" + this.Tawal.absis + "," +this.Tawal.ordinat + ")\n" +
                           "Titik Akhir: (" + this.Takhir.absis + "," +this.Takhir.ordinat + ")\n"
        );
    }

    //mencetak garis dalam bentuk string y = mx + c
    void printPersamaan()
    {
        double m = (Takhir.ordinat - Tawal.ordinat) /
                   (Takhir.absis - Tawal.absis);
        double c = Tawal.ordinat - (m * Tawal.absis);

        if(Tawal.absis == Takhir.absis)
        {
            System.out.println("x = " +Tawal.absis);
            return;
        }

        System.out.println("y = " +m+ "x + " +c+ "\n");
    }
}