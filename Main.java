class Restaurant {
    private boolean orderPlaced = false;
    private boolean foodReady = false;

    synchronized void placeOrder(String orderName) {
        System.out.println("Customer placed order: " + orderName);
        orderPlaced = true;
        notifyAll();
    }

    synchronized void cookOrder() {
        while (!orderPlaced) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Cook is preparing food...");
        foodReady = true;
        notifyAll();
    }

    synchronized void serveFood() {
        while (!foodReady) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Waiter served the food to customer");
    }
}

class Customer extends Thread {
    Restaurant r;
    Customer(Restaurant r) {
        this.r = r;
    }
    public void run() {
        r.placeOrder("Pizza");
    }
}

class Cook extends Thread {
    Restaurant r;
    Cook(Restaurant r) {
        this.r = r;
    }
    public void run() {
        r.cookOrder();
    }
}

class Waiter extends Thread {
    Restaurant r;
    Waiter(Restaurant r) {
        this.r = r;
    }
    public void run() {
        r.serveFood();
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Customer c = new Customer(r);
        Cook cook = new Cook(r);
        Waiter w = new Waiter(r);

        c.start();
        cook.start();
        w.start();
    }
}