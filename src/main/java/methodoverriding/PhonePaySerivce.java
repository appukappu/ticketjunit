package methodoverriding;

public class PhonePaySerivce extends BankAccountSerivce{

    public boolean transfer(String fromMobileNum,String toMobileNum,int amount){
        System.out.println("From Sub Class PhonePaySerivce");
        return super.transfer(fromMobileNum,toMobileNum,amount);
    }






}
