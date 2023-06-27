/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS-TUF
 */
public class Skripsi extends Buku{
    private String npm;
    
    public Skripsi(String penulis, String npm, String judul, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }
    
    @Override
    public String toString() {
        return "Penulis\t\t: " + getPenulis() + "\nNPM\t\t: " + npm + "\nJudul\t\t: " + judul + "\nPenerbit\t\t: " + penerbit + "\nTahun Terbit\t: " + tahun;
    }
}
