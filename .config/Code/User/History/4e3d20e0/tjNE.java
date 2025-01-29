public class SelectByIdentifier<T> implements Select<T>
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

        }
    }
}
