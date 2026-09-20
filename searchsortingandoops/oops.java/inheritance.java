public class inheritance {
    
    public static void main(String[] args) {
        Laptop pc1 = new Laptop();
        GamingLaptop laptop = new GamingLaptop();
        Desktop desktop = new Desktop();
        laptop.start();
        laptop.showBattery();
        laptop.showgaming();
        desktop.start();
        desktop.showProcessor();
    }  
}

class Computer {
    void start() {
        System.out.println("Computer is starting...");

    }
}

class Laptop extends Computer {
    void showBattery () {
        System.out.println("Show battery percentage");
        System.out.println("Playing games");
    }
}

class Desktop extends Computer {
    void showProcessor() {
        System.out.println("Showing Processor");
    }
}


class GamingLaptop extends Laptop {
    void showgaming() {
        System.out.println("Gaming Laptop");
    }
}