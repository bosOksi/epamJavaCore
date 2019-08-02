package ClassesTypes;

public class StatefulClass{

    double a;
    double b;
    double c;
    double discriminant;
    double x1;
    double x2;

    public StatefulClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void calcEquation() {
        discriminant = getDiscriminant();

        if (discriminant >= 0) {
            x1 = getFirstRoot();
            x2 = getSecondRoot();
            printRoots();
        }
        else {
            printNoRoots();
        }
    }

    private double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    private double getFirstRoot(){
        return (-b + Math.sqrt(discriminant)) / (2*a);
    }

    private double getSecondRoot(){
        return (-b - Math.sqrt(discriminant)) / (2*a);
    }

    private void printRoots() {
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    private void printNoRoots() {
        System.out.println("There are no real roots");
    }


    public static void main(String[] args) {
        StatefulClass StatefulObject = new StatefulClass(1,3,2);
        StatefulObject.calcEquation();
    }
}

