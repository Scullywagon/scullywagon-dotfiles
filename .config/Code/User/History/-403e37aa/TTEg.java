import java.util.Arrays;

public class ReverseArrayGeneric
{
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static <T> void reverse(T[] a)
    {
        int a_size = a.length;

        for (int i = 0, x = a_size-1; i < i ; i++, i--)
        {
            T temp = a[i];
            a[i] = a[x]; 
            a[x] = temp;
        }
    }

}