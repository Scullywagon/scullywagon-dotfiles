public class SelectByIdentifier<E extends Comparable<E>, T> implements Select<E, Object>
{
    private E id;

    public SelectByIdentifier(E id) 
    {
        this.id = id;
    }

    @Override
    public boolean Select(Item<E, Object> item)
    {
        if (id == item.getKey())
        {
            return true;
        }
        return false; 
    }
}
