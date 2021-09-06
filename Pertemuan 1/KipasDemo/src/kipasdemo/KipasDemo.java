/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kipasdemo;

/**
 *
 * @author welso
 */
public class KipasDemo {
    public static void main(String[]args){
        Kipas kps1 = new Kipas();
        Kipas kps2 = new Kipas();
        KipasPortable kps3 = new KipasPortable();
        
        System.out.println("===== Kipas Biasa =====");
        kps1.setMerek("WELHOME");
        kps1.setWarna("Hitam");
        kps1.tambahKecepatan(1);
        kps1.cetakStatus();
        
        kps2.setMerek("Cannon");
        kps2.setWarna("Putih");
        kps2.tambahKecepatan(3);
        kps2.cetakStatus();
        
        System.out.println("===== Kipas Portable =====");
        kps3.setMerek("Smart Fan");
        kps3.setWarna("Putih");
        kps3.tambahKecepatan(2);
        kps3.setWarnaRGB("Merah, Biru, Kuning");
        kps3.cetakStatus();
    }
}
