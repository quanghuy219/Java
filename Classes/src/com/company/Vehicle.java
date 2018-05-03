package com.company;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle( String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer( int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degree.");
    }

    public void move(int speed) {
        this.currentVelocity = speed;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
