import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;
    private double gpa;

    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Syed Muzaffar", 37.5));
        students.add(new Student("Shah Asifa", 38.9));
        students.add(new Student("Qurat ul Ain", 36.2));
        students.add(new Student("Khair un nazar", 36.2));


        students.sort((a,b) -> {
            if(b.getGpa() - a.getGpa() > 0)
            {
                return 1;
            } else if(b.getGpa() - a.getGpa() < 0)
            {
                return -1;
            } else {

                return b.getName().compareTo(a.getName());
            }

        });

/*
        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparing);
*/
        for(Student s : students)
        {
            System.out.println(s.getName() + " " + s.getGpa());
        }

    }
}
