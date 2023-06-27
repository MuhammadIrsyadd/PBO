/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brt_uts;
import java.util.ArrayList;
/**
 *
 * @author ASUS-TUF
 */
public class Bus {
    ArrayList<Passenger> passengers;
    ArrayList<Passenger>  passengersInBus;
    ArrayList<Halte> haltes;
    int capacity;
 
    Bus(int capacity,ArrayList<Halte> haltes,ArrayList<Passenger> passengers){
    this.capacity=capacity;
    this.haltes=haltes;
    this.passengers=passengers;
    this.passengersInBus= new ArrayList<>();
    }
    void passengerEntertheBus(Halte halte){

        int countPassengerEnter=0;
        for (Passenger newPassenger: passengers){
            if(newPassenger.departure.equals(halte.getPoint())){
            if(countPenumpang()<capacity){
                passengersInBus.add(newPassenger);
                countPassengerEnter++;
            }else{
                System.out.println("penumpang penuh!! tidak bisa menambah penumpang");
            }
            }
        }
        System.out.println("\t - "+countPassengerEnter+" penumpang naik :");

        for(Halte h:this.haltes){

            int countPassengerForDestination=0;
            String des="";
            for(Passenger p:passengersInBus){
                if(p.departure.equals(halte.getPoint())){
                    countPassengerForDestination++;
                    des=p.destination;
                }

            }
            if(countPassengerForDestination>0){
                if(h.getPoint().equals(halte.getPoint())) {
                    System.out.println("\t\t-" + countPassengerForDestination + " penumpang tujuan halte " + h.getPoint());
                }
            }

        }
//       

    }
    void passengerLeavetheBus(Halte halte){
        Integer index =0;
        ArrayList<Integer> catchIndex = new ArrayList<>();
        for(Passenger passenger : passengersInBus ){
            if(passenger.destination.equals(halte.getPoint())){
                   catchIndex.add(index);
                   index--;
            }
            index++;
        }
        for(int i:catchIndex){
            passengersInBus.remove(i);
        }
        System.out.println("\t - "+catchIndex.size()+" penumpang turun di halte "+ halte.getPoint());

    }
    int countPenumpang(){
       return this.passengersInBus.size();
    }

    public void setPenumpang(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }



    void busStop(Halte halte){
        if(halte.getPoint().equals(this.haltes.get(0).getPoint())){
            passengerEntertheBus(halte);
        } else if (halte.getPoint().equals(this.haltes.get(haltes.size() -1).getPoint())) {
            passengerLeavetheBus(halte);
        }else{
            passengerLeavetheBus(halte);
            passengerEntertheBus(halte);
        }


    }
    void  run(){
        
        for(Halte halte:this.haltes){
            System.out.println("-> Bus Berada di "+ halte.getPoint());
            busStop(halte);
            System.out.println("Jumlah penumpang saat ini : "+ passengersInBus.size()+"\n");
            System.out.println("========================================================");
        }
    }
}
