package HomeWork3$Fedotov;

class Transport implements Typeable,Usable{
    Typeable tT;
    Usable tU;

    public void info(){
        System.out.println("Main info:");
        System.out.printf("%s\n%s\n%s\n%s\n%s\n",infoEngine(),infoFuel(),infoDimensions(),infoPilots(),infoEnv());
        System.out.print(tT.getName()+" ");
        tU.usage();
    }
    public void status(){
        System.out.println();
        tT.status();
        System.out.print(tT.getName()+" ");
        tU.status();
    }
    public Transport(Typeable tT, Usable tU){
        this.tT = tT;
        this.tU = tU;
    }

    public void rideUp(){
        tT.fillUp();
        tT.pilotsUp();
        tT.passengersUp();
        tT.start();
    }

    @Override
    public String infoEngine() {
        return tT.infoEngine();
    }
    public String infoFuel() {
        return tT.infoFuel();
    }
    public String infoDimensions() {
        return tT.infoDimensions();
    }
    public String infoPilots() {
        return tT.infoPilots();
    }
    public String infoEnv() {
        return tT.infoEnv();
    }

    public void start() {
        tT.start();
    }
    public void stop() {
        tT.stop();
    }
    public void ride(double distance) {
        tT.ride(distance);
    }
    public void ride(double distance, double height) {
        tT.ride(distance,height);
    }
    public void speedUp(double speed) {
        tT.speedUp(speed);
    }
    public void fill(double fuel) {
        tT.fill(fuel);
    }
    public void fillUp() {
        tT.fillUp();
    }
    public int addPilots(int pilots) {
        pilots=tT.addPilots(pilots);
        tU.addPassengers(pilots);
        return 0;
    }
    public int addPassengers(int passengers) {
        passengers=tT.addPassengers(passengers);
        tU.addPassengers(passengers);
        return 0;
    }
    public double load(double weight) {
        if(weight==0) {
            System.out.println("0 value is not supported for loading or unloading!");
        } else if(weight<0) weight=-weight;
        weight=tT.load(weight);
        if(weight!=0) tU.load(weight);
        return 0;
    }
    public double unload(double weight) {
        if(weight==0) {
            System.out.println("0 value is not supported for loading or unloading!");
        } else if(weight>0) weight=-weight;
        weight=tU.unload(weight);
        if(weight!=0) tT.unload(weight);
        return 0;
    }
    public void freeSpace() {
        tT.freeSpace();
    }
    public void infoTime(double time){
        tT.infoTime(time);
    }
    public void usage() {
        System.out.print(tT.getName()+" ");
        tU.usage();
    }
    public void use() {
        System.out.print(tT.getName()+" ");
        tU.use();
    }
    public void loadAmmo(int ammo){
        System.out.print(tT.getName()+" ");
        tU.loadAmmo(ammo);
    }
    public boolean catapult(){
        System.out.printf("%s ",tT.getName());
        if(tU.catapult()) tT.setPilots(0);
        return false;
    }
    public void fire(int i){
        System.out.printf("%s ",tT.getName());
        tU.fire(i);
    }
    public void evacuate(){tT.evacuate();}
}