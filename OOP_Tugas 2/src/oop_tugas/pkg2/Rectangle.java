/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_tugas.pkg2;

/**
 *
 * @author ASUS-TUF
 */
public class Rectangle {
    public int panjang, lebar;
    
    public int getKeliling() {
        return this.panjang*2+this.lebar*2;
    }
    
    public int getLuas() {
        return this.panjang*this.lebar;
    }
}

