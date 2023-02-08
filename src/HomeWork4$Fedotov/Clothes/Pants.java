package HomeWork4$Fedotov.Clothes;

interface Pants {
    default void putOn() {
        System.out.println("puts on pants;");
    }

    default void putOff() {
        System.out.println("puts off pants;");
    }
}

class Shorts implements Pants {
    private final String adjective;

    public Shorts(String adjective) {
        this.adjective = " " + adjective;//extra " " added to support case of empty adjective
    }

    public Shorts() {
        this.adjective = "";//resolves null problem
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s shorts;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s shorts;\n", adjective);
    }
}

class Jeans implements Pants {
    private final String adjective;

    public Jeans(String adjective) {
        this.adjective = " " + adjective;
    }

    public Jeans() {
        this.adjective = "";
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s jeans;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s jeans;\n", adjective);
    }
}

class Trousers implements Pants {
    private final String adjective;

    public Trousers(String adjective) {
        this.adjective = " " + adjective;
    }

    public Trousers() {
        this.adjective = "";
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s trousers;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s trousers;\n", adjective);
    }
}
