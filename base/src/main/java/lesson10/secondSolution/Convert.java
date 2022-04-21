package lesson10.secondSolution;

public class Convert implements AnotherConvertable {
    private final Double[][] convertionArray =
            {{1.0, 0.987, 14.504, 750.06}, {1.013, 1.0, 14.696, 760.0},
             {0.069, 0.068, 1.0, 51.715}, {0.00133, 0.00132, 0.019, 1.0}};
    private final PressureSimple p1 = PressureSimple.BAR;
    private final PressureSimple p2 = PressureSimple.ATM;
    private final PressureSimple p3 = PressureSimple.PSI;
    private final PressureSimple p4 = PressureSimple.TORR;

    private final String name1;
    private final String name2;
    private double x;

    public Convert(String name1, String name2, double x) {
        this.name1 = name1;
        this.name2 = name2;
        this.x = x;
    }

    public void startConverting() {
        PressureSimple[] press = {p1, p2, p3, p4};
        int a = 0;
        int b = 0;
        System.out.printf("%.2f " + name1 + " = ", x);
        for (PressureSimple steps : press) {
            if (name1.equals(steps.name())) {
                a = steps.ordinal();
            }
            if (name2.equals(steps.name())) {
                b = steps.ordinal();
            }
        }
        x *= convertionArray[a][b];
        System.out.printf("%.2f " + name2 + " ", x);
    }
}
