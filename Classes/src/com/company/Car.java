package com.company;

public class Car extends Vehicle{
    private int geers;
    private int doors;
    private int wheels;
    private boolean isManual;
    private int currentGeer;

   public Car(String name, String size, int wheels, int doors, int geers, boolean isManual) {
       super(name, size);
       this.wheels = wheels;
       this.doors = doors;
       this.geers = geers;
       this.isManual = isManual;
       this.currentGeer = 1;
   }

   public void changeGeer(int currentGeer) {
       this.currentGeer = currentGeer;
       System.out.println("Car.setCurrentGeer() called: Change to " + this.currentGeer + " geer.");
   }

   public void changeVelocity(int velocity) {

   }
}
