package bonus_interface;

public class Asprak extends Mahasiswa implements Pengajar {
    Asprak(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
        
    }


    void ngasigKomenDiGCR(){
        System.out.println("Asprak ngsih komen di GC.");
    }

    
    public void mengajar(String matkul) {
        System.out.println("kak anu ngajar "+matkul);
    }

   
    public void mengasihTugas() {
        System.out.println("ga jadi, aspraknya baik");
    }

  
    public void menilaiTugas() {
        System.out.println("dandy dapat 100");
    }
}
