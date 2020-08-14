package test.java.lesson6;

import lesson4.Cat;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_cat {

    @Test
    public void test1() {
        int ageTochange = 10;
        Cat cat = new Cat("Vasiliy");
        cat.setAge(ageTochange);
        int actualAge = cat.getAge();
        int exepectedAge = ageTochange;
        //assertEquals(actualAge, exepectedAge);
        assertEquals(actualAge, 0, String.format("Expected result cat age to be"));
    }
}
