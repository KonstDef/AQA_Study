package Lesson9.dog;

public class Prog {
    public static void main(String[] args) {
        Dog hafka = new Dog("Hafka");

        hafka.putLeash();
//        hafka.putMuzzle();
        hafka.putCollar();

        try {
            hafka.walk();
        } catch (DogIsNotReadyException dogIsNotReadyException) {
            System.out.println("For " + hafka.name + ": " + dogIsNotReadyException);
            System.out.printf("Checking equipment:\nColar: %s\nMuzzle: %s\nLeash: %s\n",
                    (hafka.isCollarPutOn?"+":"-"),(hafka.isMuzzlePutOn?"+":"-"),(hafka.isLeashPutOn?"+":"-"));
        }
    }
}
