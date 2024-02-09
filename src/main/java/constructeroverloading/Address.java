package constructeroverloading;



public class Address {
    public String city;
    public String state;
    public String country;
    public String pincode;

    public Address(){
        city="hyd";
        pincode="521109";
        state="TS";
        country="India";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", contry='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}