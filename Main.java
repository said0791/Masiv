import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        System.out.println("Задания 1");
        int[] weight = new int[]{1, 2, 3};
        System.out.println(weight[0]);

        System.out.println("Задания 2");
        float[] weight1 = {(float) 1.57, (float) 7.654, (float) 9.986};
        System.out.println(weight1[1]);

        System.out.println("Задания 3");
        int[] box = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(box[5]);

        System.out.println("Задача №2");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        System.out.println("Задача №3");
        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = weights1.length - 1; i >= 0; i--) {
            System.out.print(weights1[i] + ",");
        }

        System.out.println("\nЗадача №4");
        int[] weights4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = weights4.length - 1; i >= 0; i--) {

        if (weights4[i] % 2 == 0) {
            System.out.print(weights4[i]+",");
        }else {
            System.out.print(weights4[i]+1+",");
        }

    }




    }}
