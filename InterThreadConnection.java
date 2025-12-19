class Restaurant
{
    String orderName;

    synchronized void foodOrder()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " customer has ordered " + orderName);
        try
        {
            wait();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(name + " food is delivered to the customer");
    }

    synchronized void cookedFood()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " chef has received the order " + orderName);
        System.out.println(name + " cook is under progress " + orderName);
        try
        {
            wait();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(name + " chef is preparing food...");
        notifyAll();
    }

    synchronized void receivedOrder(String orderName)
    {
        this.orderName = orderName;
        String name = Thread.currentThread().getName();
        System.out.println(name + " customer is choosing an order........");
        notifyAll();
    }
}

public class InterThreadConnection
{
    public static void main(String args[])
    {
        Restaurant r = new Restaurant();
        String orderName = "Biriyani";

        Thread t1 = new Thread("Customer")
        {
            public void run()
            {
                r.receivedOrder(orderName);
            }
        };

        Thread t2 = new Thread("Cook")
        {
            public void run()
            {
                r.cookedFood();
            }
        };

        Thread t3 = new Thread("Waiter")
        {
            public void run()
            {
                r.foodOrder();
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}
