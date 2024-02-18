package methodoverriding;

public class BankAccountSerivce {
    int fromAccountAmt=0;
    int toAccountAmt=0;
    String fromAccount=null;
    String toAccount=null;

    public boolean login(String username,String password){
       return true;
   }
    public boolean transfer(String fromMobileNum,String toMobileNum,int amount){
        System.out.println("From Super Class BankAccountSerivce");
        if(fromMobileNum.equals("987654")){
            fromAccount="1111";
        }
        if(toMobileNum.equals("123456")){
            toAccount="2222";
        }
        return  this.bookTransfer(fromAccount,toAccount,amount);
    }
    public boolean bookTransfer(String fromAccount,String toAccount,int amount){
        toAccountAmt=toAccountAmt+amount;
        fromAccountAmt=fromAccountAmt-amount;
        return true;
    }
}
