class Printer implements Runnable
{
public void run()
{
String name=Thread.currentThread().getName();
System.out.println(name+"printing started");
for(int i=1;i<=5;i++)
{
System.out.println(name+"is printing");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println("some problem is occurred");
}
}
System.out.println(name+"completed the printing");
}
}
public class DisadvantagesOfMultiThreading
{
public static void main(String args[])
{
Printer p=new Printer();
Thread t1=new Thread(p);
Thread t2=new Thread(p);
Thread t3=new Thread(p);
t1.setName("Sushmitha");
t1.setName("jyoo");
t1.setName("Sree");

t1.start();
t2.start();
t3.start();
}
}

