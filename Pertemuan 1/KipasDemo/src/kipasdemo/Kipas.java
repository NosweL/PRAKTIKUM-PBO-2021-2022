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
public class Kipas {
    private String merek;
    private int kecepatan;
    private String warna;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void tambahKecepatan(int increment){
        kecepatan += increment;
    }
    public void kurangiKecepatan(int decrement){
        kecepatan -= decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Kecepatan : " + kecepatan);
    }
}
