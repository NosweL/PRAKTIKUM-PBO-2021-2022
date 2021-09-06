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
public class Lampu {
    private String merek;
    private String warna;
    private int cahaya;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void tambahCahaya(int increment){
        cahaya += increment;
    }
    public void kurangCahaya(int decrement){
        cahaya -= decrement;
    }
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Cahaya : " + cahaya);
        
    }
}
