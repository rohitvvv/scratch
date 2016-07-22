package epam.ds;

/**
 * Created by kamalnrf on 14/7/16.
 */
public interface IMap<K, V>
{
    int size();

    boolean isEmpty();

    void add (K key, V value);

    V get (K key);

    void remove (K key);

    boolean isContanins (K key);
}
