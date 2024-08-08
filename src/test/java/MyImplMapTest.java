import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyImplMapTest {
    private MyImplMap<Integer, String> map;

    @BeforeEach
    void setUp() {
        map = new MyImplMap<>();
    }

    @Test
    void size() {
        assertEquals(0, map.size());
        map.put(1, "one");
        assertEquals(1, map.size());
    }

    @Test
    void isEmpty() {
        assertTrue(map.isEmpty());
        map.put(1, "one");
        assertFalse(map.isEmpty());
    }

    @Test
    void containsKey() {
        assertFalse(map.containsKey(1));
        map.put(1, "one");
        assertTrue(map.containsKey(1));
    }

    @Test
    void containsValue() {
        assertFalse(map.containsValue("one"));
        map.put(1, "one");
        assertTrue(map.containsValue("one"));
    }

    @Test
    void get() {
        assertNull(map.get(1));
        map.put(1, "one");
        assertEquals("one", map.get(1));
    }

    @Test
    void put() {
        assertNull(map.put(1, "one"));
        assertEquals("one", map.put(1, "two"));
    }

    @Test
    void remove() {
        assertNull(map.remove(1));
        map.put(1, "one");
        assertEquals("one", map.remove(1));
    }

    @Test
    void putAll() {
        Map<Integer, String> anotherMap = new MyImplMap<>();
        anotherMap.put(1, "one");
        anotherMap.put(2, "two");
        map.putAll(anotherMap);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsKey(2));
    }

    @Test
    void clear() {
        map.put(1, "one");
        map.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    void keySet() {
        assertTrue(map.keySet().isEmpty());
        map.put(1, "one");
        assertTrue(map.containsKey(1));
    }

    @Test
    void values() {
        assertTrue(map.values().isEmpty());
        map.put(1, "one");
        assertTrue(map.containsValue("one"));
    }

    @Test
    void entrySet() {
        assertTrue(map.entrySet().isEmpty());
        map.put(1, "one");
        assertFalse(map.entrySet().isEmpty());
    }
}