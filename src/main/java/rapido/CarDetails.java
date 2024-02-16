package rapido;

public class CarDetails {

    private String type;
    private String rideprice;

    public CarDetails(){
        type = "BMW";
        rideprice = "2000";
    }

    public CarDetails(String type, String rideprice) {
        this.type = type;
        this.rideprice = rideprice;
    }

    public String getType() {
        return type;
    }

    public String getRideprice() {
        return rideprice;
    }
    @Override
    public String toString() {
        return "CarDetails{" +
                "type='" + type + '\'' +
                ", rideprice='" + rideprice + '\'' +
                '}';
    }
}
