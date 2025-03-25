import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.remove(3); // remove by index
        linkedList.add(4);

        linkedList.remove(Integer.valueOf(3)); // remove by Object.

        System.out.println(linkedList.size());
        System.out.println(linkedList);
        linkedList.add(2, 3); // add by index
        System.out.println(linkedList);

        int value = linkedList.get(4);
        System.out.println("Last Element: " + value);

        System.out.println("Is List contains 3 value: " + linkedList.contains(3));
        System.out.println("Is List contains 10 value: " + linkedList.contains(10));

        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());

        linkedList.clear();
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());

        List<Integer> newList = new LinkedList<>(Arrays.asList(1, 2, 3, 5, 4));

        System.out.println("newList = " + newList);

        linkedList.addAll(newList);
        System.out.println("linkedList = " + linkedList);

        linkedList.removeAll(newList);
        System.out.println("linkedList = " + linkedList);

        linkedList.addAll(newList);

        linkedList.set(2, 6);
        System.out.println("linkedList = " + linkedList);

        System.out.println("linkedList.toArray() = " + Arrays.toString(linkedList.toArray()));

//        linkedList.sort(Integer::compareTo);
//        System.out.println("linkedList = " + linkedList); // The List is sorted in Ascending order

        // Iterate by Indexed For Loop
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 2 != 0) {
                System.out.println("linkedList.get(i) = " + linkedList.get(i));
            }
        }
        System.out.println("----------------------");

        // Iterate by Enhanced For Loop
        for (Integer element : linkedList) {
            if (element % 2 == 0) {
                System.out.println("element = " + element);
            }
        }
        System.out.println("----------------------");

        // Iterate by Iterator
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println("----------------------");

        // Iterate by Iterable forEach
        linkedList.forEach((element) -> {
            if (element > 2) {
                System.out.println("element = " + element);
            }
        });
        System.out.println("----------------------");

        // Iterate by Iterable forEach with Method Reference
        linkedList.forEach(element -> System.out.println(element));
        System.out.println("----------------------");

        // Iterate by Streaming
        linkedList.stream().forEach(System.out::println);
        System.out.println("----------------------");

        linkedList.stream()
                .sorted()
                .map(element -> element + 1)
                .findFirst().ifPresent(System.out::println);
        System.out.println("----------------------");

        linkedList.add(5);

        linkedList.stream()
                .sorted()
                .distinct()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("----------------------");

        System.out.println("Count: " + linkedList.stream()
                .sorted()
                .distinct()
                .limit(5)
                .count());
        System.out.println("----------------------");

        linkedList.stream()
                .sorted()
                .distinct()
                .limit(5)
                .filter(element -> element % 2 != 0)
                .forEach(System.out::println);


        System.out.println(linkedList);

        linkedList.addFirst(10);
        System.out.println(linkedList);

        linkedList.addLast(20);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.removeIf(element -> element > 4);
        System.out.println(linkedList);

        linkedList.remove(Integer.valueOf(2));
        System.out.println(linkedList);
    }
}
