/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading.overriding;

/**
 *
 * @author ASUS-TUF
 */
public class OverloadingOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama    : Muh. Irsyad Dwi Kurniawan");
        System.out.println("NPM     : 21081010127");
        System.out.println("Kelas   : D081");
        System.out.println("");
        
        System.out.println("------- TUGAS 1 -------\n");
        Vector vec = new Vector(new int[] {1, 2, 3});
        vec.perkalian(5);
        vec.perkalian(new int[] {4, 5, 6});
        vec.show();
        System.out.println("====================================");
        
        System.out.println("\n------- TUGAS 2 -------\n");
        System.out.println("-- Country --");
        Country con = new Country( "Jakarta", 38);
        con.desk();
        
        System.out.println("\n  -- Indonesia --");
        Indonesia indo = new Indonesia("Indonesia", "Jakarta", 38);
        indo.desk();
        indo.ciri();
        
        System.out.println("\n-- Bali --");
        Provinsi bali = new Provinsi("Bali", "Denpasar", 38, 1);
        bali.desk();
        bali.ciri();
    }
    
}
