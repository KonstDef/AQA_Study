package HomeWork4$Fedotov.SpaceProgram;

import java.util.Random;

class RoboticSpacecraft implements IStart {
    Random random = new Random();
    String name;

    public RoboticSpacecraft(){}
    public RoboticSpacecraft(String name){
        this.name = name;
    }

    @Override
    public boolean canStart() {
        int rnd = random.nextInt(2) % 2;
        return !(rnd == 1);
    }

    public void startEngine() {
        System.out.printf("->%s engines are started. All systems are nominal.\n",toString());
    }

    public void launch() {
        System.out.printf("->%s launched.\n",toString());
    }

    public String toString() {
        if(name!=null) return "Robotic Spacecraft "+"\""+name+"\"";
        else return "Robotic Spacecraft";
    }
}
