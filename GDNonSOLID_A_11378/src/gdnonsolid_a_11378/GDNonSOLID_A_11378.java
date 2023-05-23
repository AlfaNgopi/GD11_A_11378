package gdnonsolid_a_11378;

public class GDNonSOLID_A_11378 {

    public static void main(String[] args) {
        Unit U1 = new Unit("Informatika", "Thomas Adi", "Agustinus Kris", "07.30-14.45");
        DosenTetap DT1 = new DosenTetap("Stephanie Pamela", 3000000, 1000000);
        Unit U2 = new Unit("Teknik Industri", "Leny Halim", "Agustinus Kris", "07.30-14.45");
        DosenTetap DT2 = new DosenTetap("Fransiska Hernina", 3000000, 1000000);
        
        U1.setDosenTetap(DT1);
        U1.showProdi();
        U1.showTU();
        
        U2.setDosenTetap(DT2);
        U2.ubahJumlahLayananTU("09.00-17.00");
        U2.showProdi();
        U2.showTU();
        
    }
    
}
