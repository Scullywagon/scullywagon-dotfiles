public class Item<E extends Comparable<E>, T> 
{
    private E identifier;
    private T property;

    public Item(E key, T value) {
        this.identifier = key;
        this.property = value;
    }

    public E getKey() {
        return identifier;
    }

    public void setKey(E key) {
        this.identifier = key;
    }

    public T getValue() {
        return property;
    }

    public void setValue(T value) {
        this.property = value;
    }
}
