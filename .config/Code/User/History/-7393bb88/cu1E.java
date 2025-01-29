public class Main
{
    public static void main(String[] args) 
    {
        NestedClasses.InnerStatic is = new NestedClasses.InnerStatic();
        System.out.println("Static Nested:");
        System.out.println(is.getDummy());


        NestedClasses nc = new NestedClasses();
        NestedClasses.Inner i = new NestedClasses.Inner();
        System.out.println("Inner Nested:");
    }
}
