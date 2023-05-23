package gdold_a_11378;

public class AsistenDosen extends Pengajar implements IMengajar {
    private double jmlpertemuan, jmlmodul;

    public AsistenDosen(String namaAsisten, double jmlPertemuan, double jmlModul) {
        super(namaAsisten);
        this.jmlpertemuan = jmlPertemuan;
        this.jmlmodul = jmlModul;
    }
    
    public void showPengajar(){
        System.out.println("Asisten : " + namaPengajar + " - " + jmlpertemuan + " - " + jmlmodul);
        mengajarPraktikum();
        System.out.println("");
    }
    
    public void mengajarTeori(){
    }
    
    public void mengajarPraktikum(){
        System.out.println("Asisten " + namaPengajar + " mengajar Praktikum");
    }
    
}
