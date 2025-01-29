import java.util.ArrayList;

public class HashTable<T, E> 
{
    private ArrayList<Pair<T, E>> list = new ArrayList<>();
    Pair<T, E> pair;

    public HashTable(){};

    public void add(T t, E e)
    {
        pair = new Pair<T, E>(t, e);
        list.add(pair);
    }
}
