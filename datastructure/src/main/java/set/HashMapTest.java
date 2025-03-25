package set;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapTest {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(10).hashCode());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sawi");
        map.put(2, "Lamiaa");
        map.put(3, "Ahmed");
        map.put(2, "Sawi");
        map.put(4, "Sawi");
        map.remove(2);

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(100));

        map.values().forEach(element -> {
            if (element.equals("Hanaa")) {
                System.out.println("Found Hanaa");
            }
        });
        System.out.println("------------------");

        Collection<String> collection = map.values();
        List<Character> set = collection.stream()
                .map(element -> {
                    System.out.println(
                            "Hash Code for " + element.charAt(0) + " = " +
                            Character.valueOf(element.charAt(0)).hashCode());
                    return element.charAt(0);
                })
                .collect(Collectors.toList());

        set.forEach(System.out::println);
        System.out.println("------------------");

        map.keySet().forEach(key -> System.out.println(key));
        System.out.println("------------------");
        System.out.println("------------------");

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("------------------");
        });

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("------");
        }

        System.out.println(map);

        map.put(1, "Hanaa");
        System.out.println(map);

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Shosha", 20));
        studentMap.put(2, new Student("Elsawy", 22));
        studentMap.put(3, new Student("Hanaa", 20));
        System.out.println(studentMap);

        Map<Integer, List<Student>> studentListMap = new HashMap<>();
        studentListMap.put(1, Arrays.asList(
                new Student("Hanaa", 20),
                new Student("Lamiaa", 20),
                new Student("Ahmed", 25)
        ));

        studentListMap.put(2, Arrays.asList(
                new Student("Elsawy", 34),
                new Student("Shosha", 20)
        ));

        System.out.println(studentListMap);

        Stack<Integer> stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(9);
        stack.push(2);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();

        System.out.println(stack.isEmpty());


        Queue queue = new LinkedList();
        queue.add(5);
        queue.add(4);
        queue.add(9);
        queue.add(2);

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        System.out.println(queue.contains(2));
    }
}
