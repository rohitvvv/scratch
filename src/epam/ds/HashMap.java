package epam.ds;

import java.util.Arrays;

/**
 * Created by kamalnrf on 22/7/16.
 */
public class HashMap <K, V> implements IMap<K, V>
{
    private static final int TABLE_SIZE = 128;
    private Node[] table;
    private static int count = 0;

    /**
     *Creates a hash table with initial size 128.
     */
    public HashMap() {
        table = new Node[TABLE_SIZE];
    }

    /**
     * Create a hash table with
     specified initial size.
     */
    public HashMap(int size) {
        table = new Node[size];
    }

    /**
     * Compute a unique hash for the key.
     * @return returns a hash code based on size of the table
     */
    public int hash (K key)
    {
        return (Math.abs(key.hashCode())) % table.length;
    }

    /**
     * @return the number of key/value pairs are there in the table.
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * @return true if there is at least one key/value pair.
     */
    @Override
    public boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    /**
     *
     * @param key
     * @param value
     *
     * adds the key/value pair.
     */
    @Override
    public void add(K key, V value)
    {
        if (key == null)                        //Pre-Condition:- Key cannot be null.
            throw new NullPointerException();

        int bucket = hash(key);
        while (table[bucket] != null && table[bucket].getKey() != key)
            bucket = (bucket + 1) % TABLE_SIZE;

        table[bucket] = new Node(key, value);
        count++;
    }

    /**
     * @param key
     * @return returns the value
     */
    @Override
    public V get(K key)
    {
        if (key == null)                        //Pre-Condition:- Key cannot be null.
            throw new NullPointerException();

        int bucket = hash(key);

        while (table[bucket] != null && table[bucket].getKey() != key)
            bucket = (bucket + 1) % TABLE_SIZE;

        if (table[bucket] == null)
            throw new NullPointerException();
        else
            return (V) table[bucket].getValue();
    }

    /**
     * removes the key/value pair if -> exits.
     */
    @Override
    public void remove(K key)
    {
        int bucket = hash(key);

        if (table[bucket] == null)
            throw new NullPointerException();
        else {
            table[bucket] = null;
            table[bucket] = null;
            count--;
        }
    }

    /**
     *
     * @param key
     * @return returns true if there is value for the key.
     */
    @Override
    public boolean isContanins(K key)
    {
        int bucket = hash(key);

        if (table[bucket] == null)
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "table=" + Arrays.toString(table) +
                '}';
    }

    public static class Node <K, V>
    {
        K key;
        V value;

        public V getValue() {
            return value;
        }

        public K getKey() {

            return key;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
