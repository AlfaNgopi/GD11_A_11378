package gdsrp_a_11378;

public class AsistenDosen implements IMengajar{
    private String namaAsisten;
    private double jmlPertemuan, jmlModul;

    public AsistenDosen(String namaAsisten, double jmlPertemuan, double jmlModul) {
        this.namaAsisten = namaAsisten;
        this.jmlPertemuan = jmlPertemuan;
        this.jmlModul = jmlModul;
    }
    
    public void showData(){
        System.out.println("Asisten : " + namaAsisten + " - " + jmlPertemuan + " - " + jmlModul);
        mengajarPraktikum();
        System.out.println("");
    }
    
    public void mengajarTeori(){
    }
    
    public void mengajarPraktikum(){
        System.out.println("Asisten " + namaAsisten + " mengajar Praktikum");
    }
    
}
