package lesson10;

public enum Pressure {
    BAR {
        public void action(double x) {
            System.out.printf("%.2f " + ATM.name() + "; ", x * 0.98692);
            System.out.printf("%.2f " + PSI.name() + "\n", x * 14.504);
        }
    },
    ATM {
        public void action(double x) {
            System.out.printf("%.2f " + BAR.name() + "; ", x * 1.01325);
            System.out.printf("%.2f " + PSI.name() + "\n", x * 14.696);
        }
    },
    PSI {
        public void action(double x) {
            System.out.printf("%.2f " + ATM.name() + "; ", x * 0.068046);
            System.out.printf("%.2f " + BAR.name() + "\n", x * 0.068948);
        }
    };

    public abstract void action(double x);
}






