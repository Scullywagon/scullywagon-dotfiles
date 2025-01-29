public class SelectByIdentifier<ID> implements Select
{
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
