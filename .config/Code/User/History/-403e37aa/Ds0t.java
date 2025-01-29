import java.util.Arrays;

public class ReverseArrayGeneric
{
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4, 5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static <T> void reverse(T[] a)
    {
        int a_size = a.length;

        for (int i = 0, b = a_size-1; i < a_size; i++, b--)
        {

        }

    }

}