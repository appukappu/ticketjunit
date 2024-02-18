package methodoverriding;

public class MethodOverrideTest {
   public static void main(String[] args) {
        PhonePaySerivce phonePaySerivce = new PhonePaySerivce();
        phonePaySerivce.transfer("987654","123456",100);
        phonePaySerivce.transfer("987654","123456",100);
        phonePaySerivce.transfer("987654","123456",100);
                System.out.println(" To account Amount ="+phonePaySerivce.toAccountAmt);
                System.out.println(" from account Amount ="+phonePaySerivce.fromAccountAmt);
                BankAccountSerivce bankAccountSerivce = new BankAccountSerivce();
                bankAccountSerivce.transfer("987654","123456",100);
                BankAccountSerivce bankAccountSerivceUpcast = new PhonePaySerivce();
       bankAccountSerivceUpcast.transfer("987654","123456",100);
    }
}
