/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author ASUS-TUF
 */
public class LimasSegiEmpat {
    public double sisi, tinggi, volume;
    
    public LimasSegiEmpat(){
        this.sisi = 2;
        this.tinggi = 4;
    }
    
    public LimasSegiEmpat(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume() {
        this.volume = (this.sisi*this.sisi*this.tinggi)/3;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
