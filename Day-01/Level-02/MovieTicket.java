import java.util.*;

class MovieTicket {
    String movieName;
    int  seatNumber;
    double price;
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public void BookTicket(){

        double gst= price* (28/100);
        double updated_price=gst+price;
    }
    public void display(){
        System.out.println("------Ticket Booked!------");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String movieName=input.nextLine();
        System.out.println("Enter price: ");
        double price=input.nextDouble();
        //double seatNumber=1+ (Math.random() * 101);
        MovieTicket m=new MovieTicket(movieName,(int)(1+ (Math.random() * 101)),price);
        m.BookTicket();
        m.display();
    }
}
