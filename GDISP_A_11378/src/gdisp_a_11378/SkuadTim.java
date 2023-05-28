package gdisp_a_11378;

import java.util.ArrayList;

public class SkuadTim {
    private String namaTim, asalTim;
    private PemainUtama pemainutama;
    private String namaManager, alamatManager, noHpManager;
    ArrayList<Pemain> listPemain = new ArrayList<Pemain>();

    public SkuadTim(String namaTim, String asalTim, String namaManager, String alamatManager, String noHpManager) {
        this.namaTim = namaTim;
        this.asalTim = asalTim;
        
        this.namaManager = namaManager;
        this.alamatManager = alamatManager;
        this.noHpManager = noHpManager;
    }

    
    
    public void showTim(){
        
        System.out.println("Nama Tim        : " + namaTim);
        System.out.println("Asal Tim        : " + asalTim + "\n");
        System.out.println("Nama Manager    : " + namaManager);
        System.out.println("Alamat Manager  : " + alamatManager);
        System.out.println("no HP Manager   : " + noHpManager);
        for (int i = 0; i < listPemain.size(); i++) {
            System.out.println("Pemain ke - "+ (i+1));
            listPemain.get(i).showPemain();
        }
    }
    
    public void addPemain(Pemain p){
        listPemain.add(p);
    }
    
}
