package gdisp_a_11378;

public class GDISP_A_11378 {

    public static void main(String[] args) {
        
        ProgramStudi P1 = new ProgramStudi("Informatika", "Thomas Adi");
        DosenTetap DT1 = new DosenTetap("Stephanie Pamela", 3000000, 1000000);
        P1.addPengajar(DT1);
        DosenTamu dt = new DosenTamu("Yulius Denny", 500000, 10);
        P1.addPengajar(dt);
        AsistenDosen ad = new AsistenDosen("Michael Edward", 16, 2);
        P1.addPengajar(ad);
        
        
        
        
        P1.showProdi();
        
    }
    
}
