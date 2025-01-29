import java.io.Serializable;
import java.util.ArrayList;

public class Module implements Serializable
{
	ArrayList<Student> students = new ArrayList<>();	
	int numStudents = 0;

	public Module()
	{
		students.add(new Student("Alice", "Mathematics", 1));
		students.add(new Student("Bob", "Physics", 2));
		students.add(new Student("Charlie", "Chemistry", 3));
		numStudents = students.size();
		System.out.println(numStudents);
	}
}
