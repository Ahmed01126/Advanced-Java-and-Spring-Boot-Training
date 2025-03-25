package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(5);
        set.add(2);
        set.add(10);
        set.add(3);
        set.add(3);

        set.stream().min(Integer::compareTo).ifPresent(System.out::println);


        System.out.println(set);


        Set<String> set1 = new TreeSet<>();
        set1.add("N");
        set1.add("F");
        set1.add("C");
        set1.add("D");
        set1.add("B");
        set1.add("A");
        set1.add("Z");
        set1.add("Z");

        System.out.println(set1);
    }
}
