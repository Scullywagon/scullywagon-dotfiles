import java.util.Arrays;

public class ReverseArrayGeneric
{
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4, 5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static <T> void reverse(T[] array)
    {
        int start = 0;
        int end = array.length - 1;
        while (start < end)
        {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}