package Lesson9.dog;

public class Dog {
    String name;
    boolean isCollarPutOn = false;
    boolean isLeashPutOn = false;
    boolean isMuzzlePutOn = false;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Collar putted on!");
        isCollarPutOn = !isCollarPutOn;
    }

    public void putLeash() {
        System.out.println("Leash putted on!");
        isLeashPutOn = !isLeashPutOn;
    }

    public void putMuzzle() {
        System.out.println("Muzzle putted on!");
        isMuzzlePutOn = !isMuzzlePutOn;
    }

    public void walk() throws DogIsNotReadyException {
        if (isMuzzlePutOn && isCollarPutOn && isLeashPutOn) {
            System.out.printf("Huray! We can go for a walk! %s runs and barks!\n", name);
        } else {
            throw new DogIsNotReadyException("Dog " + name + "is not ready for a walk, check equipment again.");
        }
    }
}
