import java.util.Vector;

public class ExampleForVector {
    public static void main(String args[]) {

        Vector v = new Vector();
        v.add(10);
        v.add("java script");
        v.add(30);
        v.add("java");

        System.out.println(v);
        System.out.println("-------------");
        System.out.println(v.get(2));
        System.out.println("-------------");
        System.out.println(v.isEmpty());
        System.out.println("-------------");
        System.out.println(v.contains(2));
        System.out.println("-------------");
        System.out.println(v.size());

        for (Object i : v) {
            System.out.println(i);
        }

        System.out.println("-------------");

        Vector<String> v1 = new Vector<String>();
        v1.add("python");
        v1.add("java script");
        v1.add("sql");
        v1.add("java");

        System.out.println(v1);
    }
}
