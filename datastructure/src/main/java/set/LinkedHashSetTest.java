package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(10);
        linkedHashSet.add(12);
        linkedHashSet.add(17);
        linkedHashSet.add(12);
        linkedHashSet.add(8);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }
}
