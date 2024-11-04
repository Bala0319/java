package bookingSystem;

public class Passenger {
    static int id = 1;
    String name;
    int age;
    String berthPerference;
    int passengerId;
    String alloted;
    int number;

    public Passenger(String name, int age, String berthPerference){
        this.name = name;
        this.age = age;
        this.berthPerference = berthPerference;
        this.passengerId = id++;
        alloted = "";
        number = -1;
    }

}
