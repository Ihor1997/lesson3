package main.java.homework_2;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1_unit {

    @Test(dataProvider = "default")
    public void test(int actual, int expected) {
        Task1 task1 = new Task1();
        int arr[] = provider();
        actual = task1.numberminimun(arr);
        expected = -2;
        assertEquals(actual, expected);
    }

    @DataProvider(name = "default")
    public Object[][] provider(int arr) {
        return new Object[][] {
                {1,2,6,11,0,5}

        };


    }


}
