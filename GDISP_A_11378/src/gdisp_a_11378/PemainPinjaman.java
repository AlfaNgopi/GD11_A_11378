package gdisp_a_11378;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PemainPinjaman extends Pemain implements IJadwal{
    
    private String asalTimPemain;
    private int tunjangan;

    public PemainPinjaman(String namaPemain, String nomorPunggung, String awalKontrak, String akhirKontrak, String asalTim, int tunjangan) {
        super(namaPemain, nomorPunggung, awalKontrak, akhirKontrak);
        this.asalTimPemain = asalTim;
        this.tunjangan = tunjangan;
    }

    
    
    @Override
    public void showPemain(){
        System.out.println("    ===Data Pemain Pinjaman===");
        System.out.println("Nama Pemain : " + namaPemain);
        System.out.println("Nomor Punggung : " + nomorPunggung);
        System.out.println("Awal Kontrak : " + awalKontrak);
        System.out.println("Akhir Kontrak : " + akhirKontrak);
        System.out.println("Asal Pemain : " + asalTimPemain);
        System.out.println("Bahasa      : " + tunjangan);
        
        jadwalBertanding();
        jadwalLatihan();
        System.out.println("Bonus : " + cekBonus());
        System.out.println("");
    }
    
    public void jadwalBertanding(){
        System.out.println(namaPemain + " Akan bertanding besok pagi");
    }
    public void jadwalLatihan(){
        System.out.println(namaPemain + " Akan Latihan nanti malam");
    }
    
    public double cekBonus(){
        double seMinggu = 0;
        double difference = 0;
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
            Date awal = format.parse("01/01/2022");
            Date akhir = format.parse("08/01/2022");
            seMinggu = akhir.getTime() - awal.getTime(); 
        }catch(Exception e){}
            
        
        
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
            Date date1 = format.parse(awalKontrak);
            Date date2 = format.parse(akhirKontrak);
            difference = date2.getTime() - date1.getTime(); 
        }catch(Exception e){}
        
        double totalMinggud = difference/seMinggu;
        int totalMinggu = (int)totalMinggud;
        
        if (totalMinggu>25) {
            return 250000*totalMinggu;
        }
        return 0;
    }
}
