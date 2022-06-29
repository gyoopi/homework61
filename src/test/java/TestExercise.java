import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestExercise {
    Main sut;

    @BeforeEach
    public void init(){
        System.out.println("test started");
        sut = new Main();
    }

    @BeforeAll
    public static void started(){
        System.out.println("TEST IN PROGRESS");
    }

    @AfterEach
    public static void finished(){
        System.out.println("test completed");
    }

    @AfterAll
    public static void end(){
        System.out.println("PASSED TEST");
    }

    // Checking age
    @Test
    public void testAgeCheck(){
        int a = 17;
        boolean expected = sut.ageCheck(a);
        assertFalse(expected);
    }

    // Checking toString
    @Test
    public void testToString(){
        User user = new User("labadu", "654321", 20);
        String expected =
                "Hello, labadu\n" +
                "we know your password 654321\n" +
                "your age is 20";
        Assertions.assertEquals(expected, user.toString());
    }
}
