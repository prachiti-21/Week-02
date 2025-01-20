public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    //default constructor
    HotelBooking(){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    //parameterized constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    //copy constructor
    HotelBooking(HotelBooking previousBooking){
        this.guestName=previousBooking.guestName;
        this.roomType=previousBooking.roomType;
        this.nights=previousBooking.nights;
    }
    public static void main(String args[]){
        //object of parameterized constructor
        HotelBooking hb1=new HotelBooking("John","Suite",3);

        //object of default constructor
        HotelBooking hb2=new HotelBooking();

        //object of copy constructor
        HotelBooking hb3=new HotelBooking(hb1); //passing object hb1
        System.out.println("Guest name: "+hb1.guestName);
        System.out.println("Room type: "+hb1.roomType);
        System.out.println("Nights: "+hb1.nights);
        System.out.println("Cloned :"+hb3.guestName+" "+hb3.roomType+" "+hb3.nights);
    }

}
