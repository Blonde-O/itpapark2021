package lesson10.secondSolution;

public class Convert {
    private final Double[][] convertionArray = {{1.0, 0.987, 14.504}, {1.013, 1.0, 14.696}, {0.069, 0.068, 1.0}};
    private final PressureSimple p1 = PressureSimple.BAR;
    private final PressureSimple p2 = PressureSimple.ATM;
    private final PressureSimple p3 = PressureSimple.PSI;
    private final String name1;
    private final String name2;
    private double x;

    public Convert(String name1, String name2, double x) {
        this.name1 = name1;
        this.name2 = name2;
        this.x = x;
    }

    public void startConverting() {
        if (name1.equals("BAR") && name2.equals("PSI")) {
            System.out.print(x + " " + p1.name() + " = ");
            x *= convertionArray[p1.ordinal()][p3.ordinal()];
            System.out.printf("%.2f " + p3.name() + "", x);
        }
        if (name1.equals("BAR") && name2.equals("ATM")) {
            System.out.print(x + " " + p1.name() + " = ");
            x *= convertionArray[p1.ordinal()][p2.ordinal()];
            System.out.printf("%.2f " + p2.name() + "", x);
        }
        if (name1.equals("ATM") && name2.equals("PSI")) {
            System.out.print(x + " " + p2.name() + " = ");
            x *= convertionArray[p2.ordinal()][p3.ordinal()];
            System.out.printf("%.2f " + p3.name() + "", x);
        }
        if (name1.equals("ATM") && name2.equals("BAR")) {
            System.out.print(x + " " + p2.name() + " = ");
            x *= convertionArray[p2.ordinal()][p1.ordinal()];
            System.out.printf("%.2f " + p1.name() + "", x);
        }
        if (name1.equals("PSI") && name2.equals("ATM")) {
            System.out.print(x + " " + p3.name() + " = ");
            x *= convertionArray[p3.ordinal()][p2.ordinal()];
            System.out.printf("%.2f " + p2.name() + "", x);
        }
        if (name1.equals("PSI") && name2.equals("BAR")) {
            System.out.print(x + " " + p3.name() + " = ");
            x *= convertionArray[p3.ordinal()][p1.ordinal()];
            System.out.printf("%.2f " + p1.name() + "", x);
        }
    }
}
