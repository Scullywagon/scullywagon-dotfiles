import java.util.ArrayList;

public class HashTable<T, E> 
{
    private ArrayList<Pair<T, E>> list = new ArrayList<>();

    public HashTable(){};

    public void add(T t, E e)
    {
        Pair<T, E> pair = new Pair(t, e);

        ArrayList.add(pair);
    }
}
