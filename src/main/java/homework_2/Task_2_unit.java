package main.java.homework_2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.java.homework_2.Task_2;

import static org.testng.Assert.assertEquals;

public class Task_2_unit {

    Task_2 task_2;
    String matrixRows;

    @BeforeMethod
    public void setUp() {
        matrixRows = task_2.getName();
    }


    @Test
    public void checkRowsLength() {
        Task_2 task_2 = new Task_2();
        int expectedRowAmount = 5;
        int actualRowAmount = matrixRows.split("\n").length;
        assertEquals(expectedRowAmount, actualRowAmount);

    }

    @Test
    public void checkRowsNumber() {
        String rows[] = matrixRows.split("\n");
        for (String row : rows) {
            int expectedRowLength = 10;
            int actualRowLength = row.split(" ").length;
            assertEquals(expectedRowLength, actualRowLength);
        }


    }

}
