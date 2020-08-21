package main.java.homework_2;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1_unit {

    @Test(dataProvider = "default")
    public void test(int arr[], int expected) {
        Task1 task1 = new Task1();
        int actual = task1.numberminimun(arr); // [1,2,3]
        assertEquals(actual, expected);
    }

    @DataProvider(name = "default")
    public Object[][] provider(int arr) {
        return new Object[][] {
                {new int[] {1, 2, 3}, 1},
                {new int[] {1, -2, 3}, -2},

        };



    }


}
