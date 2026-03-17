public class Mtitik
{
    public static void main(String[] args)
    {
        Titik T1 = new Titik(); //membuat objek titik T1(0,0)
        T1.setAbsis(3); //mengubah nilai absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah nilai ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
    }
}