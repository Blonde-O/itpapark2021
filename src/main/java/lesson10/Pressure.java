package lesson10;

public enum Pressure {
    BAR {
        public void action(double x) {
            System.out.printf( "%.2f атм \n", x *0.98692);
        }
    },
    ATM {
        public void action(double x) {
            System.out.printf("%.2f бар \n", x *1.01325);
        }
    };

    public abstract void action (double x);
}






