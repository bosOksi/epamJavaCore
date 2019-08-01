package ClassesTypes;

public class StatefulClass{

    public static void calcEquation (double a, double b, double c) {
        double discriminant = getDiscriminant(a,b,c);
        if (discriminant >= 0) {
            double x1 = getFirstRoot(a, b, discriminant);
            double x2 = getSecondRoot(a, b, discriminant);
            printRoots(x1, x2);
        }
         else {
            printNoRoots();
        }
    }

    public static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double getFirstRoot(double a, double b, double discriminant){
        return (-b + Math.sqrt(discriminant)) / (2*a);
    }

    public static double getSecondRoot(double a, double b, double discriminant){
        return (-b - Math.sqrt(discriminant)) / (2*a);
    }

    public static void printRoots(double x1, double x2) {
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    public static void printNoRoots() {
        System.out.println("There are no real roots");
    }


    public static void main(String[] args) {
        calcEquation(1,3,2);
    }
}
