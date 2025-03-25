package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 2, 1, 3, 4, 2, 5));
        hashSet1.add(8);
        hashSet1.add(8);
        hashSet1.add(null);
        System.out.println(hashSet1);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(12);
        hashSet2.add(7);
        hashSet2.add(6);
//        hashSet2.add(null);
        hashSet2.add(2);
        hashSet2.add(9);

        System.out.println(hashSet2.contains(9));
        System.out.println(hashSet2);

        hashSet2.remove(2);
        System.out.println(hashSet2);

        hashSet2.stream()
                .filter(param -> param % 2 == 0)
                .forEach(System.out::println);


        Set<String> linkedHashSet1 = new HashSet<>();
        linkedHashSet1.add("H");
        linkedHashSet1.add("W");
        linkedHashSet1.add("A");
        linkedHashSet1.add("C");
        linkedHashSet1.add("B");
        linkedHashSet1.add("N");
        linkedHashSet1.add("F");

        System.out.println(linkedHashSet1);
    }
}
