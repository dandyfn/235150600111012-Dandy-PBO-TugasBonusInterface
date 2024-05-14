package bonus_interface;

public class Mahasiswa extends Civitas implements PesertaKelas{
    private String nim;
    private double ipk;
    private int goUkt;
Mahasiswa(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
       
    }
void ngerjainTugas() {
    System.out.println(nim + " mengerjakan tugas.");
}

void pasrah() {
    System.out.println(nim + " pasrat.");
}

void mengikutiOrganisasi(String namaOrganisasi) {
    System.out.println(nim + " mengikuti organisasi " + namaOrganisasi);
}

void presentasi() {
    System.out.println(nim + " presentasi.");
}

public void masukKelas() {
    System.out.println(nim + " masuk kelas.");
}
}
