package OOPS;

public class MathClassDemo {
    public static void main(String[] args) {

        int a = -10;
        int b = 20;
        double x = 2.5;
        double y = 3.7;
        double angleDegrees = 45;

        System.out.println("abs(-10): " + Math.abs(a));
        System.out.println("max(-10, 20): " + Math.max(a, b));
        System.out.println("min(-10, 20): " + Math.min(a, b));
        System.out.println("sqrt(25): " + Math.sqrt(25));
        System.out.println("pow(2, 3): " + Math.pow(2, 3));
        System.out.println("cbrt(27): " + Math.cbrt(27));
        System.out.println("exp(1): " + Math.exp(1)); // e^1
        System.out.println("log(10): " + Math.log(10)); // ln(10)
        System.out.println("log10(1000): " + Math.log10(1000));
        System.out.println("round(2.5): " + Math.round(x));
        System.out.println("ceil(2.5): " + Math.ceil(x));
        System.out.println("floor(2.5): " + Math.floor(x));
        System.out.println("random(): " + Math.random());
        System.out.println("sin(45 degrees): " + Math.sin(Math.toRadians(angleDegrees)));
        System.out.println("cos(45 degrees): " + Math.cos(Math.toRadians(angleDegrees)));
        System.out.println("tan(45 degrees): " + Math.tan(Math.toRadians(angleDegrees)));
        System.out.println("toRadians(180): " + Math.toRadians(180));
        System.out.println("toDegrees(π): " + Math.toDegrees(Math.PI));
        System.out.println("signum(-5): " + Math.signum(-5));
        System.out.println("signum(0): " + Math.signum(0));
        System.out.println("signum(5): " + Math.signum(5));
        System.out.println("copySign(3.5, -1.0): " + Math.copySign(3.5, -1.0));
    }
}
