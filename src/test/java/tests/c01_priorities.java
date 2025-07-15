package tests;

import org.testng.annotations.Test;

public class c01_priorities {

    // If there is no priority given, tests are run alphabetically
    // If there is no priority it is 0 by default
    // Due to it depends on the minimal priority minus priorities runs earlier

    @Test (priority = 2)
    public void ztest01() {
        System.out.println("First Test");
    }

    @Test (priority = 3)
    public void test02() {
        System.out.println("Second Test");

    }

    @Test (priority = 1)
    public void test03() {
        System.out.println("Third Test");
    }

    @Test (priority = -1)
    public void test04() {
        System.out.println("Forth Test");
    }

    @Test
    public void test05() {
        System.out.println("Fifth Test");
    }

}
