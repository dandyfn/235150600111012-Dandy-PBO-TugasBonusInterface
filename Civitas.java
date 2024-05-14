package bonus_interface;

public class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;
    Civitas (String nama, int umur, boolean jenisKelamin){
        this.nama=nama; this.umur=umur; this.jenisKelamin=jenisKelamin;
    }    
    void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    void mainGameCorner() {
        System.out.println(nama + " main di game corner.");
    }

    void naikLift() {
        System.out.println(nama + " naik lift.");
    }
    
}
