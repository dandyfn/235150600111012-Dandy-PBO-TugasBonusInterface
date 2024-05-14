package bonus_interface;

public class Dosen extends Civitas implements PesertaKelas,Pengajar {
    private String nama;
    private double gaji;
    Dosen (String nama, int umur, boolean jenisKelamin){
       super(nama, umur, jenisKelamin);
    }
   
    void ikutPenelitian() {
        System.out.println(nama + " ikut penelitian.");
    }

    public void masukKelas() {
        System.out.println(nama+ " masuk kelas.");
    }

   
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul);
    }

  
    public void mengasihTugas() {
        System.out.println(nama + " memberikan tugas.");
    }

    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas.");
    }
}
