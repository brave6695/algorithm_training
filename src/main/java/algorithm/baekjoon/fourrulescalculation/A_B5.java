package algorithm.baekjoon.fourrulescalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_B5 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = "";
            while (!"0 0".equals(input = br.readLine())) {
                int[] array = convertStringArrayToIntegerArray(input.split(" "));
                System.out.println(array[0] + array[1]);
            }
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
