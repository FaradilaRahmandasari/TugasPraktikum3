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
public class MataPelajaranSMK {
    private String kategoriMapel;
    private int jumlahMapel;
    
    public MataPelajaranSMK(String kategoriMapel, int jumlahMapel) {
        this.kategoriMapel = kategoriMapel;
        this.jumlahMapel = jumlahMapel;
    }

    public String getKategoriMapel() {
        return kategoriMapel;
    }

    public int getJumlahMapel() {
        return jumlahMapel;
    }

    public void setKategoriMapel(String kategoriMapel) {
        this.kategoriMapel = kategoriMapel;
    }

    public void setJumlahMapel(int jumlahMapel) {
        this.jumlahMapel = jumlahMapel;
    }
    
    public void tampilkanData(){
        System.out.println("Kategori Mata Pelajaran SMK      : " + getKategoriMapel());
        System.out.println("Jumlah Mata Pelajaran SMK        : " + getJumlahMapel());
    }
}
