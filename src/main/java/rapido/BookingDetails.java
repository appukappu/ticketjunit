package rapido;

public class BookingDetails {
    private String bike;
    private String car;
    private String auto;
    private int noOfPersons;
     private CarDetails carDetails;
     private String name;

    public BookingDetails(String bike, String car, String auto, int noOfPersons, CarDetails carDetails,String name) {
        this.bike = bike;
        this.car = car;
        this.auto = auto;
        this.noOfPersons=noOfPersons;
        this.name=name;
        this.carDetails = carDetails;
    }

    public String getBike() {

        return bike;
    }

    public String getCar() {
        return car;
    }

    public String getAuto() {
        return auto;
    }

    public int getNoOfPersons() {

        return noOfPersons;
    }

    public CarDetails getCarDetails() {

        return carDetails;
    }

    public String getName() {
        return name;
    }
}

