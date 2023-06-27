/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author ASUS-TUF
 */
public class Tabung {
    public double radius, tinggi, volume;
    
    public Tabung(){
        this.radius = 1;
        this.tinggi = 2;
    }
    
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume() {
        this.volume = (Math.PI*this.radius*this.radius)*this.tinggi;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
