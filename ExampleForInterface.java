import java.utilscanner
interface FirstCalculator
{
void add();
void sub();
}
class MyCalculator1 implements Calculator
{
void add()
{
int number1=20;
int number2=30;
int sum=number1+number2;
System.out.println("the sum is:"+sum);
}
void sub()
{
int number1=20;
int number2=30;
int diff=number1-number2;
System.out.println("the different is:"+diff);
}
}
class Mycalculator2 implements Calculator
{
public void add()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1=s.nextInt();
System.out.println("Enter the second number:");
int number2=s.nextInt();
int add=number1+number2;
System.out.println("the sum is:+sum);
}
public void sub()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1=s.nextInt();
System.out.println("Enter the second number:");
int number2=s.nextInt();
int sub=number1-number2;
System.out.println("the different is:+sub);
}
}
public class ExampleForInterface1
{
public static void main(String args[])
{
MyCalculator n1=new MyCalculator();
MyCalculator2 n2=new MyCalculator2();
n1=add();
n1=sub();
n2=add();
n2=sub();
}
}



