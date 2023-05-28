package gdisp_a_11378;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GDISP_A_11378 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        
        String nama,nomor,alamat,nohp,negara,bahasa,fasilitas;
        int tunjangan;
        String awal,akhir;
        try{
            System.out.println("Input Pemain Asing");
            System.out.println("Nama : ");nama = br.readLine();
            System.out.println("Nomor Punggung : "); nomor = br.readLine();
            System.out.println("Awal Kontrak : "); awal = br.readLine();
            System.out.println("Akhir Kontrak : "); akhir = br.readLine();
            System.out.println("Asal Negara : "); negara = br.readLine();
            System.out.println("Bahasa  : ");bahasa = br.readLine();
            
            //PemainAsing PA = new PemainAsing(nama,nomor,,"01/03/2024", "argentina", "English");
            
        }catch(Exception e){}
        
        
        SkuadTim P1 = new SkuadTim("barca","spain","gopa","doplang","4895623");
        PemainUtama DT1 = new PemainUtama("Alfa","20","01/01/2023","01/09/2023", "striker", "Mobil");
        P1.addPemain(DT1);
        PemainPinjaman dt = new PemainPinjaman("asdc","20","01/01/2023","01/03/2024", "arema", 10000);
        P1.addPemain(dt);
        PemainAsing PA = new PemainAsing("asdc","20","01/01/2023","01/03/2024", "argentina", "English");
        P1.addPemain(PA);
        
        
        
        P1.showTim();
        
    }
    
}
