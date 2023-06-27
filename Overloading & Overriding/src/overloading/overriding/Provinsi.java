/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading.overriding;

/**
 *
 * @author ASUS-TUF
 */
public class Provinsi extends Indonesia {
   protected int Cities;

   public Provinsi(String nama, String Capital, int Prov, int Cities) {
       super(nama, Capital, Prov);
       this.Cities = Cities;
   }
   
   @Override
   public void desk() {
        System.out.println("Provinsi ini adalah salah satu provisi di Indonesia");
        System.out.println("Provinsi ini tekenal hingga mancanegara");
        System.out.println("Nama provinsi ini adalah " + this.nama);
        System.out.println("Ibu Kota negara ini adalah " + this.Capital);
        System.out.println("Provinsi ini hanya memiliki " + this.Cities + " Kota");
   }
   
   public void ciri() {
       System.out.println("Budaya provinsi ini sangat kental oleh karena itu banyak wisatawan yang berdatangan");
   }
}