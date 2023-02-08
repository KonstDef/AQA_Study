package HomeWork4$Fedotov.SpaceProgram;

import java.util.Random;

class Spaceplane implements IStart {
    Random random = new Random();
    String name;

    public Spaceplane(){}
    public Spaceplane(String name){
        this.name = name;
    }

    @Override
    public boolean canStart() {
        for (int i = 0; i < 3; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    return false;
                default:
                    break;
            }
        }
        return true;
    }

    public void startEngine() {
        System.out.printf("->%s engines are started. All systems are nominal.\n",toString());
    }

    public void launch() {
        System.out.printf("->%s launched.\n",toString());
    }

    public String toString() {
        if(name!=null) return "Spaceplane "+"\""+name+"\"";
        else return "Spaceplane";
    }
}
