package gdisp_a_11378;

public class AsistenDosen extends Pengajar implements IMengajarPraktikum {
    private int jmlPertemuan, jmlModul;

    public AsistenDosen(String namaAsisten, int jmlPertemuan, int jmlModul) {
        super(namaAsisten);
        this.jmlPertemuan = jmlPertemuan;
        this.jmlModul = jmlModul;
    }
    
    @Override
    public void showPengajar(){
        System.out.println("Asisten : " + namaPengajar + " - " + jmlPertemuan + " - " + jmlModul);
        mengajarPraktikum();
        System.out.println("");
    }
    
    @Override
    public void mengajarPraktikum(){
        System.out.println("Asisten " + namaPengajar + " mengajar Praktikum");
    }
    
}
