package LRUCache;

public class main {

    public static void main(String[] args) {
        LRUCache1 cache = new LRUCache1( 2 );

        cache.put(1, 1);
        System.out.println(cache.get(1));
        cache.put(1, 2);
        System.out.println(cache.get(1));
        cache.put(2, 2);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        cache.put(3, 10);
        System.out.println(cache.get(3));
    }
}
