public class Main 
{
    public static void main(String[] args) 
    {
        Item<String, Object> A = new Item<>("fuck", "fuck");
        Item<String, Object> a = new Item<>("shit", "shit");
        Item<Integer, Object> B = new Item<>(5, "shit");
        Item<Integer, Object> b = new Item<>(4, "shit");

        SelectByIdentifier<String> stringSelector = new SelectByIdentifier<String>("fuck");
        SelectByIdentifier<Integer> intSelector = new SelectByIdentifier<Integer>(5);

        System.out.println(stringSelector.Select(A));
        System.out.println(stringSelector.Select(a));
        System.out.println(intSelector.Select(B));
        System.out.println(intSelector.Select(b));
    }
}