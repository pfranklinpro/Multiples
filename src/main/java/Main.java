import classes.Multiple;

import java.util.LinkedList;

public class Main {
    private static int[] arrayOfMultiples(Multiple multiple) {
        int[] array = new int[multiple.getLength()];

        for (int i = 0; i < array.length; i++) {
            array[i] = multiple.getNum() * (i + 1);
        }

        return array;
    }
    private static void printArrayOfMultiples(Multiple multiple) {
        int[] array = arrayOfMultiples(multiple);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        System.out.println(sb);
    }
    public static void main(String[] args) {
        LinkedList<Multiple> multiples = new LinkedList<>();

        multiples.add(new Multiple(7, 5));
        multiples.add(new Multiple(12, 10));
        multiples.add(new Multiple(17, 6));

        multiples.forEach(Main::printArrayOfMultiples);
    }
}
