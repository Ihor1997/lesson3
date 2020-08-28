package main.java.homework_2_advanced;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test1 {
    Task1 task1;


    @BeforeMethod
    public void setUp(){
        task1 = new Task1();
    }

    @Test
    public void testAge(){
         int testAge = 15;
         task1.setAge(testAge);
         int actualAge = task1.getAge();
        assertEquals(testAge, actualAge);




    }



}
