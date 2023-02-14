import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integersList = List.of(5, 2, 3);
        System.out.println(toDouble(integersList));

        List<Long> longsList = List.of(5L, 2L, 3L);
        System.out.println(toDouble(longsList));
    }

    public static List<Double> toDouble(List<? extends Number> list) {
        List<Double> doubleList = new ArrayList<>(list.size());
        for(Number number : list) {
            doubleList.add(number.doubleValue());
        }
        return doubleList;
    }
}
