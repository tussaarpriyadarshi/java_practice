class Vehicle{
    public void displaySpeed(){
        System.out.println("vehicle speed is unknown");
    }
}
class Car extends Vehicle{
    @Override
    public void displaySpeed(){
        System.out.println("Car speed 120km/h");
    }

}
class Bike extends Vehicle{
    @Override
    public void displaySpeed(){
        System.out.println("Bike speed 80 km/h");
    }

}


public class vehiclespeed {
    public static void main(String[] args){
        Vehicle v;
        v=new Car();
        v.displaySpeed();
    }
    
}
