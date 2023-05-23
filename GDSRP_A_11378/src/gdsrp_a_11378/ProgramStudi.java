package gdsrp_a_11378;

public class ProgramStudi {
    private String namaProdi, namaKaprodi;
    private DosenTetap dosentetap;
    private DosenTamu dosentamu;
    private AsistenDosen asdos;

    public ProgramStudi(String namaProdi, String namaKaprodi) {
        this.namaProdi = namaProdi;
        this.namaKaprodi = namaKaprodi;
    }
    
    public void setDosenTetap(DosenTetap dosen) {
        this.dosentetap = dosen;
    }

   
    
    public void showProdi(){
        System.out.println("Nama Prodi  : " + namaProdi);
        System.out.println("Nama Kepala Prodi  : " + namaKaprodi);
        dosentetap.showDosenTetap();
        dosentamu.showData();
        asdos.showData();
    }
    
     public void setDosentamu(DosenTamu dosentamu) {
        this.dosentamu = dosentamu;
    }

    public void setAsdos(AsistenDosen asdos) {
        this.asdos = asdos;
    }
    
}
