package gdnonsolid_a_11378;

public class Unit {
    private String namaProdi, namaKaprodi, namaKepalaTU, jumlahlayananTU;
    private DosenTetap dosentetap;

    public Unit(String namaProdi, String namaKaprodi, String namaKepalaTU, String jumlahLayananTU) {
        this.namaProdi = namaProdi;
        this.namaKaprodi = namaKaprodi;
        this.namaKepalaTU = namaKepalaTU;
        this.jumlahlayananTU = jumlahLayananTU;
    }

    
    
    public void setDosenTetap(DosenTetap dosentetap) {
        this.dosentetap = dosentetap;
    }
    
    public void showProdi(){
        System.out.println("Nama Prodi      : " + namaProdi);
        System.out.println("Nama KaProdi    : " + namaKaprodi);
        dosentetap.showDosenTetap();
    }
    
    public void showTU(){
        System.out.println("Nama Kepala TU : " + namaKepalaTU);
        System.out.println("Jumlah Layanan TU : " + jumlahlayananTU);
        System.out.println("\n");
    }

    public void ubahJumlahLayananTU(String jumlahLayananTU) {
        this.jumlahlayananTU = jumlahLayananTU;
    }
    
}
