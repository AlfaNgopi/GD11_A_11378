package gdold_a_11378;

public class DosenTamu extends Pengajar implements IMengajar {
    private double honor, jamKerja;

    public DosenTamu(String namaDosen, double honor, double jamKerja) {
        super(namaDosen);
        this.honor = honor;
        this.jamKerja = jamKerja;
    }
    
    public void showPengajar(){
        System.out.println("Dosen : " + namaPengajar + " - " + honor + " - " + jamKerja);
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
