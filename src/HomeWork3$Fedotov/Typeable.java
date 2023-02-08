package HomeWork3$Fedotov;

public interface Typeable {

    String infoEngine();

    String infoFuel();

    String infoDimensions();

     String infoPilots();
    default String infoEnv(){
        return "";
    }

    default String getName(){
        return "This transport is not yet defined!";
    }
    default void status(){
        System.out.println("Transport not made yet");
    }

    default void start() {
        System.out.println("Your transport have no engine.");
    }

    default void stop() {
        System.out.println("Your transport have no engine.");
    }

    default void ride(double distance) {
        System.out.println("You cant ride.");
    }

    default void ride(double distance, double height) {
        System.out.println("Your transport is not verticaly maneuvrable.");
    }

    default void speedUp(double speed) {
        System.out.println("You cant speed up.");
    }

    default void fill(double fuel) {
        System.out.println("You cant fill your transport with fuel.");
    }

    default void fillUp() {
        System.out.println("You cant fill your transport with fuel.");
    }

    default int addPilots(int pilots) {
        System.out.println("You cant place pilots in your transport.");
        return 0;
    }
    default void pilotsUp(){
        System.out.println("There is no room for pilots!");
    }

    default int addPassengers(int passengers) {
        System.out.println("You cant place passengers in your transport.");
        return 0;
    }
    default void passengersUp(){
        System.out.println("There is no room for passengers!");
    }

    default double load(double weight) {
        System.out.println("You cant load cargo in your transport.");
        return weight;
    }

    default double unload(double weight) {
        System.out.println("You cant unload cargo in your transport.");
        return weight;
    }

    default void freeSpace() {
        System.out.println("There is no free space in your transport.");
    }

    default void infoTime(double time){
        System.out.println("This method is not supported by transport. Try it for Wheel");
    }
    default void evacuate(){
        System.out.println("There is no one to evacuate.");}

    default void setPilots(int pilots){}
}

abstract class TransportType implements Typeable {
    public String name; //(name of transport)

    private String engine; //(engine transport works on)
    private double power; //(engine power)
    private double maxSpeed; //(speed transport can travel)
    private boolean started;

    private String fuelType; //(fuel transport requires)
    private double fuelMax;
    private double consumption; //(fuel consumption)

    private int pilotsMax; //(num of people required for piloting)
    private int passengersMax; //(num of passengers it holds)

    private double[] dimensions = new double[3]; //(introduces transport dimension)
    private double[] tonnage = new double[2]; //(introduces transport free weight + full)

    private double fuel;
    private int pilots;
    private int passengers;
    private double speed;
    private double cargo;
    private double milleage=0;

    //getters
    public String getName(){
        return this.name;
    }
    public String getEngine() {
        return engine;
    }

    public double getPower() {
        return power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isStarted() {
        return started;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelMax() {
        return fuelMax;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getPilotsMax() {
        return pilotsMax;
    }

    public int getPassengersMax() {
        return passengersMax;
    }

    public double[] getDimensions() {
        return dimensions;
    }

    public double[] getTonnage() {
        return tonnage;
    }

    public double getFreeTonnage() {
        return tonnage[1] - tonnage[0];
    }

    public double getFuel() {
        return fuel;
    }

    public int getPilots() {
        return pilots;
    }

    public int getPassengers() {
        return passengers;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCargo() {
        return cargo;
    }
    public double getMilleage(){return milleage;}

    //setters
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setPilots(int pilots) {
        this.pilots = pilots;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
    public void setMilleage(double milleage){this.milleage+=milleage;}

    public TransportType(String name,
                         String engine,
                         double power,
                         double maxSpeed,
                         String fuelType,
                         double fuelMax,
                         double consumption,
                         int pilotsMax,
                         int passengersMax,
                         double[] dimensions,
                         double[] tonnage) {
        this.name = name;

        this.engine = engine;
        this.power = power;
        this.maxSpeed = maxSpeed;

        this.fuelType = fuelType;
        this.fuelMax = fuelMax;
        this.consumption = consumption;

        this.pilotsMax = pilotsMax;
        this.passengersMax = passengersMax;

        System.arraycopy(dimensions, 0, this.dimensions, 0, dimensions.length);
        System.arraycopy(tonnage, 0, this.tonnage, 0, tonnage.length);
    }

    private double toKw(){
        return 0.74*power;
    }
    public String infoEngine() {
        return name + " has " + power + " hp ("+toKw()+" kW) \"" + engine + "\" engine with " + maxSpeed + " km/h maximum speed.";
    }

    public String infoFuel() {
        return name + " works on " + fuelType +" fuel "+ (fuelMax != 0
                ? ("with " + fuelMax + " l tank and " + consumption + " l/100km consumption.")
                : "which is \"eternal.\"");
    }

    public String infoDimensions() {
        return name + " is " + dimensions[0] + "x" + dimensions[1] + "x" + dimensions[2] + " m big and has " + tonnage[0] + "/" + tonnage[1] + " t. tonnage.";
    }

    public String infoPilots() {
        return name + " requires " + pilotsMax + " pilots and may have up to " + passengersMax + " additional passengers.";
    }

    public void status(){
        System.out.printf("\t%s\nSpeed:%s/%s\nFuel:%s/%s\nCargo:%s/%s\nPilots:%s/%s\nPassengers:%s/%s\nMilleage:%.2f\n",
                name,speed,maxSpeed,fuel,fuelMax,cargo,getFreeTonnage(),pilots,pilotsMax,passengers,passengersMax,milleage);
    }

    public void start() {
        if (isStarted()) {
            System.out.println("Engine is already started");
        } else {
            System.out.println("Engine is started");
            setStarted(true);
        }
    }

    public void stop() {
        if (!isStarted()) {
            System.out.println("Engine is already stopped");
        } else {
            setSpeed(0);
            System.out.println("Engine is stopped");
            setStarted(false);
        }
    }

    public void ride(double distance) {
        double fuelResult;
        double fuelUsed;

        if (getPilots() != getPilotsMax() && getPilotsMax() != 0) {
            System.out.printf("%s requires %d pilots to ride!\n", name, getPilotsMax());
        } else if (!isStarted()) {
            System.out.printf("%s is not started!\n",name);
        } else if (getFuel()==0&&getFuelMax()!=0) {
            System.out.printf("%s requires fuel to ride!\n",name);
        } else {
            if(getSpeed()==0){
                double speed;
                System.out.printf("%s raised speed to %.2f km/h\n",name,
                        (speed = (getMaxSpeed()>=60) ?60:getMaxSpeed()));
                setSpeed(speed);
            }
            fuelUsed = distance*(getConsumption()/100);
            if (fuelUsed>=getFuel()){
                fuelResult = fuelUsed = getFuel();
                distance = getFuel()/(getConsumption()/100);
                System.out.printf("%s is out of fuel.\n",name);
            } else {
                fuelResult = getFuel()-fuelUsed;
            }
            setFuel(fuelResult);
            setMilleage(distance);
            double time = distance /this.speed;
            System.out.printf("%s covered %.2f km and used %.2f fuel, %.2f h spent\n",name,distance,fuelUsed,time);
        }
    }

    public void speedUp(double speed) {
        double result = getSpeed() + speed;
        if (result > getMaxSpeed()) result = getMaxSpeed();
        if (result < 0) result = 0;

        if (result>getSpeed()) {
            System.out.printf("%s speed up to %.2f km/h\n", name, result);
        } else if (result == 0) {System.out.printf("%s stopped\n",name);}
        else if (result<getSpeed()) {
            System.out.printf("%s slow down to %.2f km/h\n", name, result);
        } else {
            System.out.printf("%s moves the same speed",name);
        }
        setSpeed(result);
    }

    public void fill(double fuel) {
        double result = getFuelMax() + fuel;
        double noSpace = 0;

        if (result > getFuelMax()) {
            noSpace = result - getFuelMax();
            result = getFuelMax();
        }
        if (result < 0) {
            noSpace = result;
            result = 0;
        }

        if (result>getFuel()) {
            System.out.printf("%s filled up to %.2f l\n", name, result);
        } else if (result == 0) {System.out.printf("%s fuel tank is empty\n",name);}
        else if (result<getFuel()) {
            System.out.printf("%s fuel level decreased to %.2f l\n", name, result);
        } else if (noSpace!=0){
            System.out.printf("%s fuel level not changed\n",name);
        }
        if (noSpace>0) System.out.printf("There was no space for %.2f l\n",noSpace);
        else if (noSpace<0) System.out.printf("There was no %.2f l more\n",noSpace);

        setFuel(result);
    }
    public void fillUp() {
        setFuel(getFuelMax());
        System.out.printf("%s fuel tank filled to max.\n",name);
    }

    public int addPilots(int pilots) {
        int result = getPilots() + pilots;
        int noSpace = 0;

        if (result > getPilotsMax()) {
            noSpace = result - getPilotsMax();
            result = getPilotsMax();
        } else if (result < 0) {
            noSpace = result;
            result = 0;
        }

        if (result>getPilots()) {
            System.out.printf("%s has %d pilots prepared now\n", name, result);
        } else if (result==0){
            System.out.printf("%s has no pilots\n",name);
        }else if (result==getPilots()&&noSpace!=0) {
            System.out.printf("%s has the same num. of pilot as before\n",name);
        }

        if (noSpace>0) {
            System.out.printf("There was no space for %d pilots, moved them to passengers\n",noSpace);
            pilots = noSpace;
            addPassengers(pilots);
        } else if (noSpace<0) System.out.printf("There was no %d pilots more\n",noSpace);
        else pilots=0;

        setPilots(result);
        return pilots;
    }
    public void pilotsUp(){
        pilots = pilotsMax;
        System.out.printf("%s pilots are ready!\n",name);
    }

    public int addPassengers(int passengers) {
        int result = getPassengers() + passengers;
        int noSpace = 0;

        if (result > getPassengersMax()) {
            noSpace = result - getPassengersMax();
            result = getPassengersMax();
        }
        if (result < 0) {
            noSpace = result;
            result = 0;
        }

        if (result>getPassengers()) {
            System.out.printf("%s has %d passengers prepared now\n", name, result);
        } else if (result == 0) {System.out.printf("%s has no passengers\n",name);}
        else if (result==getPassengers()&&noSpace!=0) {
            System.out.printf("%s has the same num. of passengers as before\n",name);
        }

        if (noSpace>0) System.out.printf("There was no space for %d passengers\n",noSpace);
        else if (noSpace<0) System.out.printf("There was no %d passengers more\n",noSpace);
        setPassengers(result);
        passengers=result;
        return passengers;
    }
    public void passengersUp(){
        passengers = passengersMax;
        System.out.printf("%s passengers are ready!\n",name);
    }

    public double load(double weight) {
        double cargoMax = getFreeTonnage();

        double result = getCargo() + weight;
        if(result>cargoMax){
            weight=result-cargoMax;
            result=cargoMax;
        } else weight=0;

        setCargo(result);
        System.out.printf("%s loaded to %.2f/%.2f\n",name,getCargo(),getFreeTonnage());
        if(weight!=0){
            System.out.printf("There was no space for %.2f t in %s\n",weight,name);
        }
        return weight;
    }
    public double unload(double weight) {
        double cargoMax = getFreeTonnage();

        double result = getCargo() + weight;
        if(result<0){
            weight=result;
            result=0;
        } else weight=0;

        setCargo(result);
        System.out.printf("%s unloaded to %.2f/%.2f\n",name,getCargo(),getFreeTonnage());
        if(weight!=0){
            System.out.printf("There was no %.2f t in %s\n",-weight,name);
        }
        return weight;
    }

    public void freeSpace() {
        double tone = getFreeTonnage() - getCargo();
        if (tone == 0) {
            System.out.println("There is no space for cargo!");
        } else {
            System.out.printf("There is space for %.2f kg.\n", tone);
        }
    }

    public void evacuate(){
        if(pilots>0){
            System.out.println("Pilots are evacuating.");
            pilots=0;
        } else {
            System.out.println("There are no pilots to evacuate.");
        }
        if(passengers>0){
            System.out.println("Passengers are evacuating.");
            passengers=0;
        } else{
            System.out.println("There are no passengers to evacuate.");
        }
    }
}

abstract class Land extends TransportType {

    private String[] areas;

    public Land(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax,
                double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage,
                String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage);
        this.areas = areas;
    }

    public String infoEnv() {
        String info;
        info = name + " can ride in ";
        for (String str : areas) {
            info += "("+str+")";
        }
        return info;
    }
}
abstract class Water extends TransportType {

    private String[] areas;

    public Water(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax,
                 double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage,
                 String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage);
        this.areas = areas;
    }

    public String infoEnv() {
        String info;
        info = name + " can swim in ";
        for (String str : areas) {
            info += "(" + str+")";
        }
        return info;
    }
}
abstract class Air extends TransportType {
    private String[] areas;
    private double height;

    public Air(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax,
               double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage,
               String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage);
        this.areas = areas;
    }

    public String infoEnv() {
        String info;
        info = name + " flies in ";
        for (String str : areas) {
            info += "(" + str+")";
        }
        return info;
    }

    public void ride(double distance, double height){
        super.ride(distance);

        double result = this.height+height;

        if (result>this.height)System.out.printf("%s raises to flight height: %.2f m\n",name,result);
        else if (result<this.height) {
            if(result>0) System.out.printf("%s bellowed to flight height: %.2f m\n",name,result);
            else{
                result=0;
                System.out.printf("%s lands",name);
            }
        } else System.out.printf("%s flights on same height: %.2f",name,result);
        this.height=result;
    }

    @Override
    public void status(){
        super.status();
        System.out.printf("Flight height: %.2f\n",height);
    }
}

class Track extends Land implements Typeable {
    boolean fastReparable;
    double trackDepth;

    public Track(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, boolean fastReparable, double trackDepth, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.fastReparable = fastReparable;
        this.trackDepth = trackDepth;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " with " + trackDepth + "m tracks that " + (fastReparable ? "can" : "can not") + " be repaired fast.";
    }
}
class Rails extends Land implements Typeable{
    double width;

    public Rails(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, double width, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.width = width;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " on " + width + "m rails.";
    }
}
class Cable extends Land implements Typeable{
    boolean suspended;

    public Cable(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, boolean suspended, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.suspended = suspended;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " on " + (suspended ? "suspended" : "grounded") + " cable.";
    }
}
class Wheels extends Land implements Typeable {
    int wheelsNum;

    public Wheels(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, int wheelsNum, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.wheelsNum = wheelsNum;
    }


    @Override
    public String infoEnv() {
        return super.infoEnv() + " on " + wheelsNum + " wheels.";
    }

    @Override
    public void infoTime(double time) {
        double distance = time*getMaxSpeed();
        double fuel = distance*getConsumption()/100;
        int stops = (int) (fuel/getFuelMax());

        System.out.printf("In %.2f h, %s could cover %.2f km and spend %.2f l of fuel (%d refuels) moving by its maximum speed (%.2f km/h).\n",
                time,name,distance,fuel,stops,getMaxSpeed());
    }
}

class Mast extends Water implements Typeable{
    int mastsNum;

    public Mast(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, int mastsNum, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.mastsNum = mastsNum;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " with " + mastsNum + " masts.";
    }
}
class Rowing extends Water implements Typeable{

    int propellerNum;

    public Rowing(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, int propellerNum, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.propellerNum = propellerNum;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " with " + propellerNum + " propellers.";
    }
}
class Floating extends Water implements Typeable{

    boolean submersible;
    private double depth;

    public Floating(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, boolean submersible, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.submersible = submersible;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " by floating and " + (submersible ? "can" : "can't") + " submerse.";
    }
    public void status(){
        super.status();
        System.out.printf("Depth of submersion: %.2f m\n",depth);
    }
    public void ride(double distance, double height){
        super.ride(distance);

        double result = this.depth+height;

        if (submersible){
        if (result>this.depth)System.out.printf("%s submerses to depth: %.2f m\n",name,result);
        else if (result<this.depth) {
            if(result>0) System.out.printf("%s raises to depth: %.2f m\n",name,result);
            else{
                result=0;
                System.out.printf("%s emerges",name);
            }
        } else System.out.printf("%s moves on same depth: %.2f",name,result);
        this.depth=result;
        } else System.out.printf("%s can not submerse",name);
    }

}

class Reaction extends Air implements Typeable{

    String reactMass;

    public Reaction(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, String reactMass, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.reactMass = reactMass;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " by expelling " + reactMass + ".";
    }
}
class Copter extends Air implements Typeable{

    int rotorNum;

    public Copter(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, int rotorNum, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.rotorNum = rotorNum;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " with " + rotorNum + "rotors.";
    }
}
class Planner extends Air implements Typeable{

    String startPoint;

    public Planner(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, String startPoint, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.startPoint = startPoint;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + " by planning from " + startPoint + "rotors.";
    }
}
class HotAir extends Air implements Typeable    {

    boolean controllable;

    public HotAir(String name, String engine, double power, double maxSpeed, String fuelType, double fuelMax, double consumption, int pilotsMax, int passengersMax, double[] dimensions, double[] tonnage, boolean controllable, String... areas) {
        super(name, engine, power, maxSpeed, fuelType, fuelMax, consumption, pilotsMax, passengersMax, dimensions, tonnage, areas);
        this.controllable = controllable;
    }

    @Override
    public String infoEnv() {
        return super.infoEnv() + ", elevated by hot air and " + (controllable ? "is" : "is not") + " controllable.";
    }
}