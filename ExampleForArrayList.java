import java.util.ArrayList;

class Student {
    private String name;
    private int age;

        Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class ExampleForArrayList {
    public static void main(String args[]) {

        Student s1 = new Student("Sushmitha", 20);
        Student s2 = new Student("Somu", 22);

        ArrayList<Student> al = new ArrayList<>();

        al.add(s1);
        al.add(s2);

        for (Student i : al) {
            System.out.println(i.getName() + " " + i.getAge());
        }
    }
}
