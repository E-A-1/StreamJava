import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPractice {
    public static void main(String[] args) {
        System.out.println("Practice streams api!");
        String[] arr = new String[] { "e", "a", "v", "i", "j", "a", "y" };
        Stream<String> stream = Arrays.stream(arr);
        System.out.println("First stream");
        stream.forEach(element -> System.out.print(element + " "));
        System.out.println("Second stream");
        stream = Stream.of("v", "i", "j", "a", "y");
        stream.forEach(element -> System.out.print(element + " "));

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(4);

        intArrayList.forEach(element -> System.out.println("Normal Stream element " + element));

        intArrayList.parallelStream().forEach(element -> System.out.println("Parallel Stream element " + element));

        System.out.println("Third stream");

        Stream<Integer> stream2 = intArrayList.stream();
        stream2.forEach(element -> System.out.print(element + " "));
        /*
         * Streams divided into two type
         * 1) Intermediate operations
         * 2)Terminal operations
         *
         */
        long countValue = intArrayList.stream().distinct().count();
        System.out.println("the distinct count value is " + countValue);

        //
        class Person {
            int name;

            public Person(int name) {
                this.name = name;
            }

            public int getName() {
                return this.name;
            }
        }

        Person firstPerson = new Person(1);
        Person secondPerson = new Person(0);
        Person thirdPerson = secondPerson;

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(firstPerson);
        personList.add(secondPerson);
        personList.add(thirdPerson);
        System.out.println("distinct person is " + personList.stream().distinct().count());

        Map<Integer, List<Person>> collectorMapOfLists = personList.stream()
                .collect(Collectors.groupingBy(Person::getName));

        for (Map.Entry<Integer, List<Person>> entry : collectorMapOfLists.entrySet()) {
            System.out.println("key " + entry.getKey());
            System.out.println("value" + entry.getValue().size());
        }
    }

    /*
     * Iterating
     */

    public static void checkIteration() {

    }
}
