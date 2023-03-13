package prog2.exercise4.flight.booking.system;
import java.util.Random;
import java.time.LocalDate;
import java.util.Date;

public class FlightBooking {
    private String PassengerFullName;
    private LocalDate DepartingDate;
    private LocalDate returnDate;
    private int ChildrenPassengers;
    private int AdultPassengers;
    private String FlightCompany="China Eastern Air Holding Company";
    private int TotalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String TicketNumber;
    private TripType tripType;
    private int TripDate;
    private BookingClass bookingClass;
    private TripSource tripSource;
    private TripDestination tripDestination;
    private String sourceAirport;
    private String destinationAirport;

    public void setDepartureDate(LocalDate date1)
    {
        this.DepartingDate=date1;
    }

    /*public void setReturnDate(LocalDate returnDate)
    {
        this.returnDate=returnDate;
    }*/
    enum BookingClass {
        FIRST, BUSINESS, ECONOMY;
    }
    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
    }
    enum TripType{
        ONE_WAY,RETURN;
    }
    enum TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }
    public void setBookingClass(String i)
    {
        if (i == "1")
        {
            bookingClass = BookingClass.FIRST;
        }
        if (i == "2")
        {
            bookingClass = BookingClass.BUSINESS;
        }
        if (i == "3")
        {
            bookingClass = BookingClass.ECONOMY;
        }
    }
    public BookingClass getBookingClass() {
        return bookingClass;
    }
    public String getsourceAirport(){
        return sourceAirport;
    }
    public void setTripSource(String i) {
        if (i == "1")
        {
            tripSource = TripSource.NANJING;
            sourceAirport = "Nanjing Lukou International Airport";
        }
        if (i == "2")
        {
            tripSource = TripSource.BEIJING;
            sourceAirport = "Beijing Capital International Airport";
        }
        if (i =="3")
        {
            tripSource = TripSource.SHANGHAI;
            sourceAirport = "Shanghai Pudong International Airport";
        }
        if (i =="4")
        {
            tripSource = TripSource.OULU;
            sourceAirport = "Oulu Airport";
        }
    }
    public TripSource getTripSource() {
        return tripSource;
    }

    public void setTripType(String i){
        if (i == "1")
        {
            tripType = TripType.ONE_WAY;
        }
        if (i == "2")
        {
            tripType = TripType.RETURN;
        }
    }
    public TripType getTripType() {
        return tripType;
    }
    
    public void setTripDestination(String i, String j){
        if (i == "1")
        {
            tripDestination = TripDestination.NANJING;
            destinationAirport = "Nanjing Lukou International Airport";
        }
        if (i == "2")
        {
            tripDestination = TripDestination.BEIJING;
            destinationAirport = "Beijing Capital International Airport";
        }
        if (i == "3")
        {
            tripDestination = TripDestination.SHANGHAI;
            destinationAirport = "Shanghai Pudong International Airport";
        }
        if (i == "4")
        {
            tripDestination = TripDestination.OULU;
            destinationAirport = "Oulu Airport";
        }
    }
    public TripDestination gettripDestination(){
        
        return tripDestination;
    }

    public void setTotalTicketPrice() {
        totalTicketPrice = Math.abs((((2 *((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
    }
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setDepartingTicketPrice(int i, int j) {

    }
    public double getdepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice() {

    }
    public double getreturnTicketPrice() {
        return returnTicketPrice;
    }


    FlightBooking(String a,LocalDate b,LocalDate c,int d,int e)
{
    PassengerFullName = a;
    DepartingDate = b;
    returnDate = c;
    ChildrenPassengers = d;
    AdultPassengers = e;
}
    
public void setPassengerFullName(String m){
    PassengerFullName = m;
}
    public String getPassengerFullName(){
    return PassengerFullName;
}
    public void setChildrenPassengers(int n){
    ChildrenPassengers = n;
}
    public int getChildrenPassengers(){
    return ChildrenPassengers;
}
    public void setAdultPassengers(int z){
    AdultPassengers = z;
}
    public int getAdultPassengers(){
    return AdultPassengers;
}
    public LocalDate getDepartingDate(){
    return DepartingDate;
}
    public LocalDate getReturnDate(){
    return returnDate;
 }

  public void setTotalPassengers(int e,int w){
    TotalPassengers = e + w;
}
 public int getTotalPassengers(){
    return TotalPassengers;
 }
 
public String getFlightCompany(){
    return FlightCompany;
}



 




public String toString(){
    return "Dear " + PassengerFullName + ". Thank you for booking your flight with " + 
    FlightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
    "Ticket Number: " + TicketNumber + "\n" + 
    "From " + tripSource + " to " + tripDestination + "\n" +
    "Date of departure: " + DepartingDate + "\n" +
    "Date of return: " + returnDate + "\n" +
    "Total passengers: " + TotalPassengers + "\n" +
    "Total ticket price in Euros: " + totalTicketPrice;
}

Random random = new Random();
public void setTicketNumber() {
    String ticketNumber = null;
    switch (tripType) {
        case ONE_WAY:
            ticketNumber = "11";
            break;
        case RETURN:
            ticketNumber = "22";
            break;
    }
    switch (bookingClass) {
        case FIRST:
            ticketNumber = ticketNumber + "F";
            break;
        case BUSINESS:
            ticketNumber = ticketNumber + "B";
            break;
        case ECONOMY:
            ticketNumber = ticketNumber + "E";
            break;
    }
    for (int i = 0; i < 4; i++) {
        char f = (char) ((random.nextInt(26) + 65));
        ticketNumber = ticketNumber + f;
    }
    this.TicketNumber = ticketNumber + "DOM";
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
        this.TicketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.TicketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
        this.TicketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
        this.TicketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.TicketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
        this.TicketNumber = ticketNumber + "INT";
    }    
     
}

public String getTicketNumber() {
    return "11FASDFDOM";
}

    public void setDepartingDate(LocalDate departingDate)
     {
    
        String sdepart = "2023-03-04";
        this.DepartingDate = LocalDate.parse(sdepart);
    }


    public void setReturnDate(LocalDate returnDate)
    {
 
        String sreturn = "2023-03-05";
        this.returnDate = this.DepartingDate.plusDays(2);//departingDate.plusDays(2);

        long i = DepartingDate.toEpochDay() - returnDate.toEpochDay();
        if (i >= 0 && i < 1) {
            this.returnDate = DepartingDate.plusDays(2);
        } else if (i >= 1 && i < 2) {
            this.returnDate = DepartingDate.plusDays(1);
        }
    }







}



