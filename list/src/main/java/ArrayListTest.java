import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.remove(3); // remove by index
        arrayList.add(4);

        arrayList.remove(Integer.valueOf(3)); // remove by Object.

        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.add(2, 3); // add by index
        System.out.println(arrayList);

        int value = arrayList.get(4);
        System.out.println("Last Element: " + value);

        System.out.println("Is List contains 3 value: " + arrayList.contains(3));
        System.out.println("Is List contains 10 value: " + arrayList.contains(10));

        System.out.println("arrayList.isEmpty() = " + arrayList.isEmpty());

        arrayList.clear();
        System.out.println("arrayList.isEmpty() = " + arrayList.isEmpty());

        List<Integer> newList = new java.util.ArrayList(Arrays.asList(1, 2, 3, 5, 4));

        System.out.println("newList = " + newList);

        arrayList.addAll(newList);
        System.out.println("arrayList = " + arrayList);

        arrayList.removeAll(newList);
        System.out.println("arrayList = " + arrayList);

        arrayList.addAll(newList);

        arrayList.set(2, 6);
        System.out.println("arrayList = " + arrayList);

        System.out.println("arrayList.toArray() = " + Arrays.toString(arrayList.toArray()));

//        arrayList.sort(Integer::compareTo);
//        System.out.println("arrayList = " + arrayList); // The List is sorted in Ascending order

        // Iterate by Indexed For Loop
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                System.out.println("arrayList.get(i) = " + arrayList.get(i));
            }
        }
        System.out.println("----------------------");

        // Iterate by Enhanced For Loop
        for (Integer element : arrayList) {
            if (element % 2 == 0) {
                System.out.println("element = " + element);
            }
        }
        System.out.println("----------------------");

        // Iterate by Iterator
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println("----------------------");

        // Iterate by Iterable forEach
        arrayList.forEach((element) -> {
            if (element > 2) {
                System.out.println("element = " + element);
            }
        });
        System.out.println("----------------------");

        // Iterate by Iterable forEach with Method Reference
        arrayList.forEach(element -> System.out.print(element));
        arrayList.forEach(ArrayListTest::printLamiaa);
        System.out.println("----------------------");

        // Iterate by Streaming
        arrayList.stream().forEach(System.out::println);
        List<Integer> sortedList = sort(arrayList);

        System.out.println("arrayList = " + arrayList);
        System.out.println("sortedList = " + sortedList);
        System.out.println("----------------------");

        arrayList.stream()
                .sorted()
                .map(element -> element + 1)
                .findFirst().ifPresent(System.out::println);
        System.out.println("----------------------");

        arrayList.add(5);

        arrayList.stream()
                .sorted()
                .distinct()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("----------------------");

        System.out.println("Count: " + arrayList.stream()
                .sorted()
                .distinct()
                .limit(5)
                .count());
        System.out.println("----------------------");

        arrayList.stream()
                .sorted()
                .distinct()
                .limit(5)
                .filter(element -> element % 2 != 0)
                .forEach(System.out::println);
    }

    public static void printLamiaa(Object element) {
        System.out.println("Welcome Lamiaa with element = " + element);
    }

    public static List<Integer> distinct(List<Integer> list) {
        List<Integer> newList = new java.util.ArrayList(list);
        newList.sort(Integer::compareTo);

        for (int i = 0; i < newList.size()-1; i++) {
            if (newList.get(i).equals(newList.get(i + 1))) {
                newList.remove(i);
            }
        }
        return newList;
    }

    public static List<Integer> limit(int maxSize, List<Integer> list) {
        List<Integer> newList = new java.util.ArrayList<>(maxSize);
        for (int i = 0; i < maxSize; i++) {
            newList.add(list.get(i));
        }
        return newList;
    }
    public static Integer count(List<Integer> list) {
        return list.size();
    }

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> newList = new java.util.ArrayList(list);
        newList.sort(Integer::compare);
        return newList;
    }

    public static int firstElement(List<Integer> list) {
        return list.get(0);
    }

}
