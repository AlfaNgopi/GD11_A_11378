package gdisp_a_11378;

public abstract class Pemain {
    protected String namaPemain, nomorPunggung,awalKontrak, akhirKontrak;
    

    public Pemain(String namaPemain, String nomorPunggung, String awalKontrak, String akhirKontrak) {
        this.namaPemain = namaPemain;
        this.nomorPunggung = nomorPunggung;
        this.awalKontrak = awalKontrak;
        this.akhirKontrak = akhirKontrak;
        
    }

    
    
    public abstract void showPemain();
       
}
