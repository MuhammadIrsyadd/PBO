/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading.overriding;

/**
 *
 * @author ASUS-TUF
 */
public class Indonesia extends Country {
   protected String nama;
   
   public Indonesia(String nama, String Capital, int Prov) {
       super(Capital, Prov);
       this.nama = nama;
   }
   
   @Override
   public void desk() {
        System.out.println("Negara ini adalah salah satu negara Asia ");
        System.out.println("Negara ini terkenal dengan rempah rempahnya");
        System.out.println("Nama negara ini adalah " + this.nama);
        System.out.println("Ibu Kota negara ini adalah " + this.Capital);
        System.out.println("Jumlah Provinsi di negara ini ada " + this.Prov + " Provinsi");
   }
   
   public void ciri() {
       System.out.println("Negara ini mempunyai ciri khas yaitu keberagaman suku dalam masyarakatnya");
   }
}
