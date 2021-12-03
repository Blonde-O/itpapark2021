package lesson10;

public enum Pressure {
    BAR {

        public void action(double x) {
            System.out.printf( "%.2f " + ATM.name()+ "\n", x *0.98692);
        }
    },
    ATM {
        public void action(double x) {
            System.out.printf("%.2f " + BAR.name()+ "\n", x *1.01325);
        }
    };

    public abstract void action (double x);
}






