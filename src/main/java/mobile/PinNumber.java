package mobile;

public class PinNumber {
    protected int lock;
    protected String facelock;

    public PinNumber(int lock,String facelock) {
        this.lock = lock;
        this.facelock=facelock;
    }

   /*@Override
    public String toString() {
        return "PinNumber{" +
                "lock=" + lock +
                '}';
    }*/
}
