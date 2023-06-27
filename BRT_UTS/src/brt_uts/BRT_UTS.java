/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brt_uts;
import java.util.ArrayList;
/**
 *
 * @author ASUS-TUF
 */
public class BRT_UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("Nama : Muh Irsyad Dwi Kurniawan");
        System.out.println("NPM : 21081010127 ");
        System.out.println("Kelas : D081");
        System.out.println("===============================");
//Daftar Halte dan Tujuan
        ArrayList<Halte> haltes = new ArrayList<>();
        haltes.add(new Halte("Kantor"));
        haltes.add(new Halte("Porong"));
        haltes.add(new Halte("Surabaya"));
        haltes.add(new Halte("Gresik"));
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Kantor", "Porong"));
        passengers.add(new Passenger("Kantor", "Porong"));
        passengers.add(new Passenger("Kantor", "Porong"));
        passengers.add(new Passenger("Kantor", "Gresik"));
        passengers.add(new Passenger("Kantor", "Gresik"));
        passengers.add(new Passenger("Porong", "Surabaya"));
        passengers.add(new Passenger("Porong", "Gresik"));
        passengers.add(new Passenger("Surabaya", "Gresik"));
        passengers.add(new Passenger("Surabaya", "Gresik"));
        passengers.add(new Passenger("Surabaya", "Gresik"));
        passengers.add(new Passenger("Surabaya", "Gresik"));
        passengers.add(new Passenger("Surabaya", "Gresik"));

        Bus bus1= new Bus(20,haltes,passengers);
      bus1.run();
    }
    
}
