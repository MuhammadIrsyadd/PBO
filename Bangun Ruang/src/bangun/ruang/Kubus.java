/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author ASUS-TUF
 */
public class Kubus {
    public int sisi, volume;
    //constructor pertama
    public Kubus() {
        this.sisi = 2;
    }
    //constructor kedua
    public Kubus(int sisi) {
        this.sisi = sisi;
    }
    
    public void ComputeAndSetVolume() {
        this.volume = this.sisi*this.sisi*this.sisi;
    }
    
    public int getVolume() {
        return this.volume;
    }
}
