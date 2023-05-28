package gdisp_a_11378;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PemainUtama extends Pemain implements IJadwal, IKonferensiPers{
    
    protected String posisi;
    protected String fasilitas;

    public PemainUtama(String namaPemain, String nomorPunggung, String awalKontrak, String akhirKontrak, String posisi, String fasilitas) {
        super(namaPemain, nomorPunggung, awalKontrak, akhirKontrak);
        this.posisi = posisi;
        this.fasilitas = fasilitas;
    }
    

    
    
    
    public void showPemain(){
        System.out.println("    ===Data Pemain Utama===");
        System.out.println("Nama Pemain : " + namaPemain);
        System.out.println("Nomor Punggung : " + nomorPunggung);
        System.out.println("Awal Kontrak : " + awalKontrak);
        System.out.println("Akhir Kontrak : " + akhirKontrak);
        System.out.println("Posisi          : " + posisi);
        System.out.println("Fasilitas      : " + fasilitas);
        
        jadwalBertanding();
        jadwalLatihan();
        jadwalKonferensiPers();
        System.out.println("Bonus : " + cekBonus());
        System.out.println("");
    }
    
    public void jadwalBertanding(){
        System.out.println(namaPemain + " Akan bertanding besok pagi");
    }
    public void jadwalLatihan(){
        System.out.println(namaPemain + " Akan Latihan nanti malam");
    }
    
    @Override
    public void jadwalKonferensiPers(){
        System.out.println("besok akan ada konferensi pers jika menang");
    }
    
    public double cekBonus(){
        
        double seMinggu = 0;
        double difference = 0;
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date awal = format.parse("01/01/2022");
            Date akhir = format.parse("08/01/2022");
            seMinggu = awal.getTime() - akhir.getTime(); 
        }catch(Exception e){}
            
        
        
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = format.parse(awalKontrak);
            Date date2 = format.parse(akhirKontrak);
            difference = date1.getTime() - date2.getTime(); 
        }catch(Exception e){}
        
        double totalMinggud = difference/seMinggu;
        int totalMinggu = (int)totalMinggud;
        System.out.println(totalMinggu);
        
        if (totalMinggu>25) {
            return 400000*totalMinggu;
        }
        return 0;
        
    }
    
}
