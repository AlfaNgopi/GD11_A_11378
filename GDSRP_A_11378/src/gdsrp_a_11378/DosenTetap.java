package gdsrp_a_11378;

public class DosenTetap {
    private String namaDosen;
    private double gajiPokok, tunjangan;

    public DosenTetap(String namaDosen, double gajiPokok, double tunjangan) {
        this.namaDosen = namaDosen;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public void showDosenTetap(){
        System.out.println("Dosen : " + namaDosen + " - " + gajiPokok + " - " + tunjangan);
        mengajarTeori();
        mengajarPraktikum();
        System.out.println("");
    }
    
    public void mengajarTeori(){
        System.out.println("Dosen " + namaDosen + " mengajar teori");
    }
    
    public void mengajarPraktikum(){
        System.out.println("Dosen " + namaDosen + " mengajar praktikum");
    }
    
}
