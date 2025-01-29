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
        SelectCarBMWLambda();
    }

    // Exercise 1 -- links to SelectStudent and and Select
    // Example of functors in java
    public static void SelectStudentAgeInterface()
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Mark", 20));
        students.add(new Student("Anna", 22));
        students.add(new Student("John", 19));
        students.add(new Student("Emma", 21));
        students.add(new Student("Lucas", 23));

        SelectStudentAge selector = new SelectStudentAge(21);
        for (Student s : students)
        {
            System.out.println(selector.Select(s));
        }
    }


    // Exercise 2 -- Lambda function for the same method as ex1
    public static void SelectStudentAgeLambda()
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Mark", 20));
        students.add(new Student("Anna", 22));
        students.add(new Student("John", 19));
        students.add(new Student("Emma", 21));
        students.add(new Student("Lucas", 23));

        for (Student s : students)
        {
            System.out.println(aged21.Select(s));
        }
    }
            
    static Select<Student> aged21 = (Student student) -> student.getAge() == 21;


    // Excercise 3 --  Lambda function for selecting a car
    public static void SelectCarBMWLambda()
    {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 4));
        cars.add(new Car("Audi", 2));
        cars.add(new Car("Mercedes", 4));
        cars.add(new Car("Toyota", 4));
        cars.add(new Car("Honda", 2));

        for (Car c : cars)
        {
            System.out.println(isBMW.Select(c));
        }
    }

    static Select<Car> isBMW = (Car car) -> "BMW".equals(car.getMake());

    // Excercise 4 -- Nested Classes and Musician
    public static void PrintMusicianInfo()
    {
        Musician musician = new Musician("Guitar", )
    }

}
