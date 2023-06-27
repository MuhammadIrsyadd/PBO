/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS-TUF
 */
public class Majalah extends Koleksi {
    private String Edisi;
        
    public Majalah(String judul, String Edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.Edisi = Edisi;
    }
    
    @Override
    public String toString() {
        return "Judul\t\t: " + judul + "\nEdisi\t\t: " + Edisi + "\nPenerbit\t\t: " + penerbit + "\nTahun Terbit\t: " + tahun;
    }
}
