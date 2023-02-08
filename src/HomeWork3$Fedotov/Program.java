package HomeWork3$Fedotov;

public class Program {
    public static void main(String[] args) {
        Transport transport;

        System.out.println("******Легковой Автомобиль, допустим, перевозка крови, информация о расходе топлива*****");
        Typeable emergType = new Wheels("VW",
                "2.0 TDI",
                170,
                200,
                "diesel",
                60,
                10.5,
                1,
                3,
                new double[]{2, 1.5, 1.5},
                new double[]{1.800, 2.000},4,"City");
        Usable emergUsage = new Emergency();
        transport = new Transport(emergType,emergUsage);

        transport.info();
        transport.use();
        transport.infoTime(24);
        System.out.println("*******\n");

        System.out.println("******Грузовая баржа, загружается больше своей вместительности, переплывает Атлантический океан и разгружает трюм*****");
        Typeable cargoType = new Rowing("\"Cheresino\" Barge",
                "Four-cycle",
                2100,
                23.15,
                "diesel",
                600,
                12,
                10,
                10,
                new double[]{30.48, 8.84, 4.61},
                new double[]{4000, 8000},4,"Ocean");
        Usable cargoUsage = new Cargo(8000);
        transport = new Transport(cargoType,cargoUsage);

        transport.info();
        transport.fillUp();
        transport.addPilots(10);
        transport.load(2000);
        transport.load(12000);
        transport.start();
        transport.speedUp(23.15);
        transport.ride(4000);
        transport.unload(10000);
        transport.status();
        System.out.println("*******\n");

        System.out.println("******Пасажирский самолёт, загружается лишними пилотами и пассажирами, подсчитывает мин. цену билетов*****");
        Typeable pasType = new Reaction("Embraer",
                "Turbojet GE",
                110000,
                890,
                "aviation",
                58500,
                1500,
                2,
                78,
                new double[]{29.90, 26, 9.67},
                new double[]{21137, 37200},"air","Troposphere");
        Usable pasUsage = new Public(100,true);
        transport = new Transport(pasType,pasUsage);

        transport.info();
        transport.addPilots(3);
        transport.addPassengers(80);
        transport.use();
        transport.status();
        System.out.println("*******\n");

        System.out.println("******Боевой дирижабль с системой катапультирования, заряжается, летит, сбрасывает бомбу, пилоты катапультируются*****");
        Typeable milType = new HotAir("Kirov",
                "KIR",
                9000,
                100,
                "technical ethanol",
                40000,
                500,
                10,
                5,
                new double[]{20, 10, 50},
                new double[]{7500, 9000},true,"Troposphere");
        Usable milUsage = new Military(10,true,new String[]{"BOR-57 Bomb","1000"});
        transport = new Transport(milType,milUsage);

        transport.rideUp();
        transport.speedUp(100);
        transport.ride(100,20);
        transport.use();
        transport.loadAmmo(500);
        transport.fire(501);
        transport.catapult();
        transport.status();
        System.out.println("*******\n");
    }
}
