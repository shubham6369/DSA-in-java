public class abstraction {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay();
    }
}
abstract class Payment {
   abstract void pay();
}
class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Paying through credit card");
    }
} 

interface Device {
    void switchOn();
    void switchoff();
}

class Mobile implements Device {
    @Override
    public void switchOn() {
        System.out.println("Mobile  switch on");
    }

    @Override
    public void switchoff() {
        System.out.println("Mobile switch off");
    }
}