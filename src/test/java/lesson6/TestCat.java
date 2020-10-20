package test.java.lesson6;

import main.java.lesson4.Cat;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestCat {

    Cat cat;
    String matrixRows;

    @BeforeClass
    public void beforAllMethods() {
        System.out.println("- Befor All Methods");
        cat = new Cat("Vasiliy");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("- Before Method");
        matrixRows = cat.getMatrix();

    }

    @AfterMethod
    public void tearDown() {
        System.out.println("- After Methid");
    }

    @AfterClass
    public void AfterAllMethods() {
        System.out.println("- After all Methods");
    }

//    @BeforeGroups(dependsOnGroups = "getMatrix")
//    public void beforeGetMatrixTest() {
//        System.out.println("- beforeGetMatrixTest");
//        matrixRows = cat.getMatrix();
//    }


    //@Test(dependsOnGroups = "getMatrix", dependsOnMethods = "testGetMatrixShouldReturnRows")
    @Test(dataProvider = "dp")
    public void testGetAge(int ageToChange, int expectedAge){
        System.out.printf("TEST 1 with age to change = '%d' and expected age = '%d'\n", ageToChange, expectedAge);
        Cat cat = new Cat();
        cat.setAge(ageToChange);
        int actualAge = cat.getAge();
        assertEquals(actualAge, expectedAge, String.format("Expected age to be '%d'", expectedAge));
    }




    @Test(groups = "getMatrix")
    public void testGetMatrixShouldReturnRows(){
        System.out.println("TEST2");

        int expectedRowAmount = 5;
        int actualRowAmount = matrixRows.split("\n").length;
        assertEquals(actualRowAmount, expectedRowAmount);
    }
    @Test
    public void testGetMatrixReturnRowsLength() {
        System.out.println("TEST3");

        String rows[] = matrixRows.split("\n");
        for (String row: rows) {
            int expectedRowLength = 5;
            int actualRowLength = row.split(" ").length;
            assertEquals(expectedRowLength, actualRowLength);
            
        }
    }
    @Parameters({"age", "salary"})
    @Test
    public void xmlParams(@Optional("10") int age, @Optional("500") int salary) {
        System.out.printf("First '%d', second '%d'", age, salary);
    }




@DataProvider(name = "dp")
    public Object[][] provider() {
        return new Object[][] {
                {0, 0},
                {0, 0},
                {0, 0},


    };


    }






}
