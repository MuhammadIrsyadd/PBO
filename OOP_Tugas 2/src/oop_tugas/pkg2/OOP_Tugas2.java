/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_tugas.pkg2;

/**
 *
 * @author ASUS-TUF
 */
import java.util.Scanner;
public class OOP_Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("=============================");
        System.out.println("Nama    : Muh Irsyad Dwi K.  ");
        System.out.println("NPM     : 21081010127        ");
        System.out.println("Kelas   : E081               ");
        System.out.println("=============================");
        System.out.println("");
        
        Square kotak = new Square();
        System.out.print("Masukkan Sisi : ");
        kotak.sisi = input.nextInt();
        System.out.println("Luas Kotak = "+kotak.getLuas());
        System.out.println("Keliling Kotak = "+kotak.getKeliling());
        System.out.println("===================================");
        
        
        Rectangle persegipanjang = new Rectangle();
        System.out.print("Masukkan Lebar : ");
        persegipanjang.lebar = input.nextInt();
        System.out.print("Masukkan Panjang : ");
        persegipanjang.panjang = input.nextInt();
        System.out.println("Luas Persegi Panjang = "+persegipanjang.getLuas());
        System.out.println("Keliling Persegi Panjang = "+persegipanjang.getKeliling());
        System.out.println("===================================");
        
        Circle lingkaran = new Circle();
        System.out.print("Masukkan Jari - Jari : ");
        lingkaran.jari_jari = input.nextInt();
        System.out.println("Luas Lingkaran = "+lingkaran.getLuas());
        System.out.println("Keliling Lingkaran = "+lingkaran.getKeliling());
        System.out.println("===================================");
        
        Ellipse oval = new Ellipse();
        System.out.print("Masukkan Diameter A : ");
        oval.diameterA= input.nextInt();
        System.out.print("Masukkan Diameter B : ");
        oval.diameterB= input.nextInt();
        System.out.println("Luas Oval = "+oval.getLuas());
        System.out.println("Keliling Oval = "+oval.getKeliling());
        System.out.println("===================================");
    }
}
