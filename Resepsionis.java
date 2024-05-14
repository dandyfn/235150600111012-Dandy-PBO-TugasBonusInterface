package bonus_interface;

public class Resepsionis extends Civitas{
    Resepsionis(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }
    private int idResepsionis;
    private String jabatan;
    private double gaji;
   
    void melayani() {
        System.out.println(idResepsionis+"\n"+jabatan + " melayani.");
    }

    void melapor() {
        System.out.println(idResepsionis+"\n"+jabatan + " melapor.");
    }
}
