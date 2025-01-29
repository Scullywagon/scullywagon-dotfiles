public class Main 
{
    public static void main(String[] args) 
    {
        Item<String, String> A = new Item<>("fuck", "fuck");
        Item<String, String> a = new Item<>("shit", "shit");
        Item<Integer, String> B = new Item<>(5, "shit");
        Item<Integer, String> b = new Item<>(4, "shit");

        SelectByIdentifier<String> stringSelector = new SelectByIdentifier<String>("fuck");
        SelectByIdentifier<Integer> intSelector = new SelectByIdentifier<Integer>(5);

        intSelector.Select(A);
    }
}