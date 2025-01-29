public class Main
{
    public static void main(String[] args) 
    {
        NestedClasses nc = new NestedClasses();
        NestedClasses.InnerStatic is = new NestedClasses.InnerStatic();
        System.out.println(is.getDummy());
    }
}
