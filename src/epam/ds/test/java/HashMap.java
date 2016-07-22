package epam.ds.test.java;

import epam.ds.IMap;
import org.junit.Test;

import java.util.Objects;
import java.util.Random;

import static javafx.scene.input.KeyCode.K;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by kamalnrf on 22/7/16.
 */
public class HashMap
{
    @Test
    public void testIntegerMap ()
    {
        epam.ds.HashMap<Integer, Integer> map = new epam.ds.HashMap<>();
        int size = 100;

        map = populate(size);
        assertEquals(size, map.size());
        removeData(map, size/2);
    }

    public epam.ds.HashMap populate (int toGenerate)
    {
        Random random = new Random();
        epam.ds.HashMap<Integer, Integer> map = new epam.ds.HashMap<>();

        for (int counter = 0; counter < toGenerate; counter++)
        {
            map.add(random.nextInt(), random.nextInt());
        }

        return map;
    }

    public static void removeData(epam.ds.HashMap map, int toRemove)
    {
        for (int counter = 1; counter < toRemove; counter++)
        {
            if (map.isContanins(counter))
            {
                map.remove(counter);
                assertFalse(map.isContanins(counter));
            }
        }
    }
}
