class Demo
{
public void run()
{
int sum=0;
for(int i=0;i<=10;i++)
{
sum=sum+i;
}
double average=sum/10.0;
System.out.println("Average of first ten numbers="+average);
}
}
class Demo2 extends Thread
{
int[] arr={1,20,50,15,30};
public void num()
{
System.out.println("Square of the numbers in th array:");
for(int num:arr)
{
System.out.println(num+"->"+(num*num));
}
}
}
public class Square
{
public static void main(String args[])
{
Demo d=new Demo();
d.run();
Demo d2=new Demo();
d2.run();
}
}



