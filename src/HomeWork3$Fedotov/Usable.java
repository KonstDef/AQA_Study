package HomeWork3$Fedotov;

public interface Usable {
    default void usage() {
        System.out.println("does not have any special usage.");
    }

    default void use() {
        System.out.println("Just tell where to drive.");
    }

    default void loadAmmo(int ammo) {
        System.out.println("cant be loaded with ammo.");
    }

    default void status() {
    }

    default int addPassengers(int tT){return 0;}
    default double load(double weight){return weight;}
    default double unload(double weight){return weight;}
    default boolean catapult(){
        System.out.println("has no catapulting system.");
        return false;
    }
    default void fire(int i){System.out.println("has no weapons");}
}
class Usuall implements Usable{}

class Sport implements Usable {
    String sponsor;

    @Override
    public void usage() {
        System.out.println("This transport is used in sport.");
    }

    public void use() {
        System.out.printf("Sponsored by %s.\n", sponsor);
    }

    public void status() {
        use();
    }

    public Sport(String sponsor) {
        this.sponsor = sponsor;
    }
}

class Military implements Usable {
    private double armor;
    private boolean hasCatapult = false;
    Weapon[] weapons;

    public class Weapon {
        private String name;
        private int ammoMax;
        private int ammo = 0;

        public String getName() {
            return name;
        }

        public void setAmmoMax(int ammoMax) {
            this.ammoMax = ammoMax;
        }

        public void getAmmo() {
            System.out.printf("%s has %d/%d ammo.\n", name, ammo, ammoMax);
        }

        public void loadAmmo(int ammo) {
            int resultAmmo = this.ammo + ammo;

            if (resultAmmo > this.ammoMax) {
                resultAmmo = this.ammoMax;
            }
            this.ammo = resultAmmo;
            System.out.printf("loaded %s to %d ammo\n", name, resultAmmo);
        }
        public void fire(int ammo) {
            int result = this.ammo - ammo;

            if(this.ammo==0){
                System.out.printf("%s has no ammo to fire\n",name);
                return;
            }

            if(result>0){
                System.out.printf("%s fires %d ammo\n",name,ammo);
                this.ammo=result;
            }else {
                result=this.ammo;
                this.ammo=0;
                System.out.printf("%s fires %d ammo\n",name,result);
                System.out.printf("%s is out of ammo\n",name);
            }

        }
        public Weapon(String name, int ammoMax) {
            this.name = name;
            this.ammoMax = ammoMax;
        }

        public Weapon(String name, int ammoMax, int ammo) {
            this.name = name;
            this.ammoMax = ammoMax;
            this.ammo = ammo;
        }
    }

    public void getArmor() {
        System.out.printf("has %.2fcm thick armor.\n", armor);
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }


    public boolean catapult() {
        if (hasCatapult) {
            System.out.println("Pilots are catapulting!");
            return true;
        } else {
            System.out.println("There is no catapult system on this transport!");
            return false;
        }
    }

    public void loadAmmo(int ammo) {
        for (Weapon w : weapons) {
            w.loadAmmo(ammo);
        }
    }

    Military(double armor, String[]... weapons) {
        this.armor = armor;
        this.weapons = new Weapon[weapons.length];


        for (int i = 0; i < weapons.length; i++) {
            String name = weapons[i][0];

            int ammoMax;
            try {
                ammoMax = Integer.parseInt((weapons[i][1]));
            } catch (NumberFormatException e) {
                ammoMax = 0;
            }

            this.weapons[i] = new Weapon(name, ammoMax);
        }
    }

    Military(double armor, boolean hasCatapult, String[]... weapons) {
        this.armor = armor;
        this.hasCatapult = hasCatapult;
        this.weapons = new Weapon[weapons.length];

        for (int i = 0; i < weapons.length; i++) {
            String name = weapons[i][0];

            int ammoMax;
            try {
                ammoMax = Integer.parseInt(weapons[i][1]);
            } catch (NumberFormatException e) {
                ammoMax = 0;
            }

            this.weapons[i] = new Weapon(name, ammoMax);
        }
    }

    @Override
    public void usage() {
        System.out.println("is used in Military.");
    }
    public void use() {
        fire(1);
    }
    public void status() {
        System.out.printf("Armor: %.2f\n", armor);
        for (Weapon i : weapons) {
            System.out.printf("%s has %d/%d ammo.\n", i.name, i.ammo, i.ammoMax);
        }
    }
    public void fire(int ammo) {
        for(Weapon w : weapons){
            w.fire(ammo);
        }
    }

}

class Work implements Usable {
    public class Tool {
        private final String name;
        private final String usage;

        public String getName() {
            return name;
        }

        public void use() {
            System.out.printf("%s %s.\n", name, usage);
        }

        public Tool(String name, String usage) {
            this.name = name;
            this.usage = usage;
        }
    }

    Tool[] tools;

    Work(String[]... tools) {
        this.tools = new Tool[tools.length];
        for (int i = 0; i < tools.length; i++) {
            String name = tools[i][0];
            String usage = tools[i][1];
            this.tools[i] = new Tool(name, usage);
        }
    }

    @Override
    public void usage() {
        System.out.println("is used for work.");
    }

    public void use() {
        for (Tool i : tools) {
            i.use();
        }
    }

    public void status() {
        for (Tool i : tools) {
            System.out.printf("has %s that can %s.\n", i.name, i.usage);
        }
    }
}

class Emergency implements Usable {
    public boolean signals = false;

    @Override
    public void usage() {
        System.out.println("is used for emergency cases.\n");
    }
    public void use() {
        signals = !signals;
        System.out.printf("now %s priority on road!\n", (signals ? "has" : "has not"));
    }
    public void status(){
        System.out.printf("%s its priority now.\n",(signals?"Using":"Is not using"));
    }
}

class Habitable implements Usable {
    private int habitation;
    private int habitationLimit;

    @Override
    public void usage() {
        System.out.printf("is used to inhabit %d people.\n", habitationLimit);
    }

    public void use(int i) {
        if (i > habitationLimit) {
            System.out.printf("can inhabit only %d people!\n", habitationLimit);
        } else {
            System.out.printf("takes %d inhabitants.\n", i);
            habitation+=i;
        }
    }

    public Habitable(int habitation) {
        this.habitation = habitation;
    }
}

class Public implements Usable{
    int passengers;
    boolean business;
    double price;

    public Public(double price, boolean business){
        this.price = price;
        this.business = business;
    }

    public int addPassengers(int passengers){
        this.passengers = passengers;
        return 0;
    }
    @Override
    public void usage() {
        System.out.printf("transfers passengers (%.2f$) and %s business class (%.2f$)\n",price,(business?"has":"has not"),price*10);
    }
    public void use() {
        System.out.printf("passengers paid %.2f$\n",price*passengers);
    }
    public void status(){
        System.out.printf("%s business class\n",(business?"has":"has not"));
    }
}

class Cargo implements Usable{
    double hold;
    double holdMax;
    boolean attached;

    public Cargo(double holdMax){
        this.holdMax = holdMax;
    }
    @Override
    public void usage() {
        System.out.printf("has additional cargo hold for %.2f t\n",hold);
    }
    public void use() {
        attached=!attached;
        System.out.printf("additional cargo hold %s attached\n",(attached?"is":"is not"));
    }
    public void status(){
        System.out.printf("additional cargo hold %.2f/%.2f t.\n",hold,holdMax);
    }

    public double load(double weight){
        if(!attached) attached = true;

        double result = hold+weight;
        if(result>holdMax){
            weight=result-holdMax;
            result=holdMax;
        } else weight=0;

        hold=result;
        System.out.printf("Hold loaded to %.2f/%.2f\n",hold,holdMax);
        if(weight!=0){
            System.out.printf("There was no space for %.2f t in cargo hold\n",weight);
        }
        return weight;
    }

    public double unload(double weight){
        if(attached) attached = false;

        double result = hold+weight;
        if(result<0){
            weight=result;
            result=0;
        } else weight=0;

        hold=result;
        System.out.printf("Hold unloaded to %.2f/%.2f\n",hold,holdMax);
        if(weight!=0){
            System.out.printf("There was no %.2f t in cargo hold\n",-weight);
        }
        return weight;
    }
}
