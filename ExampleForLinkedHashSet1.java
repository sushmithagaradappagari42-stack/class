import java.util.*;

class Student {
    private String rollNo;
    private String name;
    private String email;

    public Student(String rollNo, String name, String email) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + "]";
    }
}

public class ExampleForLinkedHashSet1 {
    public static void main(String args[]) {
        Student s1 = new Student("111", "Sushmitha", "Sushmitha@1357.com");
        Student s2 = new Student("121", "Somu", "Somu@1357.com");

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);

        for (Student i : lhs) {
            System.out.println(i);
        }
    }
}
