package bonus_interface;

public class Main {
    public static void main(String[] args) {
        Asprak asprak = new Asprak("Budi", 20, true);
        Dosen dosen = new Dosen("Pak Agus", 45, true);
        Mahasiswa mahasiswa = new Mahasiswa("Siti", 19, false);
        Resepsionis resepsionis = new Resepsionis("Andi", 25, true);
      
        asprak.ngasigKomenDiGCR();
        asprak.mengajar("Matematika");
        asprak.mengasihTugas();
        asprak.menilaiTugas();
        asprak.makanDiKantin("Kantin Asprak");
        asprak.mainGameCorner();
        asprak.naikLift();

       
        dosen.ikutPenelitian();
        dosen.masukKelas();
        dosen.mengajar("Fisika");
        dosen.mengasihTugas();
        dosen.menilaiTugas();
        dosen.makanDiKantin("Kantin Dosen");
        dosen.mainGameCorner();
        dosen.naikLift();

        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("BEM");
        mahasiswa.presentasi();
        mahasiswa.masukKelas();
        mahasiswa.makanDiKantin("Kantin Mahasiswa");
        mahasiswa.mainGameCorner();
        mahasiswa.naikLift();

       
        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.makanDiKantin("Kantin Resepsionis");
        resepsionis.mainGameCorner();
        resepsionis.naikLift();

        Civitas asprakAsCivitas = new Asprak("Budi", 20, true);
        Civitas dosenAsCivitas = new Dosen("Pak Agus", 45, true);
        Civitas mahasiswaAsCivitas = new Mahasiswa("Siti", 19, false);
        Civitas resepsionisAsCivitas = new Resepsionis("Andi", 25, true);

        Pengajar asprakAsPengajar = new Asprak("Budi", 20, true);
        Pengajar dosenAsPengajar = new Dosen("Pak Agus", 45, true);

        PesertaKelas mahasiswaAsPesertaKelas = new Mahasiswa("Siti", 19, false);
        PesertaKelas dosenAsPesertaKelas = new Dosen("Pak Agus", 45, true);

      
        asprakAsCivitas.makanDiKantin("Kantin Asprak");
        dosenAsCivitas.mainGameCorner();
        mahasiswaAsCivitas.naikLift();
        resepsionisAsCivitas.makanDiKantin("Kantin Resepsionis");

      
        asprakAsPengajar.mengajar("Matematika");
        asprakAsPengajar.mengasihTugas();
        asprakAsPengajar.menilaiTugas();

        dosenAsPengajar.mengajar("Fisika");
        dosenAsPengajar.mengasihTugas();
        dosenAsPengajar.menilaiTugas();

       
        mahasiswaAsPesertaKelas.masukKelas();
        dosenAsPesertaKelas.masukKelas();
    }
}
