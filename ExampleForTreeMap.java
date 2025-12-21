import java.util.TreeMap;

public class ExampleForTreeMap 
{
    public static void main(String args[]) 
    {
        TreeMap<String, String> tm = new TreeMap<>();

        tm.put("Name", "sushmitha");
        tm.put("Age", "20");
        tm.put("Email", "sushmitha@123.com");

        System.out.println(tm);
        System.out.println("---------------------");

        for (String obj : tm.keySet())
        {
            System.out.println(obj);
        }

        System.out.println("---------------------");

        for (String obj : tm.values())
        {
            System.out.println(obj);
        }
    }
}
