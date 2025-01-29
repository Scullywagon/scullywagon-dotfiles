public class NestedClasses 
{
    int dummy = 5;     

    public static class InnerStatic
    {
        int staticDummy = 4;
        public int getDummy()
        {
            return staticDummy;
        } 
    }

    public class Inner
    {
        int innerDummy = 3;
        public int getDummy()
        {
            return innerDummy;
        }
    }

    public int getDummy()
    {
        class Local
        {
            int localDummy = 2;

            public int getDummy()
            {
                return localDummy;
            }
        }

        Local l = new Local();
        System.out.println(l.getDummy());

        class Anon extends Thread
        {
            int anonDummy = 1;

            @Override
            public void run()
            {
                System.out.println(anonDummy);
            }
        }
        return dummy;
    }
}

public class Main
{
    public static void main(String[] args) 
    {
       System.out.println("hi"); 
    }
}
