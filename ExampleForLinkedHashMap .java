import java.util.Map;
public class ExampleForLinkedHashMap 
{
public static void main(String args[]) 
{
LinkedHashMap<String> lhm=new LinkedHashMap<String>();
lhm.put("Name","AIML");
lhm.put("Age","4");
System.out.println(lhm);
System.out.println("--------------");
System.out.println(get(0));
System.out.println("--------------");
for(Object i:lhm.keyset())
{
System.out.println(i);
}
System.out.println("---------------");
for(Object i:lhm.enterset())
{
System.out.println(i);
}
System.out.println("---------------");
}
}


