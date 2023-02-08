package HomeWork4$Fedotov.Clothes;

public class Clothes {
    public static void main(String[] args) {
        Human human = new Human("Bob", new Sleeveless(), new Shorts(), new Slippers());
        human.putOn();
        System.out.println();
        human.putOff();
        System.out.println("++++++++++");
        human = new Human("Vasiliy", new Rain("Columbia"), new Jeans("Levis"), new Trainers("Abibas"));
        human.putOff();
        human.putOn();
        System.out.println();
        human.putOff();
        System.out.println("++++++++++");

        human = new Human("Teresa", new Down("warm"), new Trousers("classical"), new Boots("fashionable"));
        human.putOn();
        System.out.println();
        human.putOn();
        human.putOff();
        System.out.println("++++++++++");

        human = new Human("Jenkins");
        human.putOn();
        System.out.println();
        human.putOff();
    }
}


