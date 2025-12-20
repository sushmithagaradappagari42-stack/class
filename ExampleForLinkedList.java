import java .util.*;
public class ExampleForLinkedList
{
public static void main(String args[])
{
LinkedList<Object> l=new LinkedList<Object>();
l.add("java");
l.add(10);
l.add(35.5);
l.add(23);
l.add(null);
System.out.println("the list:"+l);
for(Object i:l)
{
System.out.println(i);
}
System.out.println(l.get(0));
System.out.println(l.isEmpty());
System.out.println("----------------");
LinkedList<Object> ll=new LinkedList<Object>();
ll.add(10);
ll.add(34.7);
ll.add("python");
ll.add("java");
System.out.println("The LinkedList:"+ll);
for(Object i:ll)
{
System.out.println(i);
}
}
}
