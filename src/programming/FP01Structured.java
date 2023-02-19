package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));

        printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        //How to loop the numbers?
        for(int n : integers) {
            System.out.println(n);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> integers) {
        //How to loop the numbers?
        for(int n : integers) {
            if(n % 2 == 0)
                System.out.println(n);
        }
    }
}
