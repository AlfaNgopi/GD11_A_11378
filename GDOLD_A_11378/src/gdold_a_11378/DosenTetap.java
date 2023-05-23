package gdold_a_11378;

public class DosenTetap extends Pengajar implements IMengajar{
    private double gajiPokok, tunjangan;

    public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
        super(namaDosen);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public void showPengajar(){
        System.out.println("Dosen : " + namaPengajar + " - " + gajiPokok + " - " + tunjangan);
        mengajarTeori();
        mengajarPraktikum();
        System.out.println("");
    }
    
    public void mengajarTeori(){
        System.out.println("Dosen " + namaPengajar + " mengajar Teori");
    }
    
    public void mengajarPraktikum(){
        System.out.println("Dosen " + namaPengajar + " mengajar Praktikum");
    }
    
}
