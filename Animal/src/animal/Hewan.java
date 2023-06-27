/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ASUS-TUF
 */
public abstract class Hewan {
    // Method abstract
    public abstract void makan();
    public abstract void bergerak();

    // Method non-abstract
    public void tidur() {
        System.out.println("Hewan sedang tidur.");
    }

    public void bersuara() {
        System.out.println("Hewan sedang bersuara.");
    }
}
