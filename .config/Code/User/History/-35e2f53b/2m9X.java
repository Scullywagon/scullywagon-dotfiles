public class Main {
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
    }

    public static void FizzBuzz()
    {
        for (int i = 0; i < 100; i++)
        {
            Boolean multipleOfThree = (i % 3 == 0)? true : false;
            Boolean multipleOfFive = (i % 5 == 0)? true : false;
            if (multipleOfThree)
            {
                System.out.println("Fizz");
            }
            if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            
        } 
    }
}