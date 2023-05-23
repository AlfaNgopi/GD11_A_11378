package gdsrp_a_11378;

public class GDSRP_A_11378 {

    public static void main(String[] args) {
        TataUsaha TU = new TataUsaha("Agustinus Kris", "07.30-14.45");
        TU.ubahJumlahLayananTU("09.00-17.00");
        TU.showTU();
        
        
        
        
        ProgramStudi P1 = new ProgramStudi("Informatika", "Thomas Adi");
//        ProgramStudi P2 = new ProgramStudi("Teknik Industri", "Leny Halim");
        DosenTetap DT1 = new DosenTetap("Stephanie Pamela", 3000000, 1000000);
//        DosenTetap DT2 = new DosenTetap("Fransiska Hernina", 3000000, 1000000);
        
    

        P1.setDosenTetap(DT1);
        
        DosenTamu dt = new DosenTamu("Yulius Denny", 500000, 10);
        P1.setDosentamu(dt);
        
        
        AsistenDosen ad = new AsistenDosen("Michael Edward", 16, 2);
        P1.setAsdos(ad);
        
        P1.showProdi();
        
//        P2.setDosenTetap(DT2);
//        P2.showProdi();
    }
    
}
