package main.java.homework_2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task_3_unit {

    @Test(dataProvider = "default")
    public void test(String actual, String expected) {
        Task_3 task_3_unit = new Task_3();
        actual = task_3_unit.reverseName(actual);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "default")
    public Object[][] provider(String actual) {
        return new Object[][]{
                {"Ihor", "rohI"},


        };


    }
}
