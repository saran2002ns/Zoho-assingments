package Assigment_Class_Object;

import java.time.LocalDateTime;

public class Q3_Flight {
    private int flightNumber;
     private String airline;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double price;

    private static int flightCount = 0;

    public Q3_Flight(int flightNumber, String airline, String destination, 
        String departureTime, String arrivalTime, double price) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        flightCount++;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }


    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public static int getFlightCount() {
        return flightCount;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args) {
        Q3_Flight flight1=new Q3_Flight(122, "fu-hu", "Delhi","12.45","14.50",4500);
        Q3_Flight flight2=new Q3_Flight(144, "hu-fu", "Chennai","10.25","11.35",2500);
    }
}

