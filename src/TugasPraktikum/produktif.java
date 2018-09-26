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
public class produktif extends MataPelajaranSMK {
    
    public produktif(String kategoriMapel, int jumlahMapel) {
        super(kategoriMapel, jumlahMapel);
    }
    
    public void tampilkan(){
        String Mapel = "Produktif RPL, Sistem Telekomunikasi, Komputer dan Jaringan Dasar, Simulasi dan Komunikasi Digital, Desain Grafis";
    
    MataPelajaranSMK s = new MataPelajaranSMK("Produktif",5);
    s.tampilkanData();
    
    System.out.println("Mata Pelajaran Produktif Jurusan RPL   : " + Mapel);
    }
    
}
