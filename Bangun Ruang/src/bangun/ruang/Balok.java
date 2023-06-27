/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author ASUS-TUF
 */
public class Balok {
    public int panjang, lebar, tinggi, volume;
   
    public Balok(){
        this.panjang = 2;
        this.lebar = 3;
        this.tinggi = 4;
    }
    
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume() {
        this.volume = this.panjang*this.lebar*this.tinggi;
    }
    
    public int getVolume() {
        return this.volume;
    }
}
