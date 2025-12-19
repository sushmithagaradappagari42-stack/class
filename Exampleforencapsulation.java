class Student {
    private String rollno;
    private String name;
    private String email;
    private int age;

    public void setData(String x, String y, String z, int a) {
        rollno = x;
        name = y;
        email = z;
        age = a;
    }

    public String getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}

public class ExampleForEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("A101", "Sushmitha", "sushmitha@gmail.com", 21);

        System.out.println("The Student rollno: " + s.getRollno());
        System.out.println("The Student name: " + s.getName());
        System.out.println("The Student email: " + s.getEmail());
        System.out.println("The Student age: " + s.getAge());
    }
}
