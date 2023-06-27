/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS-TUF
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama    : Muh. Irsyad Dwi K.");
        System.out.println("NPM     : 21081010127");
        System.out.println("Kelas   : D081");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        
        System.out.println("--KOLEKSI--");
        Koleksi koleksia = new Koleksi("Bumi", "Gramedia Pustaka Utama", 2014);
        System.out.println(koleksia);
        System.out.println("");
        
        System.out.println("--BUKU--");
        Buku bukua = new Buku("Tips & Tricks To Become Programmer", "Linus Torvalds.", "HarperCollins", 2020);
        System.out.println(bukua);
        System.out.println("");
        
        System.out.println("--MAJALAH--");
        Majalah majalaha = new Majalah("Game Informer", "Majalah Video Game Bulanan", "Sunrise Publications", 1991);
        System.out.println(majalaha);
        System.out.println("");
        
        System.out.println("--SKRIPSI--");
        Skripsi skripsia = new Skripsi("Muh. Irsyad Dwi Kurniawan", "21081010127", "Pembuatan Company Profile Interaktif.", "UPN 'Veteran' Jawa Timur", 2024);
        System.out.println(skripsia);
        System.out.println("");
    }   
}
