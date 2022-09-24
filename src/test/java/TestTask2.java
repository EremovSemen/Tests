import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestTask2 {

    int[] test1 = {1,2,3,1,2,3,4,4,5,5,2,2,43};
    int[] test11 = {5,5,2,2,43};
    int[] test2 = {1,2,3,1,2,3,5,5,2,2,43};
    int[] test22 = {1,2,3,1,2,3,5,5,2,2,43};
    int[] test3 = {4};
    int[] test33 = {};
    int[] test4 = {1,2,3,1,2,3,4,4,5,5,2,4,43};
    int[] test44 = {43};
    @Test
    void checkNumbers() {
        Task2 task2 = new Task2();
        Assertions.assertEquals(true,Task2.checkNumbers(test1));
    }
    @Test
    void checkNumbers2() {
        Task2 task2 = new Task2();
        Assertions.assertEquals(false,Task2.checkNumbers(test11));
    }
    @Test
    void checkNumbers3() {
        Task2 task2 = new Task2();
        Assertions.assertEquals(false,Task2.checkNumbers(test33));
    }
    @Test
    void checkNumbers4() {
        Task2 task2 = new Task2();
        Assertions.assertEquals(false,Task2.checkNumbers(test44));
    }

}