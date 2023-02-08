package HomeWork4$Fedotov.Clothes;

class Human {
    final private String name;
    Coat coat;
    Pants pants;
    Shoes shoes;

    private boolean dressed = false; //default state is undressed

    Human(String name) {
        this.name = name;
    }

    Human(String name, Coat coat, Pants pants, Shoes shoes) {
        this.name = name;
        this.coat = coat;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void putOn() {
        if (dressed) {
            System.out.printf("%s is already undressed.\n", this.name);
            return;
        }//checks if dressed, if yes - exits method and prints message

        System.out.printf("%s ", this.name);//"Name " does...
        if (pants == null) System.out.println("has no pants to put on;");//message for a case class is not initialized
        else pants.putOn();//calls shoes interface method


        System.out.printf("%s ", this.name);
        if (shoes == null) System.out.println("has no shoes to put on;");
        else shoes.putOn();


        System.out.printf("%s ", this.name);
        if (coat == null) System.out.println("has no coat to put on;");
        else coat.putOn();

        dressed = !dressed;//changes undressed state to dressed
    }

    public void putOff() {
        if (!dressed) {
            System.out.printf("%s is already undressed.\n", this.name);
            return;
        }//checks if undressed, if yes - exits method and prints message

        System.out.printf("%s ", this.name);//"Name " does...
        if (coat == null) System.out.println("has no coat to put off;");//message for a case class is not initialized
        else coat.putOff();//calls shoes interface method

        System.out.printf("%s ", this.name);
        if (shoes == null) System.out.println("has no shoes to put off;");
        else shoes.putOff();

        System.out.printf("%s ", this.name);
        if (pants == null) System.out.println("has no pants to put off;");
        else pants.putOff();

        dressed = !dressed;//changes dressed state to undressed
    }
}
