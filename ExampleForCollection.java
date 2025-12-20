import java.util.List;
import java.util.ArrayList;
public class ExampleForCollection{
public static void main(String args[])
{
List<Integer> l=new ArrayList<Integer>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
for(Object i:l)
{
System.out.println(i);
}
System.out.println("------------");
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(25);
al.add(30);
al.add(70);
System.out.println("ArrayList:"+al);
for(Object i:al)
{
System.out.println(i);
}
}
}
