package HomeWork4$Fedotov.Clothes;

interface Shoes {
    default void putOn() {
        System.out.println("puts on shoes;");
    }

    default void putOff() {
        System.out.println("puts off shoes;");
    }
}

class Slippers implements Shoes {
    private final String adjective;

    public Slippers(String adjective) {
        this.adjective = " " + adjective;//extra " " added to support case of empty adjective
    }

    public Slippers() {
        this.adjective = "";//resolves null problem
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s slippers;\n", adjective);
    }

    public void putOff() {
        System.out.printf("puts off%s slippers;\n", adjective);
    }
}

class Trainers implements Shoes {
    private final String adjective;

    public Trainers(String adjective) {
        this.adjective = " " + adjective;
    }

    public Trainers() {
        this.adjective = "";
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s trainers and ties shoelaces;\n", adjective);
    }

    public void putOff() {
        System.out.printf("unties shoelaces and puts off%s trainers;\n", adjective);
    }
}

class Boots implements Shoes {
    private final String adjective;

    public Boots(String adjective) {
        this.adjective = " " + adjective;
    }

    public Boots() {
        this.adjective = "";
    }

    @Override
    public void putOn() {
        System.out.printf("puts on%s boots and ties shoelaces;\n", adjective);
    }

    public void putOff() {
        System.out.printf("unties shoelaces and puts off%s boots;\n", adjective);
    }
}