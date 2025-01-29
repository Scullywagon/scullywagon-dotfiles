public class SelectByIdentifier<E extends Comparable<E>> implements Select<T>
{
    T id;

    public SelectByIdentifier(T id) 
    {
        this.id = id;
    }

    @Override
    public boolean Select(T t)
    {
        if ( t == id)
        {
            return true;
        }
        return false; 
    }
}
