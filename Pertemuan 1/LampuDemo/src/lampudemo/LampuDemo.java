/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampudemo;

/**
 *
 * @author welso
 */
public class LampuDemo {
    public static void main(String[]args){
        
     Lampu lmp1 = new Lampu();
     Lampu lmp2 = new Lampu();
     LampuPintar lmp3 = new LampuPintar();
     
     
        System.out.println("===== Lampu Biasa =====");
        lmp1.setMerek("Philips");
        lmp1.setWarna("Putih");
        lmp1.tambahCahaya(1);
        lmp1.cetakStatus();
        
        lmp2.setMerek("KINGLED");
        lmp2.setWarna("Kuning");
        lmp2.tambahCahaya(2);
        lmp2.cetakStatus();
        
        System.out.println("===== Lampu Pintar =====");
        
        lmp3.setMerek("Smart LED");
        lmp3.setWarna("MIX RGB");
        lmp3.tambahCahaya(1);
        lmp3.setWarnaRGB("Merah, Kuning, Biru");
        lmp3.cekStatus();
    }
    
    
}
