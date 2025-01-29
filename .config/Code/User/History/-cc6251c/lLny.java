import java.util.ArrayList;

public class HashTable<T, E> 
{
    private ArrayList<Pair<T, E>> list = new ArrayList<>();
    private ArrayList<T> keys = new ArrayList<>();
    Pair<T, E> pair;

    public HashTable(){};

    public void add(T t, E e)
    {
        if (keys.contains(t))
        {
            System.out.println("Failed to add: " + t + " " + e);
            return;
        } 
        
        pair = new Pair<T, E>(t, e);
        list.add(pair);
        keys.add(t);
    }

    public E get(T t)
    {
        if (!keys.contains(t))
        {
            System.out.println(t + " is not in the hash table.");
            return null;
        }

        for (Pair<T, E> p : list)
        {
            if (p.key.equals(t))
            {
                return p.value;
            }
        }
    }
}
