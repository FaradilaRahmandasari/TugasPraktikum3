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
public class main {
    public static void main(String[] args)
    {
        System.out.println("Mata Pelajaran SMK   : ");
        System.out.println("");
        
        produktif p = new produktif("Produktif", 5);
        p.tampilkan();
        System.out.println("");
        
        adaptif a = new adaptif("Adaptif", 5);
        a.tampilkan();
        System.out.println("");
        
        normatif n = new normatif("Normatif", 4);
        n.tampilkan();
        System.out.println("");
        
    }
}
