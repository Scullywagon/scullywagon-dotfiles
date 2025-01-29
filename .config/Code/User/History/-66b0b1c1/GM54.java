public class SelectStudentAge implements Select<Student>
{
    int ageTest;

    public SelectStudentAge(int a)
    {
        ageTest = a;
    }

    public int getAgeTest()
    {
        return ageTest;
    }

    public void setAgeTest(int a)
    {
        ageTest = a;
    }

    @Override
    public boolean Select(Student s)
    {
        if (s.getAge() == ageTest)
        {
            return true;
        }
        return false;
    }

    
}
