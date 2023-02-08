package HomeWork4$Fedotov.SpaceProgram;

import java.util.Random;

class Shuttle implements IStart {
    Random random = new Random();
    String name;

    public Shuttle(){}//for the case user dont want to use name
    public Shuttle(String name){
        this.name = name;
    }//constructor with name

    @Override
    public boolean canStart() {
        int i = random.nextInt(11);
        return (i > 3);
    }//boolean spacecraft can launch or not

    public void startEngine() {
        System.out.printf("->%s engines are started. All systems are nominal.\n",toString());
    }

    public void launch() {
        System.out.printf("->%s launched.\n",toString());
    }

    public String toString() {
        if(name!=null) return "Shuttle "+"\""+name+"\"";//case spacecraft has name
        else return "Shuttle";//case spacecraft has its own name
    }
}
