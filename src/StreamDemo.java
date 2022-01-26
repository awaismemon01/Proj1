
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List <Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(11);
        list1.add(28);
        list1.add(9);
        list1.add(7);
        list1.add(66);
        System.out.println(list1);

        Stream<Integer> stream = list1.stream();
        List<Integer> evenList = stream.filter(integer -> integer%2==0).collect(Collectors.toList());
        Stream<Integer> stream2 = list1.stream();
        List<Integer> oddList = stream2.filter(integer -> integer % 2 != 0).collect(Collectors.toList());
        System.out.println(oddList);
        System.out.println(evenList);

        Stream<Integer> stream3 = list1.stream();
        List<Integer> sort = stream3.sorted().collect(Collectors.toList());
        System.out.println(sort);

        //list1.stream().forEach(System.out::println);

        Integer min = list1.stream().min(Comparator.naturalOrder()).get();
        Integer max = list1.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Min : "+min);
        System.out.println("Max : "+max);

    }
}