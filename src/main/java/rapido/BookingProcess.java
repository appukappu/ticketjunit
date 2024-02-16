package rapido;

public class BookingProcess {
    public BookingDetails rapidoBooking(BookingDetails bookingDetails) {
        if (bookingDetails.getNoOfPersons() <= 1) {
            bookingDetails.getBike();
            System.out.println("You successfuly booked"+bookingDetails.getBike());
        }
        if (bookingDetails.getNoOfPersons() <= 2) {
            bookingDetails.getCar();
            System.out.println("You successfuly booked"+bookingDetails.getCar());
        }
        if (bookingDetails.getNoOfPersons() <= 3) {
            bookingDetails.getAuto();
            System.out.println("You successfuly booked"+bookingDetails.getAuto());
        }
return bookingDetails;
    }
    public BookingDetails rapidoBooking(BookingDetails bookingDetails ,String name) {
        if(bookingDetails.getName().equals(name)){
            System.out.println("Your otp is 1234");
        }

        if (bookingDetails.getNoOfPersons() <= 1) {
            bookingDetails.getBike();
            System.out.println("You successfuly booked"+bookingDetails.getBike());
        }
        if (bookingDetails.getNoOfPersons() <= 2) {
            bookingDetails.getCar();
            System.out.println("You successfuly boked"+bookingDetails.getCar());
        }
        if (bookingDetails.getNoOfPersons() <= 3) {
            bookingDetails.getAuto();
            System.out.println("You successfuly booked"+bookingDetails.getAuto());
        }

        return  bookingDetails;
    }


    public static void main(String[] args) {
        BookingProcess bookingProcess = new BookingProcess();
        CarDetails carDetails = new CarDetails();
        BookingDetails bookingDetails = new BookingDetails("KTM","BMW","EV",2,carDetails,"Appu");
        System.out.println(bookingProcess.rapidoBooking(bookingDetails,"sri"));
    }
}
