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
public class KipasPortable extends Kipas {
    
    private String warnaRGB;
    
    public void setWarnaRGB(String newValue){
        warnaRGB = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Warna RGB : " + warnaRGB);
    }
}
