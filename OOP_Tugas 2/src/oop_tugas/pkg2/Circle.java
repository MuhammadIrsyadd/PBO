/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tugas.pkg2;

/**
 *
 * @author ASUS-TUF
 */
public class Circle {
    public int jari_jari;
    
    public double getLuas() {
        return Math.PI*this.jari_jari*this.jari_jari;
    }
    
    public double getKeliling() {
        return Math.PI*2*this.jari_jari;
    }
}