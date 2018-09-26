/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Asus
 */
public class normatif extends MataPelajaranSMK {
    
    public normatif(String kategoriMapel, int jumlahMapel) {
        super(kategoriMapel, jumlahMapel);
    }
    
    public void tampilkan(){
        String Mapel = "Seni Budaya dan Keterampilan, Pendidikan Keagamaan, Pendidikan Jasmani dan Kesehatan, Pendidikan Kewarganegaraan";
        
        MataPelajaranSMK s = new MataPelajaranSMK("Normatif",4);
        s.tampilkanData();
        System.out.println("Mata Pelajaran Normatif Jurusan RPL  : " + Mapel);
    }
    
}
