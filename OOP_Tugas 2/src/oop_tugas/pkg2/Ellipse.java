/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tugas.pkg2;

/**
 *
 * @author ASUS-TUF
 */
public class Ellipse {
    public int diameterA, diameterB;
    
    public double getLuas() {
        return Math.PI*0.5*(this.diameterA*this.diameterB);
    }
    
    public double getKeliling() {
        return Math.PI*0.5*(this.diameterA+this.diameterB);
    }
}
