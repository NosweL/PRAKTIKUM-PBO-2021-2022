/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author welso
 */
public class SepedaDemo {
    public static void main(String[]args){
        
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        System.out.println("========== Sepeda Biasa ==========");
                
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(15);
        spd1.gantiGear(4);
        spd1.cetakStatus();
        
        spd2.setMerek("Welson Cycle");
        spd2.tambahKecepatan(12);
        spd2.gantiGear(6);
        spd2.tambahKecepatan(13);
        spd2.gantiGear(7);
        spd2.cetakStatus();
        
        System.out.println("========== Sepeda Gunung ==========");
        
        spd3.setMerek("Mountain Cycle");
        spd3.tambahKecepatan(19);
        spd3.gantiGear(8);
        spd3.setTipeSuspensi("Gas Suspention");
        spd3.cetakStatus();
    }
}
