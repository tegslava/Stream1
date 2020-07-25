package streams;

import java.util.Comparator;
import java.util.List;

public class StreamMain {
    private final List<Integer> intList;

    public StreamMain(List<Integer> intList) {
        this.intList = intList;
    }

    public void main() {
        System.out.println("Положительные четные числа в порядке возрастания:");
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(x -> String.format(" %s", x))
                .forEach(System.out::print);
    }
}
