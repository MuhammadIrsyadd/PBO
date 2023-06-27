/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brt_uts;

/**
 *
 * @author ASUS-TUF
 */
public class Passenger {
    String destination;
    String departure;
    Passenger(String departure,String destination){
    this.destination=destination;
    this.departure=departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture(){
        return  departure;
    }   
}
