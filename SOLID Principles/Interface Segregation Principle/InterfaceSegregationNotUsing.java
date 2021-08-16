package com.keyword;

interface Features
{
    void price();
    void type();
    void color();
    void fuelType();
    void fly();

}

class car implements Features
{
    public void price()
    {
        System.out.println("Price : 3,00,000");
    }
    public void type()
    {
        System.out.println("Type : Car");
    }
    public void color()
    {
        System.out.println("Color : White");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
    public void fly()
    {
        System.out.println("Fly : No");
    }
}
class bike implements Features
{
    public void price()
    {
        System.out.println("Price : 50,000");
    }
    public void type()
    {
        System.out.println("Type : Bike");
    }
    public void color()
    {
        System.out.println("Color : Red");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
    public void fly()
    {
        System.out.println("Fly : No");
    }
}

class Scooter implements Features
{
    public void price()
    {
        System.out.println("Price : 35,000");
    }
    public void type()
    {
        System.out.println("Type : Scooter");
    }
    public void color()
    {
        System.out.println("Color : Blue");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
    public void fly()
    {
        System.out.println("Fly : No");
    }
}

class Helicopter implements Features
{
    public void price()
    {
        System.out.println("Price : 2 Crores");
    }
    public void type()
    {
        System.out.println("Type : Helicopter");
    }
    public void color()
    {
        System.out.println("Color : Black");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Aviation Kerosene");
    }
    public void fly()
    {
        System.out.println("Fly : Yes");
    }
}

class Aeroplane implements Features
{
    public void price()
    {
        System.out.println("Price : 8400 Crores");
    }
    public void type()
    {
        System.out.println("Type : Aeroplane");
    }
    public void color()
    {
        System.out.println("Color : White");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Aviation Kerosene");
    }
    public void fly()
    {
        System.out.println("Fly : Yes");
    }
}

public class InterfaceSegregationNotUsing
{
    public static void main(String[] args)
    {
        car cars = new car();
        bike bikes = new bike();
        Scooter scooter = new Scooter();
        Helicopter copter = new Helicopter();
        Aeroplane aeroplane = new Aeroplane();
        System.out.println("Cars :");
        cars.price();
        cars.type();
        cars.color();
        cars.fuelType();
        cars.fly();
        System.out.println("------------------------------------------");
        System.out.println("Bikes :");
        bikes.price();
        bikes.type();
        bikes.color();
        bikes.fuelType();
        bikes.fly();
        System.out.println("------------------------------------------");
        System.out.println("Scooter :");
        scooter.price();
        scooter.type();
        scooter.color();
        scooter.fuelType();
        scooter.fly();
        System.out.println("------------------------------------------");
        System.out.println("Helicopter :");
        copter.price();
        copter.type();
        copter.color();
        copter.fuelType();
        copter.fly();
        System.out.println("------------------------------------------");
        System.out.println("Aeroplane :");
        aeroplane.price();
        aeroplane.type();
        aeroplane.color();
        aeroplane.fuelType();
        aeroplane.fly();
        System.out.println("------------------------------------------");
    }
}
