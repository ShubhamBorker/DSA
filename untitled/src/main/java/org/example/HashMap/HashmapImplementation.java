package org.example.HashMap;

public class HashmapImplementation {
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    static class Hashmap<K,V>{
        private int capacity =16;
        private Entry<K,V>[] table;

        public Hashmap(){
            table=new Entry[capacity];
        }

        public int getIndex(K key){
            return Math.abs(key.hashCode() % capacity);
        }

        public void put(K key,V value){
            int index = getIndex(key);

            Entry<K,V> newEntry= new Entry<>(key, value);
            if (table[index]== null){
                table[index]= newEntry;
            } else {
                Entry<K, V> curr= table[index];
                Entry<K,V> prev= null;
                while (curr!= null){
                    if (curr.key.equals(key)){
                        curr.value=value;
                        return;
                    }
                    prev = curr;
                    curr = curr.next;
                }
                prev.next=newEntry;
            }
        }

        public V get(K key){
            int index = getIndex(key);
            Entry<K,V> curr=table[index];
            while (curr!= null){
                if (curr.key.equals(key)){
                    return curr.value;
                }
                curr=curr.next;
            }
            return null;
        }

        public void remove(K key){
            int index= getIndex(key);
            Entry<K,V> curr= table[index];
            Entry<K,V> prev= null;

            while (curr!=null){
                if (curr.key.equals(key)){
                    if (prev== null){
                        table[index]=curr.next;
                    }else {
                        prev.next=curr.next;
                    }
                    return;
                }
                prev=curr;
                curr=curr.next;
            }
        }

    }

    public static void main(String[] args){
        Hashmap<String,Integer> map= new Hashmap<>();
        map.put("apple", 10);
        map.put("banana",20);
        map.put("orange",30);

        System.out.println(map.get("banana"));
        System.out.println(map.get("apple"));

        map.remove("banana");
        System.out.println(map.get("banana"));


    }


}
