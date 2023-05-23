package gdisp_a_11378;

public class DosenTamu extends Pengajar implements IMengajarTeori, IMengajarPraktikum{
    private double honor, jmljamKerja;

    public DosenTamu(String namaPengajar, double honor, double jmljamKerja) {
        super(namaPengajar);
        this.honor = honor;
        this.jmljamKerja = jmljamKerja;
    }
    
    @Override
    public void showPengajar(){
        System.out.println("Dosen : "+namaPengajar+" - "+honor+" - "+jmljamKerja);
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
