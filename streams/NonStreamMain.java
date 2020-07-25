package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NonStreamMain {
    private final List<Integer> intList;

    public NonStreamMain(List<Integer> intList) {
        this.intList = intList;
    }

    public void main() {
        System.out.println("Положительные четные числа в порядке возрастания:");
        ArrayList<Integer> possitiveEvenList = new ArrayList<>();
        for (int x : intList) {
            if ((x > 0) && (x % 2 == 0)) possitiveEvenList.add(x);
        }
        possitiveEvenList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                else if (o1 < o2) return -1;
                else return 0;
            }
        });

        for (Integer x : possitiveEvenList) {
            System.out.print(String.format(" %s", x));
        }
        System.out.println();
    }
}
