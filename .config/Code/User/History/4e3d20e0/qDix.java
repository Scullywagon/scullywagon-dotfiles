public class SelectByIdentifier<E extends Comparable<E>, T> implements Select<E, Object>
{
    private E id;

    public SelectByIdentifier(E id) 
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
