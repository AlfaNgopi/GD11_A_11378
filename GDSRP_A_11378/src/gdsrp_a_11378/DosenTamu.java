package gdsrp_a_11378;

public class DosenTamu implements IMengajar{
    private String namaDosen;
    private double honor, jamKerja;

    public DosenTamu(String namaDosen, double honor, double jamKerja) {
        this.namaDosen = namaDosen;
        this.honor = honor;
        this.jamKerja = jamKerja;
    }
    
    public void showData(){
        System.out.println("Dosen : " + namaDosen + " - " + honor + " - " + jamKerja);
        mengajarTeori();
        mengajarPraktikum();
        System.out.println("");
    }
    
    public void mengajarTeori(){
        System.out.println("Dosen " + namaDosen + " mengajar Teori");
    }
    
    public void mengajarPraktikum(){
        System.out.println("Dosen " + namaDosen + " mengajar Praktikum");
    }
    
}
