package HomeWork4$Fedotov.SpaceProgram;

public class SpaceProgramm {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle("Rossi Quik");
        Spaceplane spaceplane = new Spaceplane("CSSHQ");
        RoboticSpacecraft roboticSpacecraft = new RoboticSpacecraft("SpaceX Dragon");

        System.out.println("---1---");
        cosmodrome.launch(shuttle);
        System.out.println("\n---2---");
        cosmodrome.launch(spaceplane);
        System.out.println("\n---3---");
        cosmodrome.launch(roboticSpacecraft);
        System.out.println();
        System.out.printf("There are: %s on orbit.", Cosmodrome.getOnOrbit());
    }
}

