import java.util.Arrays;

public class GenericMethods 
{
    public static void main(String[] args)
    {
        // Test for reverse() method
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

        // Test for max() method
        Integer[] arr = {5, 4, 6, 4, 3, 9};  
        int max = max(arr);
        System.out.println(max);
    }

    public static <T> void reverse(T[] a)
    {
        int a_size = a.length;

        for (int i = 0, x = a_size-1; i < x ; i++, x--)
        {
            T temp = a[i];
            a[i] = a[x]; 
            a[x] = temp;
        }
    }

    public static <T extends Integer> T max(T[] a)
    {
        T result = null;

        for (T t : a)
        {
            if (result == null)
            {
                result = t;
            }
            else if (result < t)
            {
                result = t;
            }
        }
        return result;
    }

    public static <T extends Comparable>
    
}