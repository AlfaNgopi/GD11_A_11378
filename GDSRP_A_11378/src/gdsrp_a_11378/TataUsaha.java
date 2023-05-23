package gdsrp_a_11378;

public class TataUsaha {
    private String namaKepalaTU, jumlahlayananTU;

    public TataUsaha(String namaKepalaTU, String jumlahlayananTU) {
        this.namaKepalaTU = namaKepalaTU;
        this.jumlahlayananTU = jumlahlayananTU;
    }
    
     public void showTU(){
        System.out.println("Nama Kepala TU : " + namaKepalaTU);
        System.out.println("Jumlah Layanan TU : " + jumlahlayananTU + "\n");
    }

    public void ubahJumlahLayananTU(String jumlahlayananTU) {
        this.jumlahlayananTU = jumlahlayananTU;
    }
    
}
