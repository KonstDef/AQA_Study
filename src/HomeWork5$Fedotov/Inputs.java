package HomeWork5$Fedotov;

import HomeWork5$Fedotov.Exceptions.*;

import java.util.Random;
import java.util.Scanner;

enum Inputs {
    CORRECT {
        boolean enter() {
            Random random = new Random();
            String legalCharactersList = "0123456789_qwertyuiopasdfghjklzxcvbnm" + "qwertyuiopasdfghjklzxcvbnm".toUpperCase(); //used to generate password
            int randomLength;

            String login = "login";
            randomLength = random.nextInt(15) + 1;
            for (int i = 0; i < randomLength; i++) {//random password generator
                int character = random.nextInt(legalCharactersList.length());
                login += legalCharactersList.charAt(character);
            }

            String password = "u";
            randomLength = random.nextInt(17) + 3;
            for (int i = 0; i < randomLength; i++) {//random password generator
                int character = random.nextInt(legalCharactersList.length());
                password += legalCharactersList.charAt(character);
            }

            System.out.printf("Correct login %s with %s password generated.\n", login, password);
            System.out.println("Trying to login with correct username and password.");

            return login(login, password, password);
        }
    },
    INCORRECT {
        boolean enter() {
            Random random = new Random();
            String legalCharactersList = "0123456789_qwertyuiopasdfghjklzxcvbnm" + "qwertyuiopasdfghjklzxcvbnm".toUpperCase(); //used to generate password
            String illegalCharactersList = "!@#$%^&*()-абвгдеёжзитд"; //used to generate password
            int randomLength;

            String login = "login";
            randomLength = random.nextInt(17) + 1;
            for (int i = 0; i < randomLength; i++) {//random password generator
                int character = random.nextInt(legalCharactersList.length());
                login += legalCharactersList.charAt(character);
            }
            randomLength = random.nextInt(8) + 1;
            for (int i = 0; i < randomLength; i++) {//random password generator
                int character = random.nextInt(illegalCharactersList.length());
                login += illegalCharactersList.charAt(character);
            }

            String password = "u";
            randomLength = random.nextInt(20) + 1;
            for (int i = 0; i < randomLength; i++) {//random password generator
                int character = random.nextInt(legalCharactersList.length());
                password += legalCharactersList.charAt(character);
            }
            randomLength = random.nextInt(8) + 1;
            for (int i = 0; i < randomLength; i++) {//random password generator
                int character = random.nextInt(illegalCharactersList.length());
                password += illegalCharactersList.charAt(character);
            }

            System.out.printf("Incorrect login %s with %s generated.\n", login, password);
            System.out.println("Trying to login with incorrect username and password.");

            return login(login, password, "incorrect");
        }
    },
    USER {
        boolean enter() {
            System.out.println("User input:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter login: ");
            String login = scanner.nextLine();
            System.out.print("Please password: ");
            String password = scanner.nextLine();
            System.out.print("Please reenter password: ");
            String passwordConfirm = scanner.nextLine();

            return login(login, password, passwordConfirm);
        }
    };

    abstract boolean enter();

    boolean login(String login, String password, String confirmPassword) {
        String passwordException = "";  //empty string required to construct an overall error message
        String loginException = "";     //empty string required to construct an overall error message
        final String legal = "0123456789_qwertyuiopasdfghjklzxcvbnm" + "qwertyuiopasdfghjklzxcvbnm".toUpperCase();//string with legal chars

        //checks login bounds and adds the message to exception
        if (login.length() < 5) loginException += "\n* Login is too short, minimal length is 5 symbols";
        else if (login.length() >= 20) loginException += "\n* Login is too long, maximal length is 19 symbols";

        String buffer = "";
        for (int i = 0; i < login.length(); i++) {
            char c = login.charAt(i);
            if (legal.lastIndexOf(c) == -1 && buffer.lastIndexOf(c) == -1)  //checks if char is presented in legal string and if it was not added before
                buffer += login.charAt(i);
            if (i == 0 && legal.substring(11).lastIndexOf(c) == -1) //cuts legal string and compares first char to it
                loginException += "\n* Login is not started with latin character";
        }
        if (!buffer.equals("")) {
            String buffer2 = "";
            for (int i = 0; i < buffer.length(); i++) {
                buffer2 += buffer.charAt(i);
                if (i != buffer.length() - 1) buffer2 += ",";
            }//adds "," between illegal symbols
            loginException += "\n* Login contains illegal symbols:" + buffer2;
        }//adds "," between illegal symbols

        //checks password bounds and adds the message to exception
        if (password.length() < 5) passwordException += "\n* Password is too short, minimal length is 5 symbols";
        else if (password.length() >= 20) passwordException += "\n* Password is too long, maximal length is 19 symbols";

        buffer = "";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (legal.lastIndexOf(c) == -1 && buffer.lastIndexOf(c) == -1) //checks if char is presented in legal string and if it was not added before
                buffer += password.charAt(i);
        }
        if (!buffer.equals("")) {
            String buffer2 = "";
            for (int i = 0; i < buffer.length(); i++) {
                buffer2 += buffer.charAt(i);
                if (i != buffer.length() - 1) buffer2 += ",";
            }//adds "," between illegal symbols
            passwordException += "\n* Password contains illegal symbols:" + buffer2;
        }//adds "," between illegal symbols

        //checks that confirmed password are equal to the password
        if (!password.equals(confirmPassword)) passwordException += "\n* Confirmed password is not equal to password";

        //try catch block that prints message for login then for password
        Random random = new Random();
        int rnd = random.nextInt(3);

        switch (rnd) {
            case 0:
                try {
                    try {
                        if (!loginException.equals("")) throw new WrongLoginException(loginException);
                    } catch (WrongLoginException loginException1) {
                        System.out.println(loginException1.getMessage());
                    }
                    if (!passwordException.equals("")) throw new WrongPasswordException(passwordException);
                } catch (WrongPasswordException passwordException1) {
                    System.out.println(passwordException1.getMessage());
                }
                break;

            case 1:
                try {
                    if (!passwordException.equals("")) throw new WrongPasswordException(passwordException);
                } catch (WrongPasswordException passwordException1) {
                    System.out.println(passwordException1.getMessage());
                } finally {
                    try {
                        if (!loginException.equals("")) throw new WrongLoginException(loginException);
                    } catch (WrongLoginException loginException1) {
                        System.out.println(loginException1.getMessage());
                    }
                }
                break;

            case 2:
                try {
                    if (!loginException.equals("")) throw new WrongLoginException(loginException);
                    if (!passwordException.equals("")) throw new WrongPasswordException(passwordException);
                } catch (WrongLoginException loginException1) {
                    System.out.println(loginException1.getMessage());
                    try {
                        if (!passwordException.equals("")) throw new WrongPasswordException(passwordException);
                    } catch (WrongPasswordException passwordException1) {
                        System.out.println(passwordException1.getMessage());
                    }
                } catch (WrongPasswordException passwordException1) {
                    System.out.println(passwordException1.getMessage());
                }
                break;
        }


        //exits method if message strings are not empty
        if (!loginException.equals("") || !passwordException.equals("")) return false;

        System.out.printf("User %s with %s password logged in successfully!\n", login, password);
        return true;
    }
}