public class Main
{
    public static void main(String[] args) 
    {
        NestedClasses.InnerStatic is = new NestedClasses.InnerStatic();
        System.out.println("Static Nested:");
        System.out.println(is.getDummy());


        NestedClasses nc = new NestedClasses();
        NestedClasses.Inner i = nc.new Inner();
        System.out.println("Inner Nested:");
        System.out.println(i.getDummy());

        System.out.println("NC get dummy -- should do inner and anonymous");
        System.out.println(nc.getDummy());
    }

    public static void testNestedClasses()
    {
        System.out.println("If Working, the following should print the numebrs 1,2,3,4,5. \n ");
    }
}
