package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import prog2.exercise4.flight.booking.system.FlightBooking.TripDestination;
import prog2.exercise4.flight.booking.system.FlightBooking.TripSource;

import java.time.LocalDate;

public class Main 
{
    public static void main( String[] args )
    {
    String DepartingDate="2023-03-12";
    LocalDate depart = LocalDate.parse(DepartingDate);
    String sreturn = "2023-03-14";
    LocalDate returnDate = LocalDate.parse(sreturn);
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter your name");
    String k = input.nextLine();
    System.out.println("Please enter the number of child passengers");
    int b = input.nextInt();
    System.out.println("Please enter the number of adult passengers");
    int a = input.nextInt();
    System.out.println("Please pick your choice of class: 1.First 2.Business 3.Economy");
    int u = input.nextInt();
    System.out.println("Please choose your trip type: 1.One way 2.Return");
    int d = input.nextInt();
    System.out.println("Please choose your trip source: 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
    int j = input.nextInt();
    System.out.println("Please choose your trip destination:1.Nanjing 2. Beijing 3.Oulu 4.Helsinki");
    int q = input.nextInt();


    FlightBooking fb = new FlightBooking("null", depart, returnDate, 2, 3);
    fb.setPassengerFullName(k);
    String passengerFullname = fb.getPassengerFullName();
    fb.setChildrenPassengers(b);
    int ChildrenPassengers = fb.getChildrenPassengers();
    fb.setAdultPassengers(a);
    int AdultPassengers = fb.getAdultPassengers();
    fb.setTotalPassengers(AdultPassengers , ChildrenPassengers);
    int totalPassengers = fb.getTotalPassengers();
     
   
 
    String ticketNumber = fb.getTicketNumber();
    double TotalTicketPrice = fb.getTotalTicketPrice();
    double returnTicketPrice = fb.getreturnTicketPrice();
    double departingTicketPrice = fb.getTotalTicketPrice();
    String TripDestination = fb.gettripDestination().toString();
    String sourceAirport = fb.getsourceAirport();
    String tripSource=fb.getTripSource().toString();
    System.out.println(tripSource);
    String FlightCompany = fb.getFlightCompany();
     
     




    System.out.println("Dear " + passengerFullname + ". Thank you for booking your flight with " + 
    fb.getFlightCompany() + ". Following are the details of your booking and the trip:" + "\n" + 
    "Ticket Number: " + fb.getTicketNumber() + "\n" + 
    "From " + fb.getTripSource() + " to " + fb.gettripDestination() + "\n" +
    "Date of departure: " + fb.getDepartingDate() + "\n" +
    "Date of return: " + fb.getReturnDate() + "\n" +
    "Total passengers: " + fb.getTotalPassengers() + "\n" +
    "Total ticket price in Euros: " + fb.getTotalTicketPrice());
}

    }


     

