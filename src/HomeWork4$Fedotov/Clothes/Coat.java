package HomeWork4$Fedotov.Clothes;

interface Coat {
    default void putOn() {
        System.out.println("puts on coat;");
    }

    default void putOff() {
        System.out.println("puts off coat;");
    }

}

class Sleeveless implements Coat {
    private final String adjective;

    public Sleeveless(String adjective) {
        this.adjective = " " + adjective;//extra " " added to support case of empty adjective
    }

    public Sleeveless() {
        this.adjective = "";//resolves null problem
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s sleeveless coat;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s sleeveless coat;\n", adjective);
    }
}
class Rain implements Coat {
    private final String adjective;

    public Rain(String adjective) {
        this.adjective = " " + adjective;
    }

    public Rain() {
        this.adjective = "";
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s raincoat;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s raincoat;\n", adjective);
    }
}
class Down implements Coat {
    private final String adjective;

    public Down(String adjective) {
        this.adjective = " " + adjective;
    }

    public Down() {
        this.adjective = "";
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s down coat;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s down coat;\n", adjective);
    }
}
