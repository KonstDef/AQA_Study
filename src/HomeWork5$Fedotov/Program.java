package HomeWork5$Fedotov;

import static HomeWork5$Fedotov.Inputs.*;

public class Program {
    public static void main(String[] args) {
        //testing user login
        test("Incorrect user logging", !INCORRECT.enter());         //negative check
        test("Correct user logging", CORRECT.enter());              //positive check
        test("User input user logging", USER.enter());              //manual negative test
    }

    protected static void test(String s, boolean b) {
        System.out.println((b ? "\u2713" : "\u2717") + "   " + s + " was " + (b ? "" : "not ") + "successful!\n");
    }
}