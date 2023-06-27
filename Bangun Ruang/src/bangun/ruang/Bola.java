/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author ASUS-TUF
 */
public class Bola {
    public double radius, volume;
    
    public Bola(){
        this.radius = 2;
    }
    
    public Bola(double radius){
        this.radius = radius;
    }
    
    public void ComputeAndSetVolume() {
        this.volume = 4/3*Math.PI*this.radius*this.radius*this.radius;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
