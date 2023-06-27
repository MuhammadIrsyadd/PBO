/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading.overriding;

/**
 *
 * @author ASUS-TUF
 */
import java.util.Arrays;

public class Vector {
    public int x, y, z, skalar, hasilvektor;
    public int [] dimensi;
    public int [] hasilskalar = new int[3];
    public int [] vektor;
    
    public Vector(int [] dimensi) {
        this.dimensi = dimensi;
    }
    
    public int[] perkalian(int skalar) {
        this.skalar = skalar;        
        for(int i = 0; i < 3; i++) {
            hasilskalar[i] = this.skalar * this.dimensi[i];
        }
        return hasilskalar;
    }   
    
    public int perkalian(int [] vektor) {
        this.vektor = vektor;
        this.hasilvektor = 0;
        for(int i = 0; i < 3; i++) {
            this.hasilvektor += this.dimensi[i] * this.vektor[i];
        }
        return hasilvektor;
    }
    
    public void show() {
        System.out.println("Vektor Awal");
        System.out.println(Arrays.toString(dimensi));
        System.out.println("\nHasil perkalian Vektor dengan Skalar");
        System.out.println(Arrays.toString(hasilskalar));
        System.out.println("\nHasil perkalian Vektor dengan Vektor");
        System.out.println(hasilvektor);
    }
}
