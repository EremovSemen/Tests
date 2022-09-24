import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;


class TestTask1 {

    Task1 task = new Task1();

    int[] test1 = {1,2,3,1,2,3,4,4,5,5,2,2,43};
    int[] test11 = {5,5,2,2,43};
    int[] test2 = {1,2,3,1,2,3,5,5,2,2,43};
    int[] test22 = {1,2,3,1,2,3,5,5,2,2,43};
    int[] test3 = {4};
    int[] test33 = {};
    int[] test4 = {1,2,3,1,2,3,4,4,5,5,2,4,43};
    int[] test44 = {43};



    @Test
    void numbers() {
        Assertions.assertEquals(Arrays.toString(test11),Arrays.toString(Task1.numbers(test1)));
    }

    @Test
    void numbers2() {
        Assertions.assertEquals(Arrays.toString(test22),Arrays.toString(Task1.numbers(test2)));
    }

    @Test
    void numbers3() {
        Assertions.assertEquals(Arrays.toString(test33),Arrays.toString(Task1.numbers(test3)));
    }

    @Test
    void numbers4() {
        Assertions.assertEquals(Arrays.toString(test44),Arrays.toString(Task1.numbers(test4)));
    }




}