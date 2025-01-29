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
        int left = 0;
        int right = array.length - 1;
        while (left < right)
        {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}