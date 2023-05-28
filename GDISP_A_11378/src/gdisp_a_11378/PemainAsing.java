package gdisp_a_11378;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PemainAsing extends Pemain{
    
    private String asalPemain, bahasa;
    

    public PemainAsing(String namaPemain, String nomorPunggung, String awalKontrak, String akhirKontrak,String asal, String bahasa) {
        super(namaPemain, nomorPunggung, awalKontrak, akhirKontrak);
        this.asalPemain = asal;
        this.bahasa = bahasa;
    }

    
    
    @Override
    public void showPemain(){
        System.out.println("    ===Data Pemain Asing===");
        System.out.println("Nama Pemain : " + namaPemain);
        System.out.println("Nomor Punggung : " + nomorPunggung);
        System.out.println("Awal Kontrak : " + awalKontrak);
        System.out.println("Akhir Kontrak : " + akhirKontrak);
        System.out.println("Asal Pemain : " + asalPemain);
        System.out.println("Bahasa      : " + bahasa);
        
        
        System.out.println("");
    }
    
    
    
    public double cekBonus(){
        double seMinggu = 0;
        double difference = 0;
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
            Date awal = format.parse("01/01/2022");
            Date akhir = format.parse("08/01/2022");
            seMinggu = awal.getTime() - akhir.getTime(); 
        }catch(Exception e){}
            
        
        
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd:MM:yyyy");
            Date date1 = format.parse(awalKontrak);
            Date date2 = format.parse(akhirKontrak);
            difference = date2.getTime() - date1.getTime(); 
        }catch(Exception e){}
        
        double totalMinggud = difference/seMinggu;
        int totalMinggu = (int)totalMinggud;
        
        if (totalMinggu>15) {
            return 450000*totalMinggu;
        }
        return 0;
    }
}
