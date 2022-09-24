import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

     static int[] massive = {1,2,3,1,2,3,4,4,5,5,2,2,43};

    public static int[] numbers(int[] massive) {
        int controller = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = massive.length - 1; i > 0; i--) {
            if (massive[i] == 4) {
                controller += 1;
                break;
            }
            list.add(massive[i]);
        }
        if (controller == 0) {
            try {
                System.out.println("В массиве нет значсения <<<4>>>");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        Collections.reverse(list);
        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) array[i] = list.get(i);
        System.out.println(Arrays.toString(array));
        return array;
    }

}
