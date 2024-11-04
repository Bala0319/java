package bookingSystem;

import java.util.*;


public class Main{
    public static void bookTicket(Passenger p){
        TicketBooker booker = new TicketBooker();

        if(TicketBooker.availableWaitingList == 0){
            System.out.println("No Tickets Available");
            return;
        }

        if((p.berthPerference.equals("L") && TicketBooker.availableLowerberths > 0) ||
        (p.berthPerference.equals("M") && TicketBooker.availableLMiddleberths > 0) ||
        (p.berthPerference.equals("U") && TicketBooker.availableUpperberths > 0)) {

            System.out.println("-----------Perfered Berth Available-----------");
            if(p.berthPerference.equals("L")){
                System.out.println("-----------Lower Berth Given-----------");
                booker.bookTicket(p,(TicketBooker.lowerBerthPositions.get(0)),"L");
                TicketBooker.lowerBerthPositions.remove(0);
                TicketBooker.availableLowerberths--;
            }
            else if(p.berthPerference.equals("M")){
                System.out.println("-----------Middle Berth Given-----------");
                booker.bookTicket(p,(TicketBooker.middleBerthPositions.get(0)),"M");
                TicketBooker.middleBerthPositions.remove(0);
                TicketBooker.availableLMiddleberths--;
            }
            else if(p.berthPerference.equals("U")){
                System.out.println("-----------Upper Berth Given-----------");
                booker.bookTicket(p,(TicketBooker.upperBerthPositions.get(0)),"U");
                TicketBooker.upperBerthPositions.remove(0);
                TicketBooker.availableUpperberths--;
            }

        }
        else if (TicketBooker.availableLowerberths > 0){
            System.out.println("-----------Lower Berth Given-----------");
                booker.bookTicket(p,(TicketBooker.lowerBerthPositions.get(0)),"L");
                TicketBooker.lowerBerthPositions.remove(0);
                TicketBooker.availableLowerberths--;
        }
        else if (TicketBooker.availableLMiddleberths > 0){
            System.out.println("-----------Middle Berth Given-----------");
                booker.bookTicket(p,(TicketBooker.middleBerthPositions.get(0)),"M");
                TicketBooker.middleBerthPositions.remove(0);
                TicketBooker.availableLMiddleberths--;
        }
        else if (TicketBooker.availableUpperberths > 0){
            System.out.println("-----------Upper Berth Given-----------");
                booker.bookTicket(p,(TicketBooker.upperBerthPositions.get(0)),"U");
                TicketBooker.upperBerthPositions.remove(0);
                TicketBooker.availableUpperberths--;
        }

        else if(TicketBooker.availableRacTickets > 0){
            System.out.println("-----------RAC Available-----------");
            booker.addToRAC(p, (TicketBooker.racPositions.get(0)), "RAC");
            TicketBooker.racPositions.remove(0);
            TicketBooker.availableRacTickets--;
        }

        else if(TicketBooker.availableWaitingList > 0){
            System.out.println("-----------Waiting List Available-----------");
            booker.addToWaitingList(p, (TicketBooker.waitingListPositions.get(0)), "WL");
            TicketBooker.waitingListPositions.remove(0);
            TicketBooker.availableWaitingList--;
        }


    }

    public static void cancelTicket(int id){
        TicketBooker booker = new TicketBooker();
        if (!booker.passengers.containsKey(id)) {
            System.out.println("-----------Passenger details Unknown-----------");
        }
        else{
            booker.cancelTicket(id);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n\n\n\t\t\tWelcome to Railway(IRCTC) Ticket Booking App \n\t\t\tChoose Any One : \n\t\t\t1. Ticket Booking \n\t\t\t2. Cancel Ticket \n\t\t\t3. Available Tickets \n\t\t\t4. Booked Tickets \n\t\t\t5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    {
                        System.out.println("Enter the Passenger Name, Age and Berth Perference(L, M, U)");   
                        System.out.print("Enter the Passenger Name : ");                       
                        String name = sc.next();
                        System.out.print("Enter the Passenger Age : ");  
                        int age = sc.nextInt();
                        System.out.print("Enter the Passenger Berth Perference(L, M, U) : ");  
                        String berthPerference = sc.next();
                        Passenger p = new Passenger(name,age,berthPerference);
                        bookTicket(p);
                    }
                    break;

                case 2:
                    {
                        System.out.println("Enter the Passenger Id to Cancel :");
                        int id = sc.nextInt();
                        cancelTicket(id);
                    }
                    break;

                case 3:
                    {
                        TicketBooker booker = new TicketBooker();
                        booker.availableTickets();
                    }
                    break;

                case 4:
                    {
                        TicketBooker booker = new TicketBooker();
                        booker.printPassengerDetails();
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid Number");
                    break;
            }            
        }
    }
}

