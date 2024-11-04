package bookingSystem;

import java.util.*;

public class TicketBooker {
    static int availableLowerberths = 21;
    static int availableLMiddleberths = 21;
    static int availableUpperberths = 21;
    static int availableRacTickets = 18;
    static int availableWaitingList = 10;

    static Queue<Integer> racList = new LinkedList<>();
    static Queue<Integer> waitingList = new LinkedList<>();

    static List<Integer> bookedTicketList = new LinkedList<>();

    static List<Integer> lowerBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> middleBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> racPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(1));
    
//------------------------------------------------------------------------------------------------
    static Map<Integer, Passenger> passengers = new HashMap<>();

    public void bookTicket(Passenger p, int berthInfo, String allotedBerth){
        p.number = berthInfo;
        p.alloted = allotedBerth;
        passengers.put(p.passengerId, p);
        bookedTicketList.add(p.passengerId);
        System.out.println("-----Booked Successfully-----");
    }

    public void addToRAC(Passenger p, int racInfo, String allotedRAC){
        p.number = racInfo;
        p.alloted = allotedRAC;
        passengers.put(p.passengerId, p);
        racList.add(p.passengerId);
        System.out.println("-----Added to RAC Successfully-----");

    }

    public void addToWaitingList(Passenger p, int waitingListInfo, String allotedWaitingList){
        p.number = waitingListInfo;
        p.alloted = allotedWaitingList;
        passengers.put(p.passengerId, p);
        waitingList.add(p.passengerId);
        System.out.println("-----Added to Waiting List Successfully-----");

    }

    public void cancelTicket(int passengerId){
        Passenger p = passengers.get(passengerId);
        passengers.remove(passengerId);
        bookedTicketList.remove(passengerId);
        int positionBooked = p.number;
        System.out.println("-------------Cancelled Successfully-------------");

        if(p.alloted.equals("L")){
            availableLowerberths++;
            lowerBerthPositions.add(positionBooked);
        }
        else if(p.alloted.equals("M")){
            availableLMiddleberths++;
            middleBerthPositions.add(positionBooked);
        }
        else if(p.alloted.equals("U")){
            availableUpperberths++;
            upperBerthPositions.add(positionBooked);
        }

        if (racList.size() > 0) {
            Passenger passengerFromRAC = passengers.get(racList.poll());
            int positionRac = passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(passengerFromRAC.passengerId);
            availableRacTickets++;
            if(waitingList.size() > 0){
                Passenger passengerFromWaitingList = passengers.get(waitingList.poll());
                int positionWaitingList = passengerFromWaitingList.number;
                waitingListPositions.add(positionWaitingList);
                waitingList.remove(passengerFromWaitingList.passengerId);

                passengerFromWaitingList.number = racPositions.get(0);
                racPositions.remove(0);
                racList.add(passengerFromWaitingList.passengerId);

                availableWaitingList++;
                availableRacTickets--;
            }
            Main.bookTicket(passengerFromRAC);
        }


    }

    public void availableTickets(){
        System.out.println("---------------------------------" );
        System.out.println("Available Lower Berths : " + availableLowerberths);
        System.out.println("Available Middle Berths : " + availableLMiddleberths);
        System.out.println("Available Upper Berths : " + availableUpperberths);
        System.out.println("Available RAC : " + availableRacTickets);
        System.out.println("Available Waiting List : " + availableWaitingList);
        System.out.println("---------------------------------" );
        
    }

    public void printPassengerDetails(){
        if (passengers.size() == 0) {
            System.out.println("No Details of Passengers");
            return;
        }
        for(Passenger p : passengers.values()){
            System.out.println("---------------------------------" );
            System.out.println("Passenger ID : " + p.passengerId);
            System.out.println("Passenger Name : " + p.name);
            System.out.println("Passenger Age : " + p.age);
            System.out.println("Passenger Status : " + p.number + p.alloted);
            System.out.println("---------------------------------" );
            
        }
    }

  
}
