package accessSpecifiers;

import mobile.PinNumber;

public class MobilePassword extends PinNumber {

    private String name;
    private String username;
    private String password;

    public MobilePassword(String name, String username, String password,int lock,String facelock) {
        super(lock,facelock);
        this.name = name;
        this.username = username;
        this.password = password;

    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "MobilePassword{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", lock=" + lock +
                ", facelock='" + facelock + '\'' +
                '}';
    }
}


