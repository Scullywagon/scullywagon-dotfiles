import java.util.Arrays;

public class ReverseArrayGeneric
{
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4, 5};
        array = reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static <T> T[] reverse(T[] a)
    {
        int a_size = a.length;

        for (int i = 0, b = a_size-1, a < a_size; a++, b--)
        {

        }

        return a;
    }

}