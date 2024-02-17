package rapido;

public class BookingDetails extends  CarDeatails {
    private int otp;
    private   String auto;
    private   String bike;
    private   int noOfPersons;
    private   CarDeatails carDeatails;
    public BookingDetails(String auto, String bike, int noOfPersons,int otp,CarDeatails carDeatails) {
        super(carDeatails.getCartype(), carDeatails.getCarPrice());
        this.auto = auto;
        this.bike = bike;
        this.carDeatails = carDeatails;
        this.noOfPersons = noOfPersons;
        this.otp=otp;
    }
    public BookingDetails(String auto, String bike, int noOfPersons,int otp) {
        this(auto,bike,noOfPersons,otp,new CarDeatails());
    }


    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public CarDeatails getCarDeatails() {
        return carDeatails;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }
    public int getOtp() {
        return otp;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", carDeatails=" + carDeatails +
                ", noOfPersons=" + noOfPersons +
                '}';
    }
}