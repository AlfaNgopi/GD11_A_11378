package gdold_a_11378;

import java.util.ArrayList;

public class ProgramStudi {
    private String namaProdi, namaKaprodi;
    ArrayList<Pengajar> listpengajar = new ArrayList<Pengajar>();

    public ProgramStudi(String namaProdi, String namaKaprodi) {
        this.namaProdi = namaProdi;
        this.namaKaprodi = namaKaprodi;
    }
    
    public void showProdi(){
        System.out.println("Nama Prodi  : " + namaProdi);
        System.out.println("Nama Kepala Prodi  : " + namaKaprodi + "\n");
        for (int i = 0; i < listpengajar.size(); i++) {
            System.out.println("Pengajar ke - "+ (i+1));
            listpengajar.get(i).showPengajar();
        }
    }
    
    public void addPengajar(Pengajar p){
        listpengajar.add(p);
    }
    
}
