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
public class adaptif extends MataPelajaranSMK {
    
    public adaptif(String kategoriMapel, int jumlahMapel) {
        super(kategoriMapel, jumlahMapel);
    }
    
    public void tampilkan(){
        String Mapel = "Bahasa Indonesia, Bahasa Inggris, Ilmu Pengetahuan Alam, Sejarah Indonesia, Matematika";
        
        MataPelajaranSMK s = new MataPelajaranSMK("Adaptif",5);
        s.tampilkanData();
        System.out.println("Mata Pelajaran Adaptif Jurusan RPL  : " + Mapel);
    }
    
}
