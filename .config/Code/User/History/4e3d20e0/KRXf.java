public class SelectByIdentifier<T> implements Select<T>
{
    T id;
    @Override
    public boolean Select(T t)
    {
        return true;
    }
}
