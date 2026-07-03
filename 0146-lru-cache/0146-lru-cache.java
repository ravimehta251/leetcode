class LRUCache {

    class lru {
        int key;
        int value;
        int lastuse;
    }

    lru[] ar;
    int time = 0;

    public LRUCache(int capacity) {
        ar = new lru[capacity];
        for (int i = 0; i < capacity; i++) {
            ar[i] = new lru();   // Initialize objects
        }
    }

    public int get(int key) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].lastuse != 0 && ar[i].key == key) {
                ar[i].lastuse = ++time;
                return ar[i].value;
            }
        }
        return -1;
    }

    public void put(int key, int value) {

        // If key already exists, update it
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].lastuse != 0 && ar[i].key == key) {
                ar[i].value = value;
                ar[i].lastuse = ++time;
                return;
            }
        }

        // Find an empty slot
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].lastuse == 0) {
                ar[i].key = key;
                ar[i].value = value;
                ar[i].lastuse = ++time;
                return;
            }
        }

        // Replace least recently used
        int index = 0;
        int min = ar[0].lastuse;

        for (int i = 1; i < ar.length; i++) {
            if (ar[i].lastuse < min) {
                min = ar[i].lastuse;
                index = i;
            }
        }

        ar[index].key = key;
        ar[index].value = value;
        ar[index].lastuse = ++time;
    }
}