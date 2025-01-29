import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        Item<String, Object> A = new Item<>("fuck", "fuck");
        Item<String, Object> a = new Item<>("shit", "shit");
        Item<Integer, Object> B = new Item<>(5, "shit");
        Item<Integer, Object> b = new Item<>(4, "shit");

        SelectByIdentifier<String> stringSelector = new SelectByIdentifier<>("fuck");
        SelectByIdentifier<Integer> intSelector = new SelectByIdentifier<>(5);

        //System.out.println(stringSelector.Select(A));
        //System.out.println(stringSelector.Select(a));
        //System.out.println(intSelector.Select(B));
        //System.out.println(intSelector.Select(b));

        print(Item.objects);
    }
        

    public static <U> void print(ArrayList<U> list)
    {
        for (U item : list) {
            System.out.println(item);
        }
    }

    public static void testHashTable()
    {
        HashTable<String, Integer> table = new HashTable<>();
        table.add("fuck", 5);
        table.add("fuck", 4);
        table.add("shit", 4);
        table.add("shit", 4);
        table.add("cunt", 4);
    }
}