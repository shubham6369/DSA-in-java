public class polymorphism {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 10 and 12: " + new polymorphism().add(10, 12));
        System.out.println("Sum of 5.5 and 10.5: " + new polymorphism().add(5.5, 10.5));
        System.out.println("Sum of 5, 10, and 6: " + new polymorphism().add(5, 10, 6));
    }
}
class Payment {
    void Pay() {
        System.out.println("Making Payment...");
    }
}

class CreditCardPayment extends Payment{
    @Override
    void Pay() {
        System.out.println("Making Payment using through credit card...");
    }
}
  
 class Upi extends Payment {
    @Override
    void Pay() {
        System.out.println("Making Payment using UPI...");
    }
 }