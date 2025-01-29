import java.util.Arrays;

public class ReverseArrayGeneric
{
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4, 5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static <T> reverse(<T> t)
    {
        return t;
    }

}