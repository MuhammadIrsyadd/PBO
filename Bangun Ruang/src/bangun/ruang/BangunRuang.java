/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author ASUS-TUF
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("=============================");
        System.out.println("Nama    : Muh Irsyad Dwi K.  ");
        System.out.println("NPM     : 21081010127        ");
        System.out.println("Kelas   : D081               ");
        System.out.println("=============================");
        System.out.println("");
        
        
        Kubus kotak1 = new Kubus(); //constructor pertama
            kotak1.ComputeAndSetVolume();
            System.out.println("=== Kubus Ke-1 ===");
            System.out.println("Sisi Kubus : " + kotak1.sisi);
            System.out.println("Volume Kubus Adalah " + kotak1.getVolume());
        Kubus kotak2 = new Kubus(5); //constructor kedua
            kotak2.ComputeAndSetVolume();
            System.out.println("=== Kubus Ke-2 ===");
            System.out.println("Sisi Kubus: " + kotak2.sisi);
            System.out.println("Volume Kubus Adalah " + kotak2.getVolume());
        
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        
        Balok balok1 = new Balok();
            balok1.ComputeAndSetVolume();
            System.out.println("=== Balok Ke-1 ===");
            System.out.println("Panjang Balok : " + balok1.panjang);
            System.out.println("Lebar Balok : " + balok1.lebar);
            System.out.println("Tinggi Balok : " + balok1.tinggi);
            System.out.println("Volume Balok Adalah " + balok1.getVolume());
        Balok balok2 = new Balok(4, 2, 6);
            balok2.ComputeAndSetVolume();
            System.out.println("=== Kubus Ke-2 ===");
            System.out.println("Panjang Balok : " + balok2.panjang);
            System.out.println("Lebar Balok : " + balok2.lebar);
            System.out.println("Tinggi Balok : " + balok2.tinggi);
            System.out.println("Volume Balok Adalah " + balok2.getVolume());
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        
        Tabung tube1 = new Tabung();
            tube1.ComputeAndSetVolume();
            System.out.println("=== Tabung Ke-1 ===");
            System.out.println("Radius Tabung : " + tube1.radius);
            System.out.println("Tinggi Tabung : " + tube1.tinggi);
            System.out.println("Volume Tabung Adalah "+ tube1.getVolume());
        Tabung tube2 = new Tabung(10, 4);
            tube2.ComputeAndSetVolume();
            System.out.println("=== Tabung Ke-2 ===");
            System.out.println("Radius Tabung : " + tube2.radius);
            System.out.println("Tinggi Tabung : " + tube2.tinggi);
            System.out.println("Volume Tabung Adalah "+ tube2.getVolume());
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
            limas1.ComputeAndSetVolume();
            System.out.println("=== Limas Ke-1 ===");
            System.out.println("Sisi Limas Segi Empat : " + limas1.sisi);
            System.out.println("Tinggi Limas Segi Empat : " + limas1.tinggi);
            System.out.println("Volume Limas Adalah " + limas1.getVolume());
        LimasSegiEmpat limas2 = new LimasSegiEmpat(4, 5);
            limas2.ComputeAndSetVolume();
            System.out.println("=== Limas Ke-2 ===");
            System.out.println("Sisi Limas Segi Empat : " + limas2.sisi);
            System.out.println("Tinggi Limas Segi Empat : " + limas2.tinggi);
            System.out.println("Volume Limas Adalah " + limas2.getVolume());
        
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        
        Bola bola1 = new Bola();
            bola1.ComputeAndSetVolume();
            System.out.println("=== Bola Ke-1 ===");
            System.out.println("Radius Bola : " + bola1.radius);
            System.out.println("Volume Bola Adalah " + bola1.getVolume());
        Bola bola2 = new Bola(7);
            bola2.ComputeAndSetVolume();
            System.out.println("=== Bola Ke-2 ===");
            System.out.println("Radius Bola : " + bola2.radius);
            System.out.println("Volume Bola Adalah " + bola2.getVolume());
    }
}
