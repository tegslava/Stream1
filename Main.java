import streams.NonStreamMain;
import streams.StreamMain;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Исходный ряд чисел:");
        System.out.println(intList.toString());
        System.out.println("Без использования Collection API и Stream API:");
        NonStreamMain nonStreamMain = new NonStreamMain(intList);
        nonStreamMain.main();
        System.out.println("С использованием Stream API:");
        StreamMain streamMain = new StreamMain(intList);
        streamMain.main();
    }
}
