/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading.overriding;

/**
 *
 * @author ASUS-TUF
 */
public class Country {
    protected String Capital;
    protected int Prov;
    
    public Country( String Capital, int Prov ) {
        this.Capital = Capital;
        this.Prov = Prov;
    }
    
    public void desk() {
        System.out.println("Berikut adalah deskripsi negara Indonesia");
        System.out.println("Ibu Kotanya adalah " + this.Capital);
        System.out.println("Jumlah provinsi negara ini ada " + this.Prov + " Provinsi");
    }
}
