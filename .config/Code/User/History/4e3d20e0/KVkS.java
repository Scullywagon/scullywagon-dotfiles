public class SelectByIdentifier implements Select
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
