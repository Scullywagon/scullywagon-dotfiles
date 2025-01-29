import java.util.ArrayList;

public class Main 
{
    /*
    Topics:
    - Functors
    - Lambdas
    - Nested Classes
    - Enum Types 
    */    

    public static void main(String[] args)
    {
    }

    public static void SelectStudentAgeInterface()
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Mark", 20));
        students.add(new Student("Anna", 22));
        students.add(new Student("John", 19));
        students.add(new Student("Emma", 21));
        students.add(new Student("Lucas", 23));

        SelectStudentAge selector = new SelectStudentAge(21);
    }
}
