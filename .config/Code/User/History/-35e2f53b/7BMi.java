public class Main {
    public static void main(String[] args) 
    {
        FizzBuzz();
    }

    // Excercise 1 
    public static void FizzBuzz()
    {
        for (int i = 0; i < 100; i++)
        {
            Boolean multipleOfThree = (i % 3 == 0)? true : false;
            Boolean multipleOfFive = (i % 5 == 0)? true : false;
            if (multipleOfThree)
            {
                System.out.print("Fizz");
            }
            if (multipleOfFive)
            {
                System.out.print("Buzz");
            }
            if (!multipleOfThree && !multipleOfFive)
            {
                System.out.print(i);
            }
            System.out.println();
        } 
    }

    // Excercise 2

}