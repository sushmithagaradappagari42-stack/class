import java.util.*;

public class ExampleForHashMap {
    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(10, "Ten");
        hm.put(30, "Thirty");
        hm.put(20, "Twenty");
        hm.put(40, "Forty");

        System.out.println(hm);
        System.out.println("------------------------");

               for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("-------------------------");
        System.out.println("Removed: " + hm.remove(30));

        System.out.println("-------------------------");
        System.out.println(hm);
    }
}
