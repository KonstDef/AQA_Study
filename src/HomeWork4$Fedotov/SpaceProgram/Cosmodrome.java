package HomeWork4$Fedotov.SpaceProgram;

class Cosmodrome {
    private static String onOrbit;//keeps all spacecrafts launched to orbit from all spaceports

    public static String getOnOrbit() {
        return onOrbit;
    }

    private void setOnOrbit(String onOrbit) {
        if (Cosmodrome.onOrbit != null) Cosmodrome.onOrbit += ", ";//adds ", " before each after first
        else Cosmodrome.onOrbit = "";//resolves "null" problem
        Cosmodrome.onOrbit += onOrbit;//adds spacecraft to line
    }

    public void launch(IStart is) {
        System.out.printf("Launching %s\n", is.toString());//prints spacecraft name for visualizations
        while (!is.canStart()) {
            System.out.println("->Prelaunch check failed: trying to fix problem!");//failed message
        }//while loop added to prevent the case prelaunch faile
        System.out.printf("->Prelaunch check passed: %s can launch.\n", is);//success message

        is.startEngine();
        for (int i = 10; i > 0; i--) {
            if (i != 1) System.out.print(i + ", ");
            else System.out.println(i + ".");
        }//countdown

        is.launch();
        setOnOrbit(is.toString()); //puts spacecraft on orbit
    }
}