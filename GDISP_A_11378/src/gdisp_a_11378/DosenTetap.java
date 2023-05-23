package gdisp_a_11378;

public class DosenTetap extends Pengajar implements IMengajarTeori, IMengajarPraktikum{
    private double gajiPokok, tunjangan;

    public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
        super(namaDosen);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void showPengajar(){
        System.out.println("Dosen : " + namaPengajar + " - " + gajiPokok + " - " + tunjangan);
        mengajarTeori();
        mengajarPraktikum();
        System.out.println("");
    }
    
    @Override
    public void mengajarTeori(){
        System.out.println("Dosen " + namaPengajar + " mengajar Teori");
    }
    
    @Override
    public void mengajarPraktikum(){
        System.out.println("Dosen " + namaPengajar + " mengajar Praktikum");
    }
    
}
