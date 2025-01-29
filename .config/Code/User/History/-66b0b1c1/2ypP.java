public class SelectStudentAge implements Select
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
        return false;
    }

    
}
